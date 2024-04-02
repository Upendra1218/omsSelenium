package testScripts;

import org.testng.annotations.Test;
import browser.launchingforCCBrowser;
import baseClass.baseClass;
import tasks_Pre_Deployment.LoginPageTasks;

public class loginToCC extends baseClass{
    @Test(dependsOnMethods = {"browser.launchingforCCBrowser.VerifingCCLaunching"} )
    public void VerifyingLoginWithValidCredentialsCCSandBox()throws Exception {
	  LoginPageTasks.logintoCCSandBox();
    }

}
