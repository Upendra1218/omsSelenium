package baseClass;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.EmailException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import com.providio.utilities.reportToMail;

import data.TestData;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;



public class baseClass {
	SoftAssert soft = new SoftAssert();
	
	private static TestData TD = new TestData();
	protected static int originalBalance =0;
	protected static String creditCardNumber = "";

	// Create a random number generator.
	protected static Random random = new Random();
	// Create a SoftAssert instance
    protected static SoftAssert softAssert = new SoftAssert();


	
		
	public static WebDriver driver; // WebDriver instance
	public static Logger logger; // Logger instance

	// Flags for tracking test state
	protected static boolean isLoggedIn = false; // Flag indicating whether the user is logged in
	protected static boolean CheckoutProcessClick = false; // Flag indicating whether the checkout process was clicked
	protected static boolean isBrowserLaunched = false; // Flag indicating whether the browser is launched


	// ExtentReports and ExtentTest instances for reporting
	protected static ExtentReports report = new ExtentReports();
	private ExtentSparkReporter reporter = new ExtentSparkReporter(TD.Report);

	// Reporting
	// static ExtentReports report;
	protected static ExtentTest test;

	@BeforeSuite
	public void setUpforReport() throws Exception {
		// Create a new ExtentReports instance
	    report = new ExtentReports();
	    // Attach the ExtentSparkReporter to the ExtentReports
	    report.attachReporter(reporter);
	    
	}
	
	
	@BeforeClass()
	public void setUp() throws InterruptedException {
		
   	    // Initialize the logger with the name "FMG"
        logger = Logger.getLogger("Providio");
	    // Configure the logger using the "log4j.properties" file
	    PropertyConfigurator.configure("log4j.properties");
	}
	
	@BeforeMethod
	public void afterClass(Method method) {
		// Create a new ExtentTest with the name of the current test method
		test = report.createTest(method.getName());
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws InterruptedException {
	   
	    
	    // Taking a screenshot when an error occurs
	    if (result.getStatus() == ITestResult.FAILURE) {
	        // Log the name of the error
	        test.fail(result.getThrowable().getClass().getSimpleName());
	        
	        // Log the full error with code lines
	        test.fail(result.getThrowable());

	        // Taking a screenshot with the method name and storing it in a file
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String fileName = result.getMethod().getMethodName() + "_" + ".jpg";

	        try {
	            // Print a message indicating that a screenshot is taken
	            System.out.println("Screenshot taken for test case: " + result.getMethod().getMethodName());
	            
	            // Set the destination file for the screenshot
	            File destination = new File("./Screenshots/" + fileName);
	            
	            // Copy the screenshot from source to destination
	            FileUtils.copyFile(source, destination);
	            
	            // Get the absolute path of the screenshot
	            String screenshotPath = destination.getAbsolutePath();
	            logger.info(screenshotPath);	
	            // Attach the screenshot to the test report
	            test.fail("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());

	        } catch (IOException e) {
	            // Log an exception message if there's an issue with taking the screenshot
	            System.out.println("Exception while taking screenshot: " + e.getMessage());
	        }
	    }
	}
	
	@AfterClass
	public void afterclass() {

	    // Flush the ExtentReports to write the test information to the report
	    
	}


	
	@AfterSuite
	public void tearDown() throws IOException, EmailException, InterruptedException {
		// Change the view of the report to include DASHBOARD and TEST views
	    reporter.viewConfigurer().viewOrder().as(new ViewName[]{ViewName.DASHBOARD, ViewName.TEST}).apply();
	    
	    report.flush();
	    
	    // Navigate to the report URL in the WebDriver
	    driver.get(TD.Report);
	    
	    // Maximize the browser window
	    driver.manage().window().maximize();
	    
	    // Pause execution for 5000 milliseconds (5 seconds)
	    Thread.sleep(5000);
	    
	    // Take a screenshot of the entire browser window
	    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	    // Define the destination path for the screenshot
	    String screenshotPath = TD.ScreenShot;
	    
	    // Save the screenshot to the specified path
	    FileUtils.copyFile(screenshot, new File(screenshotPath));

	 // Collect all the assertions and report the results
        softAssert.assertAll();
	    // Close the WebDriver instance 
	    // driver.quit();
	    
	    // Send the report via email
	    reportToMail.Reporttomail();
	}
	
	   
	
}