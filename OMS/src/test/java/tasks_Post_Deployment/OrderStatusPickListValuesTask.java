package tasks_Post_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import validations.ProductFamailyValidations;

public class OrderStatusPickListValuesTask extends baseClass{

	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();
	
	public static void Statuspicklist() throws Exception {
		if(isLoggedIn) {
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getObjectManager()));
			Thread.sleep(3000);
			ProductFamailyValidations.VerifyObjecmanagerClick();
			Actionsss.sendKeys(crm.getQuickfind(), TD.QuickFindBox_Input_Order, TD.QuickFindBox_IP_FieldName);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getorderOM()));
			//ProductFamailyValidations.VerifyProductClick();
			Thread.sleep(2000);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getproduct_O_FR()));
			ProductFamailyValidations.VerifyFieldandReloationsClick();
			Thread.sleep(2000);
			Actionsss.sendKeys(crm.getQuickfind(), TD.QuickFindBox_Input_OrderStatus, TD.QuickFindBox_IP_FieldName);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getorder_O_FR_PF()));
			//ProductFamailyValidations.VerifyNewPicklistClick();
			Thread.sleep(2000);
			InReviewSet();
			ApprovedSet();
			FufilledSet();
			CanceledSet();
			ReturnedSet();

		}
	}
	
	public static void InReviewSet() throws Exception {
		Actionsss.SwitchingToIFrame();
		if(Actionsss.getSizeOfSingleList(crm.getorder_FH_ALE_IR())) {
			logger.info("pick list already added");
		}else {
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Thread.sleep(2000);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getorder_O_FR_PF_N()));
			Thread.sleep(2000);
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_L(), TD.QuickFindBox_Input_OrderStatus_Data_InReview);
			Thread.sleep(2000);
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_API(), TD.QuickFindBox_Input_OrderStatus_Data_InReview);
			Thread.sleep(2000);
			Actionsss.selectValueformDropDown(crm.getorder_O_FR_PF_N_IP_Se(),TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getorder_O_FR_PF_N_S());
			
		}
		Actionsss.SwitchingToDefault();
	}
	
	public static void ApprovedSet() throws Exception {
		Actionsss.SwitchingToIFrame();
		if(Actionsss.getSizeOfSingleList(crm.getorder_FH_ALE_AP())) {
			logger.info("pick list already added");
		}else {
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Thread.sleep(2000);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getorder_O_FR_PF_N()));
			Thread.sleep(2000);
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_L(), TD.QuickFindBox_Input_OrderStatus_Data_Approved);
			Thread.sleep(2000);
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_API(), TD.QuickFindBox_Input_OrderStatus_Data_Approved);
			Thread.sleep(2000);
			Actionsss.selectValueformDropDown(crm.getorder_O_FR_PF_N_IP_Se(),TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getorder_O_FR_PF_N_S());
			
		}
		Actionsss.SwitchingToDefault();
		
	}
	
	public static void FufilledSet() throws Exception {
		Actionsss.SwitchingToIFrame();
		if(Actionsss.getSizeOfSingleList(crm.getorder_FH_ALE_FF())) {
			logger.info("pick list already added");
		}else {
			Thread.sleep(2000);
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getorder_O_FR_PF_N()));
			Thread.sleep(2000);
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_L(), TD.QuickFindBox_Input_OrderStatus_Data_Fufilled);
			Thread.sleep(2000);
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_API(), TD.QuickFindBox_Input_OrderStatus_Data_Fufilled);
			Thread.sleep(2000);
			Actionsss.selectValueformDropDown(crm.getorder_O_FR_PF_N_IP_Se(),TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getorder_O_FR_PF_N_S());
		}
		Actionsss.SwitchingToDefault();
		
	}
	
	public static void CanceledSet() throws Exception {
		Actionsss.SwitchingToIFrame();
		if(Actionsss.getSizeOfSingleList(crm.getorder_FH_ALE_C())) {
			logger.info("pick list already added");
		}else {
			Thread.sleep(2000);
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getorder_O_FR_PF_N()));
			Thread.sleep(2000);
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_L(), TD.QuickFindBox_Input_OrderStatus_Data_Canceled);
			Thread.sleep(2000);
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_API(), TD.QuickFindBox_Input_OrderStatus_Data_Canceled);
			Thread.sleep(2000);
			Actionsss.selectValueformDropDown(crm.getorder_O_FR_PF_N_IP_Se(),TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getorder_O_FR_PF_N_S());
		}
		Actionsss.SwitchingToDefault();
		
	}
	
	public static void ReturnedSet() throws Exception {
		Actionsss.SwitchingToIFrame();
		if(Actionsss.getSizeOfSingleList(crm.getorder_FH_ALE_R())) {
			logger.info("pick list already added");
		}else {
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Thread.sleep(2000);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getorder_O_FR_PF_N()));
			Actionsss.SwitchingToDefault();
			Actionsss.SwitchingToIFrame();
			Thread.sleep(2000);
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_L(), TD.QuickFindBox_Input_OrderStatus_Data_Returned);
			Thread.sleep(2000);
			Actionsss.sendKeyss(crm.getorder_O_FR_PF_N_IP_API(), TD.QuickFindBox_Input_OrderStatus_Data_Returned);
			Thread.sleep(2000);
			Actionsss.selectValueformDropDown(crm.getorder_O_FR_PF_N_IP_Se(),TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
			Actionsss.CombinedClick(crm.getorder_O_FR_PF_N_S());
		}
		Actionsss.SwitchingToDefault();
		
	}
	
}
