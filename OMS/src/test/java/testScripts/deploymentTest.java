package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Deployment.InstallPackage;

public class deploymentTest extends baseClass{
	@Test//(dependsOnMethods = {"testScripts.enablePathSettingsTest.VerifyingEnablepathSettingsfromSideMenu"} )
	public static void VerifyingInstallpackageURL() throws Exception {
		
		InstallPackage.installPackage();
		Thread.sleep(10000);
	}

}
