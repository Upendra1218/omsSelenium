package tasks_Pre_Deployment;

import java.util.ArrayList;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import validations.PersonAccountValidations;

public class EnablePersonAccountTasks extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();
	
	public static void personAcconts() throws Exception {
		if(isLoggedIn) {
			Actionsss.sendKeys(crm.getquickFindBox(), TD.QuickFindBox_Input_PersonAccounts, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(1000);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getPersonAccounts()));
			Thread.sleep(2000);
			PersonAccountValidations.VerifyPersonAccountClick();
			Thread.sleep(3000);
			RequiremestofEnablePersonAccount();
		}
	}

	
	public static void RequiremestofEnablePersonAccount() throws Exception {
		if(Actionsss.countofElements(crm.getPersonAccountEnabled())) {
			logger.info("User is Enabled the Person Account in the Person Account Page.");
			test.pass("User is Enabled the Person Account in the Person Account Page.");
		}else {
			
			OrgImpactAcknowledgement();
			CreateAccountsRecordType();
	
		}
		
	}
	
	public static void OrgImpactAcknowledgement() throws Exception {
		if(Actionsss.countofElements(crm.getPersonAccountVOIlist())) {
			logger.info("User is Org Impact Acknowledgement  is checked in the Person Account Page.");
			test.pass("User is Org Impact Acknowledgement  is checked in the Person Account Page.");
		}else {
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getPersonAccountVOI()));
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getPersonAccountVOI_CB()));
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getPersonAccountVOI_Continue()));
		}
		
	}
	
	public static void CreateAccountsRecordType() throws Exception {
		if(Actionsss.countofElements(crm.getPersonAccountEnabled())) {
			logger.info("User is Create Accounts Record Type is checked in the Person Account Page.");
			test.pass("User is Create Accounts Record Type is checked in the Person Account Page.");
		}else {
			if(Actionsss.countofElements(crm.getPersonAccountVOI_CARTNTlist())) {
				Actionsss.CombinedClick(crm.getPersonAccountVOI_CARTNT());
				Thread.sleep(3000);
				// Get all open window handles
		        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		        // Switch to the newly opened tab
		        driver.switchTo().window(tabs.get(2));
		        Thread.sleep(2000);
		        PersonAccountValidations.VerifyAccountRecordTypeClick();
		        Thread.sleep(2000);
		        Actionsss.CombinedClick(Actionsss.fluentWait(crm.getPS_CRT_New()));
		        Thread.sleep(2000);
		        PersonAccountValidations.VerifyNewRecordTypeClick();
		        Actionsss.SwitchingToIFrame();
		        if (Actionsss.displayElement(Actionsss.fluentWait(crm.getAc_RT_New_Header()))) {
		        	Actionsss.sendKeys(crm.getNew_RT_Label(), TD.Account_New_RT_Label_IP_Data, TD.Account_New_RT_Label_IP_FieldName);
		        	Actionsss.sendKeys(crm.getNew_RT_Name(), TD.Account_New_RT_Name_IP_Data, TD.Account_New_RT_Name_IP_FieldName);
		        	Actionsss.scrollBottom();
		        	Thread.sleep(2000);
		        	Actionsss.CombinedClick(Actionsss.fluentWait(crm.getNew_RT_NextBtn()));
		        	Thread.sleep(2000);
		        	Actionsss.selectValue(Actionsss.fluentWait(crm.getNew_RT_Select_Layout()));
		        	Thread.sleep(2000);
		        	Actionsss.scrollBottom();
		        	Thread.sleep(2000);
		        	Actionsss.CombinedClick(Actionsss.fluentWait(crm.getNew_RT_SaveBtn()));
		        	Thread.sleep(5000);
		        }
		        Actionsss.SwitchingToDefault();
		        PersonAccountValidations.VerifyNewRecordCreation();
		       // Close the new tab
		        driver.close();
		        // Switch back to the main tab
		        driver.switchTo().window(tabs.get(1));
		        Thread.sleep(3000);
		        driver.navigate().refresh();
		        Thread.sleep(2000);
			}else {
				logger.info("User is Create Accounts Record Type is checked in the Person Account Page.");
				test.pass("User is Create Accounts Record Type is checked in the Person Account Page.");
			}
			
	        if (Actionsss.displayElement(Actionsss.fluentWait(crm.getEnablePersonAccounts()))) {
	        	Actionsss.CombinedClick(Actionsss.fluentWait(crm.getEnablePersonAccounts()));
	        	Actionsss.CombinedClick(Actionsss.fluentWait(crm.getEnablePersonAccountsPopUP()));
				Thread.sleep(2000);
				RequiremestofEnablePersonAccount();
	        }
		}
		
		
	}
}
