package tasks_Pre_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import validations.orderManagementValidations;

public class OrderManagmentTask extends baseClass{
	
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();

	public static void ordermanagement() throws Exception {
		if(isLoggedIn) {
			Actionsss.sendKeys(crm.getquickFindBox(), TD.QuickFindBox_Input_Ordermanagment, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(1000);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getOrderManagement()));
			orderManagementValidations.VerifyOrderManagementClick();
			Thread.sleep(3000);
			enableCheckBoxesExcectB2C();
		}
	}
	
	public static void enableCheckBoxesExcectB2C() throws Exception {
		if(Actionsss.getSizeOfList(crm.getOrderManagementActive())) {
			logger.info("Sucessfully All Required CheckBoxs are Checked on the Order Management");
			test.pass("Sucessfully All Required CheckBoxs are Checked on the Order Management");
		}else {
			logger.info("All buttons are not in  active");	
			Actionsss.selectMultipleCheckBoxes(crm.getOrderManagementCheckBox());
			Thread.sleep(3000);
			enableCheckBoxesExcectB2C();
		}
		
	}
}
