package validations;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class pathSettingsValidations extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();
	
	public static void VerifyPathSettingsClick() throws Exception {
		test.info("Verify wheather the user is able to click on the Path settings on the side Menyu"); 
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getpathsettingsHeader()))) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the path settings on the side Menu and Navigated to the path settings Page ");
           logger.info("Successfully clicked on the path settings on the side Menu and Navigated to the path settings Page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       }
      
	 }

	
	
}
