package functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.baseClass;
import pageObjects.StoreFrontXpaths;

public class allAttributesSelection extends baseClass{


	private static StoreFrontXpaths homePage = new StoreFrontXpaths(driver);

	public static void selectTheAttributesInPdp() throws Exception {

		//selecting attributes
		allAttributes();
		Thread.sleep(2000);

		WebElement cartEnabled =driver.findElement(By.xpath("//button[contains(@class,'add-to-cart')]"));
		List<WebElement> inStock =driver.findElements(By.xpath("//div[contains(text(), 'In Stock')]"));
		if(cartEnabled.isEnabled()&& inStock.size()>0) {
			//pdp.clickcartbutton(driver);    
		}else {
			System.out.println("Product is out of stock so searching for new product");
			//ProductDetailPageTasks.addtoCart();
		}	     
	}

	public static void allAttributes() throws Exception {

		List <WebElement> mainDiv= driver.findElements(By.xpath("//div[@class='attributes px-0']"));
		logger.info("The total number of size division are " +mainDiv.size());
		List<WebElement> colorElement = driver.findElements(By.xpath("//select[contains(@class,'select-color-swatch')]"));
		logger.info("The colordrop down count is " + colorElement.size());
		List<WebElement> sizeElement = driver.findElements(By.xpath("//select[contains(@class,'select-size')]"));
		logger.info("The size drop down count  is " +  sizeElement.size());
		List<WebElement> memoryElement = driver.findElements(By.id("memorySize-null"));
		List<WebElement> widthElements = driver.findElements(By.xpath("//select[contains(@class,'select-width')]"));
		logger.info(widthElements.size());
		List<WebElement> showName = driver.findElements(By.xpath("//select[contains(@class,'select-showName')]"));
		logger.info(showName.size());
		//another way of attributes 
		List<WebElement> sizeBox= driver.findElements(By.xpath("//div[contains(@class, 'select-size')]"));
		List<WebElement> colorBox= driver.findElements(By.xpath("//button[contains(@class,'color-attribute')]"));
		List<WebElement> memoryBox = driver.findElements(By.xpath("//div[contains(@class, 'select-memorySize')]"));
		List<WebElement> widthBox = driver.findElements(By.xpath("//div[contains(@class, 'select-width')]"));
		List<WebElement> showNameBox= driver.findElements(By.cssSelector(".showName"));
		List<WebElement> extendedWarranty = driver.findElements(By.className("options-select"));

		for(int i=1; i<=mainDiv.size();i++) {
			if(colorElement.size()>0|| colorBox.size()>0) {
				test.info("Verify whether the color attribute is able to select from PDP page.");
				attributesSelection.colorSelection();
				logger.info("selected color");
				test.pass("Successfully color attribute is seleccted from pdp page");
				Thread.sleep(1000);
			}if(sizeElement.size()>0|| sizeBox.size()>0 ) {
				test.info("Verify whether the size attribute is able to select from PDP page.");
				attributesSelection.sizeSelction();
				logger.info("selected size");
				test.pass("Successfully size attribute is seleccted from pdp page");
				Thread.sleep(1000);					
			} if(memoryElement.size()>0||  memoryBox.size()>0) {
				test.info("Verify whether the memory attribute is able to select from PDP page.");
				attributesSelection.memorySelection();
				logger.info("selected memory size");
				test.pass("Successfully memory attribute is seleccted from pdp page");
				Thread.sleep(1000);
			} if(widthElements.size()>0 || widthBox.size()>0) {	
				test.info("Verify whether the width attribute is able to select from PDP page.");
				attributesSelection.widthSelection();
				logger.info("selected width");
				test.pass("Successfully width attribute is seleccted from pdp page");
				Thread.sleep(1000);
			}if(showName.size()>0 || showNameBox.size()>0) {
				test.info("Verify whether the show name attribute is able to select from PDP page.");
				Thread.sleep(1000);
				attributesSelection.selectShowName();
				logger.info("Selected show name ");
			}if(extendedWarranty.size()>0) {
				test.info("Verify whether the extended warranty attribute is able to select from PDP page.");
				attributesSelection.selectExtendedWarranty();
				test.pass("Selected extended warranty is seleccted from pdp page");
				logger.info("Selected extended warranty is seleccted from pdp page ");
			}
		}

	}


}


