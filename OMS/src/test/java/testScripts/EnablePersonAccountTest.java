package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Pre_Deployment.EnablePersonAccountTasks;

public class EnablePersonAccountTest extends baseClass{
	
	@Test//( dependsOnMethods = {"testScripts.OrderSettingsTests.VerifyingOrderSettingPagefromSideMenu"})
	public void VerifyingEnablePersonAccountsfromSideMenu()throws Exception {
		EnablePersonAccountTasks.personAcconts();
	}

}
