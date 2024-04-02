package browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import validations.browserValidation;

public class launchingforCCBrowser extends baseClass{
	private static TestData TD = new TestData();
	@Test
	public void VerifingCCLaunching() throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
	    driver = new ChromeDriver(co);
	    // Maximize the browser window
	    driver.manage().window().maximize();
	    // Delete all cookies in the browser session
	    driver.manage().deleteAllCookies();
         
		//launching the browser and passing the url into it
		 driver.get(TD.sandBoxURL);
		 browserValidation.validateBroweserlaunches(); 
		 
		
	}
	
	

}
