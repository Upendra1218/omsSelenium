package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Post_Deployment.OrderStatusPickListValuesTask;

public class OrderStatusPicklistAddTest extends baseClass{
	@Test//( dependsOnMethods = {"testScripts.loginPageTest.VerifyingLoginWithValidCredentials"})//( dependsOnMethods = {"testScripts.OrderSettingsTests.VerifyingOrderSettingPagefromSideMenu"})
	public void VerifyingAddReqPickListValuesToorderStatusAfterpostDeployment()throws Exception {
		OrderStatusPickListValuesTask.Statuspicklist();
	}
}
