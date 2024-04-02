package validations;

import baseClass.baseClass;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class ProductFamailyValidations extends baseClass{
	
private static final crmXpaths crm = new crmXpaths(driver);
	public static void VerifyObjecmanagerClick() throws Exception {
	   test.info("Verify wheather the user is able to click on the Object Manager on the Home page"); 
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getOM_Header()))) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the Object Manager on the Home page and Navigated to the Object Manager Page ");
           logger.info("Successfully clicked on the Object Manager on the Home page and Navigated to the Object Manager Page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       } 
	 }

	public static void VerifyProductClick() throws Exception {
		   test.info("Verify wheather the user is able to click on the Product on the Object Manager page"); 
	       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getproduct_Header()))) {
	           // Success message is displayed
	       	   test.pass("Successfully clicked on the Project on the Object Manager page and Navigated to the Product Page ");
	           logger.info("Successfully clicked on the Project on the Object Manager page and Navigated to the Product Page ");
	           // Perform actions or assertions here for the success case
	       } else {
	    	   logger.info("Element is not visible.");
	       } 
	}
	
	public static void VerifyFieldandReloationsClick() throws Exception {
		   test.info("Verify wheather the user is able to click on the FieldandReloations on the product page"); 
	       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getproduct_FR()))) {
	           // Success message is displayed
	       	   test.pass("Successfully clicked on the FieldandReloations on the product page and Navigated to the FieldandReloations Page ");
	           logger.info("Successfully clicked on the FieldandReloations on the product page and Navigated to the FieldandReloations Page ");
	           // Perform actions or assertions here for the success case
	       } else {
	    	   logger.info("Element is not visible.");
	       } 
	}
	
	public static void VerifyNewPicklistClick() throws Exception {
		   test.info("Verify wheather the user is able to click on the product family on the product family and edit page page"); 
		   Actionsss.SwitchingToIFrame();
	       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getproduct_FH()))) {
	           // Success message is displayed
	       	   test.pass("Successfully clicked on the prodcut family on the product page and Navigated to the prodcut family Page ");
	           logger.info("Successfully clicked on the prodcut family on the product page and Navigated to the prodcut family Page ");
	           // Perform actions or assertions here for the success case
	       } else {
	    	   logger.info("Element is not visible.");
	       } 
	       Actionsss.SwitchingToDefault();
	}
}
