package validations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import baseClass.baseClass;
import functionality.Actionsss;
import functionality.Waits;

public class currenyValidations extends baseClass{
	
	public static void VerifyeditbuttonClick() throws Exception {
		test.info("Verify wheather the user is able to click on the edit button the company information page"); 
		Actionsss.SwitchingToIFrame();
		Wait<WebDriver> wait = Waits.createFluentWait(driver);
		// Call the waitForElementVisibility method and pass the locator 
		WebElement orgEdition = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Use the form below to edit your organization profile.']")));
		String actualAddToCart = orgEdition.getText();
		logger.info(actualAddToCart);
       // Expected alert text
       String expectedAddToCart = "Use the form below to edit your organization profile.";
       // Check if the actual alert text matches the expected text
       if (actualAddToCart.equals(expectedAddToCart)) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the edit button on the company information, and Navigated to the Organization edit page ");
           logger.info("Successfully clicked on the edit button on the company information, and Navigated to the Organization edit page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       }
       Actionsss.SwitchingToDefault();
	 
	 }

}
