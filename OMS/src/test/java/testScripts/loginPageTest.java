package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Pre_Deployment.LoginPageTasks;

public class loginPageTest extends baseClass{
	
	    @Test(dependsOnMethods = {"testScripts.loginToCC.VerifyingLoginWithValidCredentialsCCSandBox"})//(dependsOnMethods = {"browser.Practice.practivelaunching"})
	    public void VerifyingLoginWithValidCredentials()throws Exception {
		  LoginPageTasks.verifyThatuserLogin();
	    }

}
