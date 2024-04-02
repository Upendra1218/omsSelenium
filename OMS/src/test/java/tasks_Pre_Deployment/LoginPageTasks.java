package tasks_Pre_Deployment;


import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import pageObjects.loginPage;
import validations.browserValidation;

public class LoginPageTasks extends baseClass {

	private static final loginPage lp = new loginPage(driver);
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();
	

    
    public static void verifyThatuserLogin() throws Exception {
        // Enter valid email and password
        Actionsss.sendKeys(lp.getuserName(), TD.userName,TD.UserName_Login_IP_FieldName);      
        Actionsss.sendKeys(lp.getuserpassword(), TD.password,TD.Passowrd_Login_IP_FieldName);      
        Thread.sleep(2000);
        // Click the login button
        Actionsss.CombinedClick(lp.clickloginBtn());   
        browserValidation.loginValidation();
        Thread.sleep(5000);
    }
    
    
public static void logintoCCSandBox() throws Exception {
	Thread.sleep(5000);
	Actionsss.sendKeys(crm.getccuserName(), TD.userName_002,TD.UserName_Login_IP_FieldName);   
    Thread.sleep(3000);
    Actionsss.CombinedClick(crm.getccLoginBtn());
    Thread.sleep(2000);
	Actionsss.sendKeys(crm.getccPWD(), TD.password_002,TD.UserName_Login_IP_FieldName);   
    Thread.sleep(2000);
    Actionsss.CombinedClick(crm.getccLoginBtn());
    Thread.sleep(50000);
    Actionsss.CombinedClick(crm.getselectSite());
    Thread.sleep(1000);
    Actionsss.CombinedClick(crm.getrefrachsiteSelect());
    Thread.sleep(10000);
    
 // Open a new tab
	 ((JavascriptExecutor) driver).executeScript("window.open();");

     // Switch to the new tab
     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
     driver.switchTo().window(tabs.get(1));
	//launching the browser and passing the url into it
	 driver.get(TD.baseURL);
	 browserValidation.validateBroweserlaunches(); 
	}

}
