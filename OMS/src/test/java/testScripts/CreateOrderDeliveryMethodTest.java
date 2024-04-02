package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Post_Deployment.CreateOrderDeliveryMethodsTask;

public class CreateOrderDeliveryMethodTest extends baseClass{
	
	@Test//( dependsOnMethods = {"testScripts.loginPageTest.VerifyingLoginWithValidCredentials"})//( dependsOnMethods = {"testScripts.OrderSettingsTests.VerifyingOrderSettingPagefromSideMenu"})
	public void VerifyingCreateNewOrderDeliveryMethod()throws Exception {
		CreateOrderDeliveryMethodsTask.createNewDeliveryMethods();
	}

}
