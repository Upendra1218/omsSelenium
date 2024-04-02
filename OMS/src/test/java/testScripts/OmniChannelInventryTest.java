package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Pre_Deployment.OmniChannelInvetryTask;

public class OmniChannelInventryTest extends baseClass{
	
	@Test//( dependsOnMethods = {"testScripts.OrderManagementTest.VerifyingOrderManagementPagefromSideMenu"})
	public void VerifyingEnableOmniChannelInverntryfromSideMenu()throws Exception {
		OmniChannelInvetryTask.omniChannelInventry();
	}

}
