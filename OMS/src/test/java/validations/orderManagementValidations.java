package validations;

import baseClass.baseClass;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class orderManagementValidations extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);
	
	public static void VerifyOrderManagementClick() throws Exception {
	   test.info("Verify wheather the user is able to click on the Order Management on the side Menyu"); 
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getOrderManagementHeader()))) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the Order Management on the side Menu and Navigated to the Order Management Page ");
           logger.info("Successfully clicked on the Order Management on the side Menu and Navigated to the Order Management Page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       } 
	 }


}
