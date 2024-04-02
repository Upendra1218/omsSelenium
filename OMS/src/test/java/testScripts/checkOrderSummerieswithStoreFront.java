package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Post_Deployment.CheckOrderSummeriesTask;

public class checkOrderSummerieswithStoreFront extends baseClass{

	@Test//( dependsOnMethods = {"testScripts.loginPageTest.VerifyingLoginWithValidCredentials"})//( dependsOnMethods = {"testScripts.OrderSettingsTests.VerifyingOrderSettingPagefromSideMenu"})
	public void VerifyingOrderSummeriesWithStoreFornt()throws Exception {
		CheckOrderSummeriesTask.orderSummeries();
	}
}
