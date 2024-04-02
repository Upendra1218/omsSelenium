package tasks_Pre_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import validations.orgEditionValidations;

public class CheckTheOrgEditition extends baseClass{
	
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();
	
	public static void orgEdititon() throws Exception {
		if(isLoggedIn) {
		Actionsss.sendKeys(crm.getquickFindBox(), TD.QuickFindBox_Input_CompanyInfo, TD.QuickFindBox_IP_FieldName);
		Thread.sleep(1000);
		Actionsss.CombinedClick(crm.getcompanyInfo());
		orgEditionValidations.VerifyCompanypagelayout();
		Thread.sleep(5000);
		orgEditionValidations.VerifyorgValidation();
		}
	}


}
