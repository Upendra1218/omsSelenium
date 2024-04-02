package testScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import tasks_Pre_Deployment.CheckCurrencySettoUSDTask;

public class CheckCurrencySettoUSDTest extends baseClass{
	
	@Test//(dependsOnMethods = {"testScripts.CheckTheOrgEditionTests.VerifyingCompanyInfoSearchAndOrgEdition"})
    public void VerifyingCurrencyisSetToUsd()throws Exception {
		CheckCurrencySettoUSDTask.currencysetUSD();
    }

}
