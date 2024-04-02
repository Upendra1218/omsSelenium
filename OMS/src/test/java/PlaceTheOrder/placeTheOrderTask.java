package PlaceTheOrder;

import baseClass.baseClass;
import browser.StroreFrontLaunching;
import data.TestData;
import functionality.Actionsss;
import functionality.allAttributesSelection;
import pageObjects.StoreFrontXpaths;

public class placeTheOrderTask extends baseClass{
	
	private static StoreFrontXpaths SFX = new StoreFrontXpaths(driver);
	private static TestData TD = new TestData();

    //search fuctionality
    public static void searchAProduct() throws Exception {
    	StroreFrontLaunching.VerifingStoreURLLaunching();
    	Thread.sleep(3000);
    	verifyThatuserLogin();
    	Thread.sleep(2000);
		Actionsss.sendKeys(SFX.getSearchElement(),TD.Search_Home_Page_IP_Data, TD.Search_Home_Page_IP_FieldName );
		Thread.sleep(3000);
		Actionsss.randomElementFromList(SFX.getClickOnSearchedProduct());
		Thread.sleep(3000);
		allAttributesSelection.selectTheAttributesInPdp();
		Actionsss.CombinedClick(SFX.getSelectAddtoCartBtn());
	    Thread.sleep(3000);
	    Actionsss.CombinedClick(SFX.getMiniCartLink());
	    Thread.sleep(1000);
	    Actionsss.CombinedClick(SFX.getSelectcheckOutBtn());
	    Thread.sleep(3000);
	    Actionsss.CombinedClick(SFX.getSelectNextPaymentBtn());
	    Thread.sleep(3000);
	    addNewCard();
	    Thread.sleep(2000);
	    Actionsss.CombinedClick(SFX.getReviewOrderBtn());
	    Thread.sleep(3000);
	    Actionsss.CombinedClick(SFX.getSelectPlaceOrderBtn());
	    Thread.sleep(2000);
	    validatePlacetheOrderPage();
	    Thread.sleep(2000);
	    orderNumberAndOrderDate();
	    
	    
	    
	}
    
    public static void verifyThatuserLogin() throws Exception {
	    // Click on the "Gift Card" link
	    Actionsss.CombinedClick(SFX.getsignInLinkLink());
	    // Wait for 3 seconds to allow the action to complete
        Thread.sleep(2000);
     // Enter valid email and password
        Actionsss.sendKeys(SFX.getEmail(), TD.userNameStoreFront,TD.UserName_Login_IP_FieldName);      
        Actionsss.sendKeys(SFX.getPassword(), TD.passwordStoreFront,TD.Passowrd_Login_IP_FieldName);   
        Actionsss.CombinedClick(SFX.clickBtnLogin());
        logger.info("click on the submit button");
        Thread.sleep(2000);
	}
    
    //-------------------payment details----
    private static final String cardHolderName = "Test123";
	private static final String cardNum = "cardNumber";
	private static final String  expDate = "Expired date";
	private static final String  creditCardCvv= "Cvv";
	private static final String  braintreeexpDate = "12/30";
    
    public static void braintree() throws Exception {
		 test.info("Entering card name for brain tree payment");
		 brainTreeCardHolderName();
		 test.info("Entering card number for brain tree payment ");
		 brainTreeCardNumber();
		 test.info("Entering cvv for brain tree payment");
		 brainTreeCvv();
		 test.info("Entering exp for brain tree payment");
		 brainTreeExpDate();	
	}
	
	public static  void brainTreeCardHolderName() throws Exception {
		driver.switchTo().frame("braintree-hosted-field-cardholderName");
		Actionsss.sendKeys(SFX.getBrainTreeHoldername(),"Test123",cardHolderName +"is Test123 ");	
		driver.switchTo().defaultContent();	
	}
	
	public static void brainTreeCardNumber() throws Exception {				
		driver.switchTo().frame("braintree-hosted-field-number");
		String[] cardNumbers = {
   			
	               "378282246310005",
	               "371449635398431",   	    
	     	       "5555555555554444",	        
	     	       "2223000048400011",
	    		   "4111111111111111"
	            };
		// Generate a random index to select a card number
    
       int randomIndex = random.nextInt(cardNumbers.length);
       // Send the randomly selected card number
		Actionsss.sendKeys(SFX.getBrainTreeCardNum(),"4111111111111111",cardNum + cardNumbers[randomIndex]);
		 // Extract the last four digits
       String lastFourDigits = cardNum.substring(cardNum.length() - 4);
		creditCardNumber=lastFourDigits;	
		driver.switchTo().defaultContent();
	}
	
	public static void brainTreeCvv() throws Exception {			
		driver.switchTo().frame("braintree-hosted-field-cvv");
		Actionsss.sendKeys(SFX.getBrainTreeCvv(), "3455",creditCardCvv  +" is 3455");	
		driver.switchTo().defaultContent();
	}
	
	public static void brainTreeExpDate() throws Exception {	
		driver.switchTo().frame("braintree-hosted-field-expirationDate");
		Actionsss.sendKeys(SFX.getBrainTreeExp(),  braintreeexpDate ,expDate +  braintreeexpDate  );	
		driver.switchTo().defaultContent();
	}
	
	

	
	public static void addNewCard() throws Exception {
		Actionsss.CombinedClick(SFX.getBrainTreeNewCardDropdown());
		Thread.sleep(1000);
		Actionsss.CombinedClick(SFX.getBrainTreeNewCard());
		Thread.sleep(1000);
		braintree();
	}
	
	
	public static void validatePlacetheOrderPage() throws InterruptedException {
		if(Actionsss.countofElements(SFX.getOrderThankMessageList())) {
	    	 String ActualTitleofPlacetheOrder = Actionsss.getTextOfElement(SFX.getOrderThankMessage());
	    	 logger.info(ActualTitleofPlacetheOrder);
		     String ExpectedTitlePlacetheOrder = "Thank you for your order.";
	    	 test.info("verifying  the order is placed");
	
		    if (ActualTitleofPlacetheOrder.equals(ExpectedTitlePlacetheOrder)) {
		        test.pass("Successfully Order is Placed and Thank you for your order message is displayed");
		        logger.info("Successfully Order is Placed and Thank you for your order message is displayed");
		    } else {
		        test.fail( "The page Title does not match expected " + ExpectedTitlePlacetheOrder + " " + "  but found" + " " + ActualTitleofPlacetheOrder + " ");
		        logger.info("Click failed");
		    }		    
		}
	}    
	
	//validate the order number and date of order
		public static void orderNumberAndOrderDate() throws InterruptedException {
			if(Actionsss.countofElements(SFX.getOrderThankMessageList())) {
			   String orderNumber = Actionsss.getTextOfElement(SFX.getOrderNumber());
			  
		        test.pass("The Order number is "+ orderNumber);
		        logger.info("The Order number is "+ orderNumber);
			    
			    //order date
			    String OrderDate = Actionsss.getTextOfElement(SFX.getOrderDate());
		        test.pass("The Ordered date is "+  OrderDate);
		        
		        //paymnet details
			    String paymentDetails = Actionsss.getTextOfElement(SFX.getPaymentDetailsInOrderConfirmationPage());
		      
		        test.pass("Payment is done with "+ paymentDetails);
		        logger.info("Payment is done with"+ paymentDetails);
			}
					
		}

    
}
