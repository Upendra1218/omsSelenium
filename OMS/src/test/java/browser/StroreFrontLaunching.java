package browser;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import validations.browserValidation;

public class StroreFrontLaunching extends baseClass{
	
	private static TestData TD = new TestData();
	@Test
	public static void VerifingStoreURLLaunching() throws InterruptedException {
		// Open a new tab
		 ((JavascriptExecutor) driver).executeScript("window.open();");
        // Switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(3));
		//launching the browser and passing the url into it
		 driver.get(TD.StoreForntUrl);
		 browserValidation.validateBroweserlaunches(); 
	}

}
