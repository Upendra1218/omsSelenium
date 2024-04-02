package testScripts;

import org.testng.annotations.Test;

import PlaceTheOrder.placeTheOrderTask;
import baseClass.baseClass;

public class placeTheOrderTest extends baseClass{
	@Test//( dependsOnMethods = {"testScripts.CreateOrderDeliveryMethodTest.VerifyingCreateNewOrderDeliveryMethod"})//( dependsOnMethods = {"testScripts.OrderSettingsTests.VerifyingOrderSettingPagefromSideMenu"})
	public void VerifyingPlaceTheOrder()throws Exception {
		placeTheOrderTask.searchAProduct();
	}

}
