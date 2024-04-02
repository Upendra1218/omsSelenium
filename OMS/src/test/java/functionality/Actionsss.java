package functionality;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.baseClass;
import data.TestData;



public class Actionsss extends baseClass{
	private static TestData TD = new TestData();

	//to hower the action
	public static void hover(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	// To select value from select drop down
	public static void selectValue(WebElement element, String value){
		Select select = new Select(element);
		select.selectByValue(value);
	}


	// To select value from select drop down
	public static void selectValue(WebElement element){	
		// Creating a Select object
		Select dropdown = new Select(element);
		int randomIndex =1;
		dropdown.selectByIndex(randomIndex);
		// Get the value of the randomly selected option
		String selectedOptionValue = dropdown.getFirstSelectedOption().getAttribute("value");
		logger.info("Value of the randomly selected option: " + selectedOptionValue);
		test.pass(" The randomly selected option: " + selectedOptionValue);
	}


	public static void selectValueformDropDown(WebElement element, String value){	
		// Creating a Select object
		Select dropdown = new Select(element);
		// Get the list of options
		// Select the option at the random index
		dropdown.selectByValue(value);
		// Get the value of the randomly selected option
		String selectedOptionValue = dropdown.getFirstSelectedOption().getText();
		logger.info("Value of the randomly selected option: " + selectedOptionValue);
		test.pass("Successfully drop down is set to : " + selectedOptionValue);
	}
	
	public static void enterKey() {
		Actions actions = new Actions(driver);

        // Perform key press for Enter key
        actions.sendKeys(Keys.ENTER).perform();
	}


	// Clear text from an input field
	public static void clearText(WebElement element) throws Exception {
		element.clear();
	}
	
	public static void conrrolAll(WebElement element) throws Exception {
		element.click();
		Thread.sleep(1000);
		element.sendKeys(Keys.CONTROL + "a");
	}

	// Scroll to the bottom of the page
	public static void scrollBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	// Scroll an element into view with its center aligned
	public static void scrollIntoViewCenter(WebElement ele) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", ele);
		Thread.sleep(2000);
	}

	// Click on an element and log the result
	public static void CombinedClick(WebElement locatorName) throws Exception {
		scrollIntoViewCenter(locatorName);
		highlightElement(locatorName);

		try {
			locatorName.click();
			//test.pass("Successfully clicked on " + locatorName.getText());
			Thread.sleep(2000);
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", locatorName);
			System.err.println("Exception while clicking the element: " + e.getMessage());
		}
	}


	// Check if an element is displayed
	public static boolean displayElement(WebElement ele) {
		try {
			return ele.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Check if an element is enabled
	public static boolean enabledElement(WebElement ele) {
		try {
			return ele.isEnabled();
		} catch (NoSuchElementException e) {
			return false;
		}
	}


	public static void scrollUp() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// Scroll up by a certain number of pixels or to the top of the page
		jsExecutor.executeScript("window.scrollTo(0, 0);");
	}

	
	

	public static void scrollMedium() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// Scroll up by a certain number of pixels or to the top of the page
		jsExecutor.executeScript("window.scrollTo(0, 0);");
	}


	public static boolean countofElements(List<WebElement> ele) {
		;
		int size = 0;
		try {
			size = ele.size();
			logger.info("The count of the element is " + ele.size());
		} catch (Exception e) {
		}
		return size > 0;
	}
	
	public static void sendKeyss(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public static boolean sendKeys(WebElement ele, String value, String elementName) throws InterruptedException {
		try {
			test.info("Verify whether the user is able to Enter the Input details in " + elementName );    
			// Clear and send keys
			highlightElement(ele);
			ele.clear();
			Thread.sleep(1000);
			ele.sendKeys(value);
			Thread.sleep(1000);
			logger.info("Successfully send keys of " + elementName);
			test.pass("Successfully the user is Entered the Input in " + elementName);
			return true;
		} catch (Exception e) {
			logger.info("Keys not sent to " + elementName);
			return false;
		}
	}

	//Function to highlight the element using JavaScript
	public static void highlightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Execute JavaScript to highlight the element
		js.executeScript("arguments[0].style.border='3px solid yellow'", element);
	}


	public  static void randomElementFromListScrollIntoView(List<WebElement> e) throws Exception {
		// Use the Random class to generate a random index
		Random random = new Random();
		int randomIndex = random.nextInt(e.size());
		WebElement randomElement= e.get(randomIndex);
		scrollIntoViewCenter(randomElement);
		Thread.sleep(2000);
		CombinedClick(randomElement);			
	}


	public static void SwitchingToIFrame() {
		WebDriverWait iframewait = new WebDriverWait(driver, Duration.ofSeconds(5));
		iframewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@name, 'vfFrameId_')]")));
	}

	public static void SwitchingToDefault() {
		driver.switchTo().defaultContent();
	}

	public static WebElement fluentWait(WebElement ele) throws Exception {
		Wait<WebDriver> wait = Waits.createFluentWait(driver);
		// Call the waitForElementVisibility method and pass the WebElement
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		Thread.sleep(3000);
		return element;
	}
	
	public static void selectMultipleCheckBoxes(List<WebElement> e) throws Exception {
		int TotalElements = e.size();
		for(int i =0 ; i<= TotalElements - 1; i++) {
			if(i == 2) {
				logger.info("skip this step");
			}else {
				WebElement element= e.get(i);
				scrollIntoViewCenter(element);
				Thread.sleep(1000);
				CombinedClick(element);
			}
			
		}
	}
	
	public static void selectSingleCheckBoxes(List<WebElement> e) throws Exception {
		int TotalElements = e.size();
		for(int i =0 ; i<= TotalElements - 1; i++) {
			if(i == 0) {
				WebElement element= e.get(i);
				scrollIntoViewCenter(element);
				Thread.sleep(2000);
				CombinedClick(element);
				
			}else {
				logger.info("skip this step");
			}
			
		}
	}
	
	 // Get the size of a list of elements
    public static int getSizeOfListNumber(List<WebElement> ele) {
       int size = 0;
        try {
       	 int displayedElementsPesent = 0;
 	    for (WebElement item : ele) {
 	        if (item.isDisplayed()) {
 	        	displayedElementsPesent++;
 	        }
 	    }
 	    // Get the count of matched elements and log it.
 	      size = displayedElementsPesent;
          //logger.info(size);
        } catch (Exception e) {

        }
		return size;
       
    }
    
	
	 // Get the size of a list of elements
    public static boolean getSizeOfList(List<WebElement> ele) {
       int size = 0;
        try {
       	 int displayedElementsPesent = 0;
 	    for (WebElement item : ele) {
 	        if (item.isDisplayed()) {
 	        	displayedElementsPesent++;
 	        }
 	    }
 	    // Get the count of matched elements and log it.
 	      size = displayedElementsPesent;
          //logger.info(size);
        } catch (Exception e) {

        }
        if(size==4) {
        	return true;
        }else {
        	return false;
        }
    }
    
    // Get the size of a list of elements
    public static boolean getSizeOfSingleList(List<WebElement> ele) {
       int size = 0;
        try {
       	 int displayedElementsPesent = 0;
 	    for (WebElement item : ele) {
 	        if (item.isDisplayed()) {
 	        	displayedElementsPesent++;
 	        }
 	    }
 	    // Get the count of matched elements and log it.
 	      size = displayedElementsPesent;
          //logger.info(size);
        } catch (Exception e) {

        }
        if(size>0) {
        	return true;
        }else {
        	return false;
        }
    }
    
    public  static void randomElementFromList(List<WebElement> e) throws Exception {
		// Use the Random class to generate a random index
    	logger.info(e.size());
        int randomIndex = random.nextInt(e.size());
        logger.info(randomIndex);
        WebElement randomElement= e.get(randomIndex);
        Thread.sleep(2000);
        highlightElement(randomElement);
        CombinedClick(randomElement);			
	}
    
    
    public static String getTextOfElement(WebElement locatorName) {
        String locatorNameText = "";
        try {
            locatorNameText = locatorName.getText();
            //Thread.sleep(1000);
        } catch (Exception e) {
            //e.printStackTrace();
        }
//        TestData.Selcted_Clp_Name = locatorNameText;
//        logger.info(TestData.Selcted_Clp_Name);
        return locatorNameText;
    }

}
