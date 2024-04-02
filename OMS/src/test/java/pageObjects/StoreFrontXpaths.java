package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;
import functionality.Actionsss;

public class StoreFrontXpaths extends baseClass{
	WebDriver lDriver;
	// Constructor for the loginPage class
	public StoreFrontXpaths(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchBarElement;
	public WebElement getSearchElement() {
		return searchBarElement;
	}


	//size attribute
	@FindBy(xpath ="//div[contains(@class, 'select-size')]//span[contains(@class, 'text-center') and not(contains(@disabled, 'disabled'))]")
	List<WebElement> Size; 
	public List<WebElement> getSelectSize(){
		return Size;
	}
	
	//clicked on searched product
	@FindBy(xpath = "//div[contains(@class,'order-md-1 px-2 pt-3 product-container')]//span[@class='name']")
	List<WebElement> searchProduct;
	public List<WebElement> getClickOnSearchedProduct() {
		return searchProduct;
	}

	//addtoCart on Pdp page
	@FindBy(xpath ="//button[contains(@class, 'add-to-cart')]")
	WebElement addtoCartBtn; 
	public WebElement getSelectAddtoCartBtn(){
		return addtoCartBtn;
	}

	@FindBy(xpath ="//select[@class='custom-select form-control select-size']")
	WebElement selectsizelist; 
	public WebElement getselectsizelist(){
		return selectsizelist;
	}
	
	//My mini link
	@FindBy(xpath = "//span[contains(@class, 'minicart-quantity')]")
	WebElement miniCartLink;
	public WebElement getMiniCartLink() throws InterruptedException {
		return miniCartLink;
	}
	
	//singInlink
	@FindBy(xpath = "//div[@class='user mr-3 d-none d-lg-block']//span[@class='user-message']")
	WebElement signInLink;
	public WebElement getsignInLinkLink() throws InterruptedException {
		return signInLink;
	}
	
	// Element for email input field
	@FindBy(name = "loginEmail")
	WebElement email;
	// Method to get the email input field
	public WebElement getEmail() {
		return email;
	}

	// Element for password input field
	@FindBy(name = "loginPassword")
	WebElement password;
	// Method to get the password input field
	public WebElement getPassword() {
		return password;
	}

    // Element for Login button
    @FindBy(xpath = "//button[contains(text(), 'Login')]")
	public WebElement btnLogin;

    // Method to click on the Login button
    public WebElement clickBtnLogin() {
        return btnLogin;
    }
	
	//mini cart view cart btn
	@FindBy(xpath ="//a[contains(text(), 'View Cart')]")
	WebElement viewCartBtn; 
	public WebElement getSelectviewCartBtn(){
		return viewCartBtn;
	}
	
	@FindBy(xpath ="//select[contains(@class,'select-width')]")
	WebElement widthlist; 
	public WebElement getSelectCustomwidthlist(){
		return widthlist;
	}
	
	@FindBy(xpath ="//select[contains(@class,'select-color-swatch')]")
	WebElement dropdownColor; 
	public WebElement getSelectdropdownColor(){
		return dropdownColor;
	}
	
	//mini cart check out btn
	@FindBy(xpath ="//a[contains(text(), 'Checkout')]")
	WebElement checkOutBtn; 
	public WebElement getSelectcheckOutBtn(){
		return checkOutBtn;
	}

	@FindBy(xpath ="//button[contains(text(),'Next: Payment')]")
	WebElement NextPaymentBtn; 
	public WebElement getSelectNextPaymentBtn(){
		return NextPaymentBtn;
	}
	
	//----------------payment details---------------------
	@FindBy(xpath = "//input[@id = 'cardholder-name']")
    private WebElement entercname;

    public WebElement getBrainTreeHoldername() {
        return entercname;
    }
    @FindBy(xpath = "//input[@id = 'credit-card-number']")
    private WebElement entercnumber;

    public WebElement getBrainTreeCardNum() {
        return entercnumber;
    }
    @FindBy(xpath = "//input[@id = 'cvv']")
    private WebElement entercvv;

    public WebElement getBrainTreeCvv() {
        return entercvv;
    }
    @FindBy(xpath = "//input[@id = 'expiration']")
    private WebElement enterexp;

    public WebElement getBrainTreeExp() {
        return enterexp;
    }

    @FindBy(xpath = "//input[@id='braintreeSaveCreditCard']")
    private WebElement savebutton;

    public WebElement getBrainTreeSavebutton() {
        return savebutton;
    }
    @FindBy(xpath ="//select[@id='braintreeCreditCardList']")
    WebElement newCardDropdown;
    
    // Method to get the Braintree credit card list dropdown WebElement
    public WebElement getBrainTreeNewCardDropdown() {
        return newCardDropdown;
    }
    
    @FindBy(xpath ="//option[@id='newCardAccount']")
    WebElement newCard;
    // Method to get the Braintree credit card list dropdown WebElement
    public WebElement getBrainTreeNewCard() {
        return newCard;
    }
    
    @FindBy(xpath ="//button[contains(text(),'Place Order')]")
  	WebElement PlaceOrderBtn;    
  	public WebElement getSelectPlaceOrderBtn(){
  		return PlaceOrderBtn;
  	} 
    // WebElement for Review Order button
    @FindBy(xpath = "//button[@type='submit' and @name='submit' and @value='submit-payment' and (contains(text(), 'Next: Review Order'))]")
    WebElement reviewOrderBtn;
    public WebElement getReviewOrderBtn() {
        return reviewOrderBtn;
    }
    
    @FindBy(xpath="//h2[@class ='order-thank-you-msg']")
	List<WebElement>  orderThankMessageList;
	public List<WebElement> getOrderThankMessageList() {
		return orderThankMessageList;
	}
	
	@FindBy(xpath="//h2[@class ='order-thank-you-msg']")
	WebElement  orderThankMessage;
	public WebElement getOrderThankMessage() {
		return orderThankMessage;
	}
	
	@FindBy(xpath="//span[@class ='summary-details order-number']")
	WebElement  orderNumber;
	public WebElement getOrderNumber() {
		return orderNumber;
	}
	
	@FindBy(xpath="//span[@class ='summary-details order-date']")
	WebElement  orderDate;
	public WebElement getOrderDate() {
		return orderDate;
	}
	
	@FindBy(xpath="//div[@class='payment-details']")
	WebElement  paymentDetailsInOrderConfirmationPage;
	public WebElement getPaymentDetailsInOrderConfirmationPage() {
		return paymentDetailsInOrderConfirmationPage;
	}

	//Mega menu
	public void selectRandomMegaMenu() throws InterruptedException {

		List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class, 'nav navbar-nav')]//li[contains(@class, 'nav-item') and @role='presentation']"));
		int count = elements.size();
		logger.info(count);
		//int randomNumbermenu = random.nextInt(count) + 1;
		int randomNumbermenu = 3;
		if(randomNumbermenu==5 && randomNumbermenu==6) {
			WebElement Topsellers = driver.findElement(By.xpath("(//ul[contains(@class, 'nav navbar-nav')]//li[contains(@class, 'nav-item') and @role='presentation'])[" + randomNumbermenu + "]"));
			Topsellers.click();
		}else {
			List<WebElement> elementsofdrop = driver.findElements(By.xpath("(//li[@class='nav-item dropdown'])[" + randomNumbermenu + "]//a[@class='dropdown-link']"));
			int countdropdown = elementsofdrop.size();
			countdropdown = countdropdown-3;
			int randomNumberitem = random.nextInt(countdropdown) + 1;
			//int randomNumberitem = 3;
			WebElement NavigationRandomMenu = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle text-uppercase font-weight-bold level-1'])[" + randomNumbermenu + "]"));
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.moveToElement(NavigationRandomMenu).perform();
			Thread.sleep(2000);

			WebElement NavigationMenuitem = driver.findElement(By.xpath("((//a[@class='nav-link dropdown-toggle text-uppercase font-weight-bold level-1'])[" + randomNumbermenu + "]/following::a[@role='menuitem'])[" + randomNumberitem + "]"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Actionsss.highlightElement(NavigationMenuitem);
			js.executeScript("arguments[0].click();", new Object[]{NavigationMenuitem});
			Thread.sleep(5000);

			List<WebElement> newArrivalplp = driver.findElements(By.xpath("(//a[contains(text(), 'New Arrivals')])[2]"));
			List<WebElement> womensplp = driver.findElements(By.xpath("//li[@class='breadcrumb-item']/a[contains(text(), 'Women')]"));
			List<WebElement> menplp = driver.findElements(By.xpath("//li[@class='breadcrumb-item']/a[contains(text(), 'Men')]"));
			if(newArrivalplp.size()>0) {
				String[] newArrivalsCategory= {"WOMENS", "MENS", "ELECTRONICS"};
				WebElement pageTitle = driver.findElement(By.xpath("//h1[contains(@class, 'page-title')]"));
				String pageTitleText = pageTitle.getText();
				test.info("Verify the navigation of NewArrivals Category");
				if (pageTitleText.equals(newArrivalsCategory[randomNumberitem-1])) {
					test.pass("Successfully Hovered on the NewArrivals Category  And clicked on " + pageTitleText + " and Navigated to "+  pageTitleText+" PLP page");
					logger.info("click Success NewArrivals of  " + pageTitleText + "");
				}
			}else if(womensplp.size()>0) {        	
				String[] womensCategory= {"OUTFITS", "TOPS", "DRESSES","BOTTOMS","JACKETS & COATS","FEELING RED","EARRINGS","BRACELETS","NECKLACES","SCARVES","SHOES"};
				WebElement pageTitle = driver.findElement(By.xpath("//h1[contains(@class, 'page-title')]"));
				String pageTitleText = pageTitle.getText();
				test.info("Verify the navigation of Womens Category");
				if (pageTitleText.equals(womensCategory[randomNumberitem-1])) {
					test.pass("Successfully Hovered on the Womens Category  And clicked on " + pageTitleText + " and Navigated to "+  pageTitleText+" PLP page");
					logger.info("click Success Womens of  " + pageTitleText + "");
				}
			}else if(menplp.size()>0) {
				String[] mensCategory= {"SUITS","JACKETS & COATS","DRESS SHIRTS","SHORTS","PANTS","TIES","GLOVES","LUGGAGE"};
				WebElement pageTitle = driver.findElement(By.xpath("//h1[contains(@class, 'page-title')]"));
				String pageTitleText = pageTitle.getText();
				test.info("Verify the navigation of Mens Category");
				if (pageTitleText.equals(mensCategory[randomNumberitem-1])) {
					test.pass("Successfully Hovered on the Mens Category  And clicked on " + pageTitleText + " and Navigated to "+  pageTitleText+" PLP page");
					logger.info("click Success Mens of  " + pageTitleText + "");
				}
			}else {
				String[] electronicsCategory= {"TELEVISIONS","DIGITAL CAMERAS","IPOD & MP3 PLAYERS","GPS NAVIGATION","GAMING"};
				WebElement pageTitle = driver.findElement(By.xpath("//h1[contains(@class, 'page-title')]"));
				String pageTitleText = pageTitle.getText();
				test.info("Verify the navigation of Electronics Category");
				if (pageTitleText.equals(electronicsCategory[randomNumberitem-1])) {
					test.pass("Successfully Hovered on the Electronics Category  And clicked on " + pageTitleText + " and Navigated to "+  pageTitleText+" PLP page");
					logger.info("click Success Electronics of  " + pageTitleText + "");
				}
			}
		}
	}

}
