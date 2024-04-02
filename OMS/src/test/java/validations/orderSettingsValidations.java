package validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import baseClass.baseClass;
import functionality.Actionsss;
import functionality.Waits;

public class orderSettingsValidations extends baseClass{
	
	public static void VerifyOrderSettingClick() throws Exception {
		test.info("Verify wheather the user is able to click on the Order Settings on the side Menyu"); 
		Actionsss.SwitchingToIFrame();
		Wait<WebDriver> wait = Waits.createFluentWait(driver);
		// Call the waitForElementVisibility method and pass the locator 
		WebElement orderSettingsPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Order Settings']")));
       // Check if the actual alert text matches the expected text
       if (Actionsss.displayElement(orderSettingsPage)) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the Order Settings on the side Menu and Navigated to the Order Settings Page ");
           logger.info("Successfully clicked on the Order Settings on the side Menu and Navigated to the Order Settings Page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       }
       Actionsss.SwitchingToDefault();
	 }


}
