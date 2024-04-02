package tasks_Pre_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import validations.orderSettingsValidations;

public class OrderSettingTasks extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();

	public static void orederSettings() throws Exception {
		if(isLoggedIn) {
			Actionsss.sendKeys(crm.getquickFindBox(), TD.QuickFindBox_Input_OrderSettings, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(1000);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getorderSettings()));
			Thread.sleep(2000);
			orderSettingsValidations.VerifyOrderSettingClick();
			Thread.sleep(3000);
			EnableAllRegCheckBoxChecked();
		}
	}

	public static void EnableAllRegCheckBoxChecked() throws Exception {
		Actionsss.SwitchingToIFrame();
		if(Actionsss.countofElements(crm.getReductionOrdersOSlist()) && 
				Actionsss.countofElements(crm.getNegativeOIQuantityOSlist()) && 
				Actionsss.countofElements(crm.getZeroOIQuantityOSlist()) && 
				Actionsss.countofElements(crm.getOptionalPricebookOSlist()) && 
				Actionsss.countofElements(crm.getOrderEventsOSlist()) &&
				Actionsss.countofElements(crm.getEnhancedCommerceOrderslist())
				) {
			logger.info("User is Enabled the All the Requied Check Boxs On the Order Settings Page.");
			test.pass("User is Enabled the All the Requied Check Boxs On the Order Settings Page.");
			Actionsss.CombinedClick(crm.getsaveBtnInOSPage());
		}else {
			EnableReductionOrdersCheckBox();
			EnableNegativeQuantityCheckBox();
			EnableEnhancedCommerceOrders();
			EnableZeroQuantityCheckBox();
			EnableOptionalPriceforOrdersCheckBox();
			EnableOrderEventsCheckBox();
			Actionsss.CombinedClick(crm.getsaveBtnInOSPage());
		}
		Actionsss.SwitchingToDefault();	
	}


	public static void EnableReductionOrdersCheckBox() throws Exception {
		if(Actionsss.countofElements(crm.getReductionOrdersOSlist())) {
			logger.info("User is Enabled the Check Box of Enable Reduction Orders.");
			test.pass("User is Enabled the Check Box of Enable Reduction Orders.");
		}else {
			logger.info("user Not checked this check box");
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getReductionOrdersOSPage()));
			test.pass("User is Enabled the Check Box of Enable Reduction Orders.");
		}
	}

	public static void EnableNegativeQuantityCheckBox() throws Exception {
		if(Actionsss.countofElements(crm.getNegativeOIQuantityOSlist())) {
			logger.info("User is Enabled the Check Box of Enable Negative Quantity.");
			test.pass("User is Enabled the Check Box of Enable Negative Quantity.");
		}else {
			logger.info("user Not checked this check box");
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getNegativeOIQuantityOSPage()));
			test.pass("User is Enabled the Check Box of Enable Negative Quantity.");
		}
	}
	
	public static void EnableEnhancedCommerceOrders() throws Exception {
		if(Actionsss.countofElements(crm.getEnhancedCommerceOrderslist())) {
			logger.info("User is Enabled the Check Box of Enhanced Commerce Orders.");
			test.pass("User is Enabled the Check Box of Enhanced Commerce Orders.");
		}else {
			logger.info("user Not checked this check box");
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getEnhancedCommerceOrdersOSPage()));
			test.pass("User is Enabled the Check Box of Enhanced Commerce Orders.");
		}
	}

	public static void EnableZeroQuantityCheckBox() throws Exception {
		if(Actionsss.countofElements(crm.getZeroOIQuantityOSlist())) {
			logger.info("User is Enabled the Check Box of Enable Zero Quantity.");
			test.pass("User is Enabled the Check Box of Enable Zero Quantity.");
		}else {
			logger.info("user Not checked this check box");
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getZeroOIQuantityOSPage()));
			test.pass("User is Enabled the Check Box of Enable Zero Quantity.");
		}
	}

	public static void EnableOptionalPriceforOrdersCheckBox() throws Exception {
		if(Actionsss.countofElements(crm.getOptionalPricebookOSlist())) {
			logger.info("User is Enabled the Check Box of Enable Optional Price for Orders");
			test.pass("User is Enabled the Check Box of Enable Optional Price for Orders");
		}else {
			logger.info("user Not checked this check box");
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getOptionalPricebookOSPage()));
			test.pass("User is Enabled the Check Box of Enable Optional Price for Orders");
		}
	}

	public static void EnableOrderEventsCheckBox() throws Exception {
		if(Actionsss.countofElements(crm.getOrderEventsOSlist())) {
			logger.info("User is Enabled the Check Box of Enable Order Events");
			test.pass("User is Enabled the Check Box of Enable Order Events.");
		}else {
			logger.info("user Not checked this check box");
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getOrderEventsOSPage()));
			test.pass("User is Enabled the Check Box of Enable Order Events.");
		}
	}

}
