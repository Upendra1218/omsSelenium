package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Post_Deployment.ProductFamilyPicklistValuesTask;

public class ProdcutFamilyPicklistValuesTest extends baseClass{
	@Test//( dependsOnMethods = {"testScripts.loginPageTest.VerifyingLoginWithValidCredentials"})//( dependsOnMethods = {"testScripts.OrderSettingsTests.VerifyingOrderSettingPagefromSideMenu"})
	public void VerifyingAddReqPickListValuesToProductFamilyAfterpostDeployment()throws Exception {
		ProductFamilyPicklistValuesTask.picklist();
	}
}
