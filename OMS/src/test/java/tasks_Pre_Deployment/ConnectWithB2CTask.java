package tasks_Pre_Deployment;

import baseClass.baseClass;
import data.TestData;
import functionality.Actionsss;
import pageObjects.crmXpaths;
import validations.ConnectWithB2CValidations;

public class ConnectWithB2CTask extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);
	private static TestData TD = new TestData();

	public static void connectwithB2c() throws Exception {
		if(isLoggedIn) {
			Actionsss.sendKeys(crm.getquickFindBox(), TD.QuickFindBox_Input_B2CCommerceConnections, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(3000);
			Actionsss.CombinedClick(crm.getconnectB2c());
			Thread.sleep(2000);
			ConnectWithB2CValidations.VerifyConnectWithB2CClick();
			Thread.sleep(3000);
			ConnectionWithB2CwithValidDetails();
		}
	}

	public static void ConnectionWithB2CwithValidDetails() throws Exception {
		if (Actionsss.displayElement(Actionsss.fluentWait(crm.getconnectB2cHeader()))) {
			Actionsss.SwitchingToIFrame();
			if(Actionsss.getSizeOfList(crm.getProvisionState())) {
				logger.info("All are in the provision state");
				test.pass("connection was succesfully established");
				 Actionsss.SwitchingToDefault();
			}else {
				 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getB2cNewConnection()));
				 Thread.sleep(2000);
				 if (Actionsss.displayElement(Actionsss.fluentWait(crm.getB2cNewConnectionHeader()))) {
					 Actionsss.sendKeys(crm.getB2cNewConnectionName(), TD.Connection_Name, TD.Connection_Name_IP_FieldName);
					 Actionsss.sendKeys(crm.getB2cNewConnectionID(), TD.Instance_ID, TD.Instance_ID_RT_Label_IP_FieldName);
					 Thread.sleep(2000);
					 Actionsss.CombinedClick(crm.getB2cNewConnectionSaveBtn());
				 }
				 Actionsss.SwitchingToDefault();
				 Thread.sleep(10000);
				 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getallowBtn()));
				 Thread.sleep(10000);
				 Actionsss.SwitchingToIFrame();
				 Actionsss.conrrolAll(crm.getSelectDivforAvaliableOptions());
				 Thread.sleep(2000);
				 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getaddArrowBtn()));
				 Thread.sleep(3000);
				 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getsaveBtn()));
				 Thread.sleep(2000);
				 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getpopUpSaveBtn()));
				 Thread.sleep(30000); 
				 driver.navigate().refresh();
				 Thread.sleep(30000); 
				 
				 if(Actionsss.getSizeOfList(crm.getProvisionState())) {
						logger.info("All are in the provision state");
				 }else if((Actionsss.getSizeOfListNumber(crm.getProvisionState()))==3) {
					 Actionsss.conrrolAll(crm.getSelectDivforAvaliableOptions());
					 Thread.sleep(2000);
					 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getaddArrowBtn()));
					 Thread.sleep(3000);
					 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getsaveBtn()));
					 Thread.sleep(2000);
					 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getpopUpSaveBtn()));
				 }else if((Actionsss.getSizeOfListNumber(crm.getProvisionState()))==2) { 
					 Actionsss.conrrolAll(crm.getSelectDivforAvaliableOptions());
					 Thread.sleep(2000);
					 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getaddArrowBtn()));
					 Thread.sleep(3000);
					 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getsaveBtn()));
					 Thread.sleep(2000);
					 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getpopUpSaveBtn()));
				 }else if((Actionsss.getSizeOfListNumber(crm.getProvisionState()))==1) {
					 Actionsss.conrrolAll(crm.getSelectDivforAvaliableOptions());
					 Thread.sleep(2000);
					 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getaddArrowBtn()));
					 Thread.sleep(3000);
					 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getsaveBtn()));
					 Thread.sleep(2000);
					 Actionsss.CombinedClick(Actionsss.fluentWait(crm.getpopUpSaveBtn()));
				 }else {
					 driver.navigate().refresh();
					 Thread.sleep(30000);
				 }
				 
				 Actionsss.SwitchingToDefault();
				 ConnectionWithB2CwithValidDetails();
			}
			 
		 }
		
	}
	
	
}
