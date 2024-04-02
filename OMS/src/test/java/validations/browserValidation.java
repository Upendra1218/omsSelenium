package validations;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import baseClass.baseClass;
import functionality.Actionsss;
import functionality.Waits;
import pageObjects.loginPage;


public class browserValidation extends baseClass{
	private static final loginPage lp = new loginPage(driver);
	public static void validateBroweserlaunches() {
		test.info("Verify Home page launching");
		//Browser crashes
		if (isBrowserRunning()) {
			logger.info("Succesfully launched Browser and Loaded the HomePage"); 
			test.pass("Succesfully launched Browser and Loaded the HomePage");
			isBrowserLaunched = true;
        }else {
			logger.info("Browser launched Failed"); 
			test.fail("Browser launched Failed");
        }
	}
	
	//validate the browser is running or not
	   private static boolean isBrowserRunning() {
		   try {
		        driver.getTitle();

		        // Clear all cookies
		       // driver.manage().deleteAllCookies();
		        return true;
		    } catch (NoSuchWindowException e) {
		        return false;
		    } catch (Exception e) {
		        // Handle any other exceptions
		        return false;
		    }
	    }
	   
	   
	 public static void loginValidation() {
		 test.info("Verify wheather the user is able to login with valid credentials"); 
		Wait<WebDriver> wait = Waits.createFluentWait(driver);
		// Call the waitForElementVisibility method and pass the locator 
		WebElement mainDivLoginElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='brandBand_2']")));
		// Check if the element is displayed
		if (Actionsss.displayElement(mainDivLoginElement)) {
		    logger.info("Succesfully User is Logged into salesforce with valid credentials and Home page is loaded succesfully");
		    test.pass("Succesfully User is Logged into salesforce with valid credentials and Home page is loaded succesfully");
		    isLoggedIn = true;
		} else {
		    logger.info("Element is not visible.");
		}
	 }

}
