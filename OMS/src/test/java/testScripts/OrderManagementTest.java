package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Pre_Deployment.OrderManagmentTask;

public class OrderManagementTest extends baseClass{
	
	@Test//( dependsOnMethods = {"testScripts.EnablePersonAccountTest.VerifyingEnablePersonAccountsfromSideMenu"})
	public void VerifyingOrderManagementPagefromSideMenu()throws Exception {
		OrderManagmentTask.ordermanagement();
	}


}
