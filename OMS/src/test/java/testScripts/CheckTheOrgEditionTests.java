package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Pre_Deployment.CheckTheOrgEditition;

public class CheckTheOrgEditionTests extends baseClass{
	
	
	@Test//( dependsOnMethods = {"testScripts.loginPageTest.VerifyingLoginWithValidCredentials"})
    public void VerifyingCompanyInfoSearchAndOrgEdition()throws Exception {
		CheckTheOrgEditition.orgEdititon();
    }


}
