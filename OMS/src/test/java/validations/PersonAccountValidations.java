package validations;

import baseClass.baseClass;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class PersonAccountValidations extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);

	public static void VerifyPersonAccountClick() throws Exception {
		test.info("Verify wheather the user is able to click on the Order Settings on the side Menyu"); 
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getPS_Header()))) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the Person Accounts on the side Menu and Navigated to the Person Accounts Page ");
           logger.info("Successfully clicked on the Person Accounts on the side Menu and Navigated to the Person Accounts Page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       }
      
	 }
	
	public static void VerifyAccountRecordTypeClick() throws Exception {
		test.info("Verify wheather the user is able to click on the Set Up  on the person Account"); 
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getAc_RT_Header()))) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the Set Up  on the person Account and Navigated to the  Account Record Type Page ");
           logger.info("Successfully clicked on the Set Up  on the person Account and Navigated to the  Account Record Type Page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       }
       Thread.sleep(3000);
	 }
	
	public static void VerifyNewRecordTypeClick() throws Exception {
		test.info("Verify wheather the user is able to click on the New button  on the Account Record type");
		Actionsss.SwitchingToIFrame();
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getAc_RT_New_Header()))) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the New button  on the Account Record type and Navigated to the New Record Type Creation page ");
           logger.info("Successfully clicked on the New button  on the Account Record type and Navigated to the New Record Type Creation page ");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       }
       Thread.sleep(3000);
       Actionsss.SwitchingToDefault();
	 }
	
	public static void VerifyNewRecordCreation() throws Exception {
		test.info("Verify wheather the user is able to Create, New Record creation on the Account Record type");
		Actionsss.SwitchingToIFrame();
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getNew_RT_NewPage()))) {
           // Success message is displayed
       	   test.pass("Successfully User is Created New Account Record type and Navigated to the New Record Type Creation page ");
           logger.info("Successfully User is Created New Account Record type and Navigated to the New Record Type Creation page");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       }
       Thread.sleep(3000);
       Actionsss.SwitchingToDefault();
	 }

}
