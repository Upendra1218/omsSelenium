package tasks_Pre_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import validations.pathSettingsValidations;

public class EnablepathSettingsTask extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();

	public static void pathsettings() throws Exception {
		if(isLoggedIn) {
			Thread.sleep(2000);
			Actionsss.clearText(crm.getquickFindBox());
			Thread.sleep(2000);
			Actionsss.sendKeys(crm.getquickFindBox(), TD.QuickFindBox_Input_PathSettings, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(3000);
			Actionsss.CombinedClick(crm.getpathsettings());
			Thread.sleep(2000);
			pathSettingsValidations.VerifyPathSettingsClick();
			Thread.sleep(10000);
			pathsettinsEnable();
		}
	}
	
	public static void pathsettinsEnable() throws Exception {
		Actionsss.SwitchingToIFrame();
		if(Actionsss.getSizeOfSingleList(crm.getpathsettingsNewPath())) {
			logger.info("path setting are already enabled");
		}else {
			Actionsss.CombinedClick(crm.getpathsettingsEnable());
			Actionsss.SwitchingToDefault();
			pathsettinsEnable();
		}
		Actionsss.SwitchingToDefault();
		
	}
}
