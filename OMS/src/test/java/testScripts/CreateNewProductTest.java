package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Post_Deployment.CreateShippingMethodsTask;

public class CreateNewProductTest extends baseClass{
	@Test//( dependsOnMethods = {"testScripts.loginPageTest.VerifyingLoginWithValidCredentials"})//( dependsOnMethods = {"testScripts.OrderSettingsTests.VerifyingOrderSettingPagefromSideMenu"})
	public void VerifyingCreateNewPoduct()throws Exception {
		CreateShippingMethodsTask.createPrduct();
	}
}
