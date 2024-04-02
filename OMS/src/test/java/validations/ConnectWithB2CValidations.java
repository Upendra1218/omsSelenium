package validations;

import baseClass.baseClass;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class ConnectWithB2CValidations extends baseClass{
private static final crmXpaths crm = new crmXpaths(driver);
	
	public static void VerifyConnectWithB2CClick() throws Exception {
	   test.info("Verify wheather the user is able to click on the Connect with B2C on the side Menyu"); 
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getconnectB2cHeader()))) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the Connect with B2C on the side Menu and Navigated to the Connect with B2C Page ");
           logger.info("Successfully clicked on the Connect with B2C on the side Menu and Navigated to the Connect with B2C Page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       } 
	 }
}
