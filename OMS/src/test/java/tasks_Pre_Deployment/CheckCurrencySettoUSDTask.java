package tasks_Pre_Deployment;

// Importing necessary Selenium libraries
import org.openqa.selenium.Alert;
import baseClass.baseClass; 
import data.TestData; 
import functionality.Actionsss; 
import pageObjects.crmXpaths; 
import validations.currenyValidations;

// Class for checking if currency is set to USD
public class CheckCurrencySettoUSDTask extends baseClass {
    // Initializing page objects and test data
    private static final crmXpaths crm = new crmXpaths(driver);
    private static TestData TD = new TestData();

    // Method for checking if currency is set to USD
    public static void currencysetUSD() throws Exception {
        // Checking if company info is displayed
        if (Actionsss.displayElement(crm.getcompanyInfo())) {
            // Switching to the iframe
            Actionsss.SwitchingToIFrame();
            // Checking if currency name list is present
            if (Actionsss.countofElements(crm.getcurrencyNamelist())) {
                // If USD currency is already selected
                test.pass("User is selected Currency field as USD");
                logger.info("currency already set to usd");
            } else {
                // If USD currency is not selected
                logger.info("currency already not set to usd");
                // Scrolling to and clicking the edit button in company info
                Actionsss.randomElementFromListScrollIntoView(crm.geteditBtninCIlist());
                // Switching out of iframe
                Actionsss.SwitchingToDefault();
                // Verifying edit button click
                currenyValidations.VerifyeditbuttonClick();
                // Switching back to the iframe
                Actionsss.SwitchingToIFrame();
                // Selecting USD currency from dropdown
                Actionsss.selectValueformDropDown(crm.getdropdownCurrenyList(), TD.SelectCurrent_IP_CompanyInfo_Value);
                Thread.sleep(2000); // Waiting for 2 seconds
                // Clicking the save button in company info edit page
                Actionsss.CombinedClick(crm.getsaveBtnInCIEditPage());
                Thread.sleep(1000); // Waiting for 1 second
                
                // Switching to the alert
                Alert alert = driver.switchTo().alert();
                // Clicking OK button
                Thread.sleep(1000); // Waiting for 1 second
                alert.accept(); // Accepting the alert	
                // Switching out of iframe
                Actionsss.SwitchingToDefault();
                Thread.sleep(3000); // Waiting for 3 seconds
                // Recursive call to ensure currency is set to USD
                currencysetUSD();
            }
            // Switching out of iframe
            Actionsss.SwitchingToDefault();
            Thread.sleep(3000); // Waiting for 3 seconds
        }
    }
}
