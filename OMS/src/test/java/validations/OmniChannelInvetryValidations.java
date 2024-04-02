package validations;

import baseClass.baseClass;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class OmniChannelInvetryValidations extends baseClass{
	
private static final crmXpaths crm = new crmXpaths(driver);
	
	public static void VerifyOmniChannelInverntryClick() throws Exception {
	   test.info("Verify wheather the user is able to click on the Omni Channel Inventry on the side Menyu"); 
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getOmnichannelHeader()))) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the Omni Channel Inventry on the side Menu and Navigated to the Omni Channel Inventry Page ");
           logger.info("Successfully clicked on the Omni Channel Inventry on the side Menu and Navigated to the Omni Channel Inventry Page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       } 
	 }

}
