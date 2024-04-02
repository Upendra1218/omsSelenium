package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;

public class loginPage extends baseClass{

    WebDriver lDriver;

    // Constructor for the loginPage class
    public loginPage(WebDriver rDriver) {
        lDriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }



 // Element for email input field
    @FindBy(xpath ="//input[@id='username']")
      WebElement userName;
    public WebElement getuserName() {
        return userName;
    }

    // Element for password input field
    @FindBy(xpath ="//input[@id='password']")
      WebElement userpassword;
    public WebElement getuserpassword() {
        return userpassword;
    }

    // Element for Login button
    @FindBy(xpath = "//input[@id='Login']")
	public WebElement btnLogin;
    public WebElement clickloginBtn() {
        return btnLogin;
    }
    
    @FindBy(xpath = "//div[@id='brandBand_2']")
	WebElement MainDivLogin;
    public WebElement getMainDivLogin() {
        return MainDivLogin;
    }

    
 
}
