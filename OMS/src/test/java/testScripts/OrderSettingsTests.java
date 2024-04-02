package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Pre_Deployment.OrderSettingTasks;

public class OrderSettingsTests extends baseClass{

	@Test//( dependsOnMethods = {"testScripts.loginPageTest.VerifyingLoginWithValidCredentials"})//( dependsOnMethods = {"testScripts.CheckCurrencySettoUSDTest.VerifyingCurrencyisSetToUsd"})
	public void VerifyingOrderSettingPagefromSideMenu()throws Exception {
		OrderSettingTasks.orederSettings();
	}


}
