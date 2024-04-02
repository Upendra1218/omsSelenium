package tasks_Post_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import validations.ProductFamailyValidations;

public class ProductFamilyPicklistValuesTask extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();
	
	public static void picklist() throws Exception {
		if(isLoggedIn) {
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getObjectManager()));
			Thread.sleep(3000);
			ProductFamailyValidations.VerifyObjecmanagerClick();
			Actionsss.sendKeys(crm.getQuickfind(), TD.QuickFindBox_Input_Product, TD.QuickFindBox_IP_FieldName);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getproductOM()));
			ProductFamailyValidations.VerifyProductClick();
			Thread.sleep(2000);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getproduct_O_FR()));
			ProductFamailyValidations.VerifyFieldandReloationsClick();
			Thread.sleep(2000);
			Actionsss.sendKeys(crm.getQuickfind(), TD.QuickFindBox_Input_ProductFamily, TD.QuickFindBox_IP_FieldName);
			Actionsss.CombinedClick(Actionsss.fluentWait(crm.getproduct_O_FR_PF()));
			
			ProductFamailyValidations.VerifyNewPicklistClick();
			Thread.sleep(2000);
			Actionsss.SwitchingToIFrame();
			if(Actionsss.getSizeOfSingleList(crm.getproduct_FH_ALE())) {
				logger.info("pick list already added");
			}else {
				Actionsss.SwitchingToDefault();
				Actionsss.SwitchingToIFrame();
				Thread.sleep(2000);
				Actionsss.CombinedClick(Actionsss.fluentWait(crm.getproduct_O_FR_PF_N()));
				Actionsss.SwitchingToDefault();
				Thread.sleep(5000);
				ProductFamailyValidations.VerifyNewPicklistClick();
				Thread.sleep(2000);
				Actionsss.SwitchingToIFrame();
				Actionsss.sendKeyss(crm.getproduct_O_FR_PF_TA(), TD.QuickFindBox_Input_ProductFamily_Data);
				Thread.sleep(1000);
				Actionsss.CombinedClick(crm.getproduct_O_FR_PF_S());
				Thread.sleep(2000);
				Actionsss.SwitchingToDefault();
				ProductFamailyValidations.VerifyNewPicklistClick();
			}

		}
	}
	
  }

