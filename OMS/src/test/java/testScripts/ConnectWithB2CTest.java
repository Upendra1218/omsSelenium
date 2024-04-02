package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Pre_Deployment.ConnectWithB2CTask;

public class ConnectWithB2CTest extends baseClass{
	
	
	@Test //( dependsOnMethods = {"testScripts.OmniChannelInventryTest.VerifyingEnableOmniChannelInverntryfromSideMenu"})
	public void VerifyingConnectWithB2CfromSideMenu()throws Exception {
		ConnectWithB2CTask.connectwithB2c();
		Thread.sleep(10000);
	}


}
