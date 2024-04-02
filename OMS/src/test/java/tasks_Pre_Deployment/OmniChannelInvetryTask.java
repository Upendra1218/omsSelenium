package tasks_Pre_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import validations.OmniChannelInvetryValidations;

public class OmniChannelInvetryTask extends baseClass{
	
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();

	public static void omniChannelInventry() throws Exception {
		if(isLoggedIn) {
			Actionsss.sendKeys(crm.getquickFindBox(), TD.QuickFindBox_Input_OmniChannelInvertry, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(1000);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getOmnichannel()));
			OmniChannelInvetryValidations.VerifyOmniChannelInverntryClick();
			Thread.sleep(2000);
			enableCheckBoxesExpcectB2C();
		}
	}

	public static void enableCheckBoxesExpcectB2C() throws Exception {
		if(Actionsss.displayElement(Actionsss.fluentWait(crm.getOmnichannelHeader())) && Actionsss.getSizeOfSingleList(crm.getOrderManagementActive())) {
			logger.info("Sucessfully All Required CheckBoxs are Checked on the Omni Channel Inventary");
			test.pass("Sucessfully All Required CheckBoxs are Checked on the Omni Channel Inventary");
		}else {
			logger.info("All buttons are not in  active");	
			if(Actionsss.getSizeOfSingleList(crm.getOrderManagementInActive())) {
				Actionsss.selectSingleCheckBoxes(crm.getOrderManagementCheckBox());
				Thread.sleep(1000);
				driver.navigate().refresh();
			}
			Thread.sleep(2000);
			enableCheckBoxesExpcectB2C();
		}
		
	}


}
