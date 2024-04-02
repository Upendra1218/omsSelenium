package tasks_Deployment;

import baseClass.baseClass;
import browser.packageURl;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import pageObjects.loginPage;
import validations.deploymentValidations;

public class InstallPackage extends baseClass{
	private static final loginPage lp = new loginPage(driver);
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();
	
	
	public static void installPackage() throws Exception {
		packageURl.VerifingpackageURLLaunching();
		Thread.sleep(3000);
        Actionsss.sendKeys(lp.getuserName(), TD.userName,TD.UserName_Login_IP_FieldName);      
        Actionsss.sendKeys(lp.getuserpassword(), TD.password,TD.Passowrd_Login_IP_FieldName);      
        Thread.sleep(2000);
        // Click the login button
        Actionsss.CombinedClick(lp.clickloginBtn()); 
		Thread.sleep(10000);
		if(Actionsss.countofElements(crm.getupdatepackager())) {
			logger.info("Package is already installed");
		}else {
		Actionsss.sendKeys(crm.getdeploymentKey(), TD.Package_Key,TD.UserName_Login_IP_FieldName);     
		Thread.sleep(2000);
		Actionsss.CombinedClick(crm.getContinueBtn());
		Thread.sleep(3000);
		Actionsss.CombinedClick(crm.getinstallBtn());
		deploymentValidations.VerifyDownloadPackage();
		Thread.sleep(5000);
		Actionsss.CombinedClick(Actionsss.fluentWait(crm.getdoneBtn()));
		Thread.sleep(3000);
		}
	}

}
