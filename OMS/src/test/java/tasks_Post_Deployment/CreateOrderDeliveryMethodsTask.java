package tasks_Post_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class CreateOrderDeliveryMethodsTask extends baseClass{

	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();
	
	public static void createNewDeliveryMethods() throws Exception {
		if(isLoggedIn) {
	   Actionsss.CombinedClick(crm.getappLauncher());
	   Thread.sleep(3000);
		Actionsss.sendKeys(crm.getappLauncherSearch(), TD.QuickFindBox_Input_OrderDeliveryMethod, TD.QuickFindBox_IP_FieldName);
		Thread.sleep(2000);
		Actionsss.CombinedClick(crm.getorderDeliveryMethodTab());
		if(Actionsss.displayElement(Actionsss.fluentWait(crm.getListVieworderDeliveryMethod()))) {
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getNeworderDeliveryMethod());
			Thread.sleep(3000);
			Actionsss.sendKeys(crm.getorderDeliveryMethodName(), TD.Input_Prodcut_Name, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(1000);
			Actionsss.sendKeys(crm.getorderDeliveryMethodCode(), TD.Input_Prodcut_Code, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getActiveCheckBox());
			Thread.sleep(1000);
			Actionsss.sendKeys(crm.getprodcutDescription(), TD.IP_Prodcut_Description, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getorderDeliveryMethodListBox());
			Thread.sleep(1000);
			Actionsss.CombinedClick(crm.getorderDeliveryMethodMethod());
			
			Thread.sleep(1000);
			Actionsss.CombinedClick(crm.getorderDeliveryMethodSaveBtn());
		}
		//orgEditionValidations.VerifyCompanypagelayout();
		Thread.sleep(5000);
		//orgEditionValidations.VerifyorgValidation();
		}
	}
}
