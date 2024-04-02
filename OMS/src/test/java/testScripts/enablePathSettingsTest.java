package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Pre_Deployment.EnablepathSettingsTask;

public class enablePathSettingsTest extends baseClass{

	@Test//(dependsOnMethods = {"testScripts.ConnectWithB2CTest.VerifyingConnectWithB2CfromSideMenu"})
	public void VerifyingEnablepathSettingsfromSideMenu()throws Exception {
		EnablepathSettingsTask.pathsettings();
		Thread.sleep(10000);
	}
}
