package tasks_Post_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class CheckOrderSummeriesTask extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();

	public static void orderSummeries() throws Exception {
		if(isLoggedIn) {
			Actionsss.CombinedClick(crm.getappLauncher());
			Thread.sleep(3000);
			Actionsss.sendKeys(crm.getappLauncherSearch(), TD.QuickFindBox_Input_OrderSummerires, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getOrderManagementTab());
			Thread.sleep(2000);
			if(Actionsss.displayElement(Actionsss.fluentWait(crm.getOrderManagementMethod()))) {
				Actionsss.CombinedClick(crm.getListOrderManagementSummeries());
				Thread.sleep(2000);
				Actionsss.CombinedClick(crm.getListOrderManagementSummeriesAll());
				Thread.sleep(3000000);
			}
		}
	}

}
