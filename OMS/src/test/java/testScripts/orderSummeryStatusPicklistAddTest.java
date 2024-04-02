package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Post_Deployment.OrderSummeryStatusPicklistValuesTask;

public class orderSummeryStatusPicklistAddTest extends baseClass{
	@Test//( dependsOnMethods = {"testScripts.loginPageTest.VerifyingLoginWithValidCredentials"})//( dependsOnMethods = {"testScripts.OrderSettingsTests.VerifyingOrderSettingPagefromSideMenu"})
	public void VerifyingAddReqPickListValuesToOrderSummeryAfterpostDeployment()throws Exception {
		OrderSummeryStatusPicklistValuesTask.picklist();
	}
}
