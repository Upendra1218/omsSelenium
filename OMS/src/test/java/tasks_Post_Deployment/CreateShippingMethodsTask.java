package tasks_Post_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class CreateShippingMethodsTask extends baseClass{
	
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();
	
	public static void createPrduct() throws Exception {
		if(isLoggedIn) {
	   Actionsss.CombinedClick(crm.getappLauncher());
	   Thread.sleep(3000);
		Actionsss.sendKeys(crm.getappLauncherSearch(), TD.QuickFindBox_Input_products, TD.QuickFindBox_IP_FieldName);
		Thread.sleep(2000);
		Actionsss.CombinedClick(crm.getprodcutsTab());
		if(Actionsss.displayElement(Actionsss.fluentWait(crm.getprodcutlistdiv()))) {
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getNewprodcut());
			Thread.sleep(1000);
			Actionsss.sendKeys(crm.getprodcutName(), TD.Input_Prodcut_Name, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(1000);
			Actionsss.sendKeys(crm.getprodcutCode(), TD.Input_Prodcut_Code, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getActiveCheckBox());
			Thread.sleep(1000);
			Actionsss.CombinedClick(crm.getprodcutNone());
			Thread.sleep(1000);
			Actionsss.CombinedClick(crm.getprodcutShipping());
			Actionsss.sendKeys(crm.getprodcutDescription(), TD.IP_Prodcut_Description, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(1000);
			Actionsss.CombinedClick(crm.getprodcutSaveBtn());
		}
		//orgEditionValidations.VerifyCompanypagelayout();
		Thread.sleep(5000);
		//orgEditionValidations.VerifyorgValidation();
		}
	}

}
