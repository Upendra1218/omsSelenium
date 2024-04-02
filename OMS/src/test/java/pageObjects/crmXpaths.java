package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class crmXpaths {
	
	 WebDriver lDriver;
    // Constructor for the loginPage class
    public crmXpaths(WebDriver rDriver) {
        lDriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }
    
   
  //input quick find
  @FindBy(xpath =" //input[@class='filter-box input']")
  WebElement quickFindBox;
  public WebElement getquickFindBox() {
      return quickFindBox;
  }
  
  //company info 
  @FindBy(xpath =" //mark[text()='Company Information']")
  WebElement companyInfo;
  public WebElement getcompanyInfo() {
      return companyInfo;
  }
  
  //order settings
  @FindBy(xpath ="//mark[text()='Order Settings']")
  WebElement orderSettings;
  public WebElement getorderSettings() {
      return orderSettings;
  }
  //org edition 
  @FindBy(xpath ="//td[text()='Developer Edition']")
  WebElement orgEdition;
  public WebElement getorgEdition() {
      return orgEdition;
  }
  
  
  //curreny name
  @FindBy(xpath ="//td[text()='English (United States) - USD']")
  WebElement currencyName;
  public WebElement getcurrencyName() {
      return currencyName;
  }
  
  @FindBy(xpath = "//td[text()='English (United States) - USD']")
  List<WebElement>  currencyNamelist;
  public List<WebElement>  getcurrencyNamelist() {
      return currencyNamelist;
  }
  
  @FindBy(xpath = "//input[@title='Edit']")
  List<WebElement>  editBtninCIlist;
  public List<WebElement>  geteditBtninCIlist() {
      return editBtninCIlist;
  }
  //edit button
  @FindBy(xpath ="//input[@title='Edit']")
  WebElement editBtninCI;
  public WebElement geteditBtninCI() {
      return editBtninCI;
  }
  
  //currenct drop down
  @FindBy(xpath ="//select[@id='DefaultCurrencyIsoCode']")
  WebElement dropdownCurrenyList;
  public WebElement getdropdownCurrenyList() {
      return dropdownCurrenyList;
  }
  
  
  //currenct drop down
  @FindBy(xpath ="//input[@name='save']")
  WebElement saveBtnInCIEditPage;
  public WebElement getsaveBtnInCIEditPage() {
      return saveBtnInCIEditPage;
  }
  
  //---------------------Order setting Page Xpaths--------------------
  
  @FindBy(xpath ="//input[@class='ReductionOrdersEnabled']")
  WebElement ReductionOrdersOSPage;
  public WebElement getReductionOrdersOSPage() {
      return ReductionOrdersOSPage;
  }
  
  @FindBy(xpath ="//input[@class='NegativeOIQuantityEnabled']")
  WebElement NegativeOIQuantityOSPage;
  public WebElement getNegativeOIQuantityOSPage() {
      return NegativeOIQuantityOSPage;
  }
  
  @FindBy(xpath ="//input[@class='ZeroOIQuantityEnabled']")
  WebElement ZeroOIQuantityOSPage;
  public WebElement getZeroOIQuantityOSPage() {
      return ZeroOIQuantityOSPage;
  }
  
  @FindBy(xpath ="//input[@class='OptionalPricebookEnabled']")
  WebElement OptionalPricebookOSPage;
  public WebElement getOptionalPricebookOSPage() {
      return OptionalPricebookOSPage;
  }
  
  @FindBy(xpath ="//input[@class='OrderEventsEnabled']")
  WebElement OrderEventsOSPage;
  public WebElement getOrderEventsOSPage() {
      return OrderEventsOSPage;
  }
  
  @FindBy(xpath ="//input[@class='EnhancedCommerceOrders']")
  WebElement EnhancedCommerceOrdersOSPage;
  public WebElement getEnhancedCommerceOrdersOSPage() {
      return EnhancedCommerceOrdersOSPage;
  }
  
  @FindBy(xpath ="//input[@value='Save']")
  WebElement saveBtnInOSPage;
  public WebElement getsaveBtnInOSPage() {
      return saveBtnInOSPage;
  }
  
  //----------------lists------------------------------

  @FindBy(xpath = "//input[@class='ReductionOrdersEnabled' and @checked]")
  List<WebElement>  ReductionOrdersOSlist;
  public List<WebElement>  getReductionOrdersOSlist() {
      return ReductionOrdersOSlist;
  }
  
  @FindBy(xpath = "//input[@class='NegativeOIQuantityEnabled'and @checked]")
  List<WebElement>  NegativeOIQuantityOSlist;
  public List<WebElement>  getNegativeOIQuantityOSlist() {
      return NegativeOIQuantityOSlist;
  }
  
  @FindBy(xpath = "//input[@class='ZeroOIQuantityEnabled'and @checked]")
  List<WebElement>  ZeroOIQuantityOSlist;
  public List<WebElement>  getZeroOIQuantityOSlist() {
      return ZeroOIQuantityOSlist;
  }
  
  @FindBy(xpath = "//input[@class='OptionalPricebookEnabled'and @checked]")
  List<WebElement>  OptionalPricebookOSlist;
  public List<WebElement>  getOptionalPricebookOSlist() {
      return OptionalPricebookOSlist;
  }
  
  @FindBy(xpath = "//input[@class='OrderEventsEnabled'and @checked]")
  List<WebElement>  OrderEventsOSlist;
  public List<WebElement>  getOrderEventsOSlist() {
      return OrderEventsOSlist;
  }
  
  @FindBy(xpath = "//input[@class='EnhancedCommerceOrders' and @checked]")
  List<WebElement>  EnhancedCommerceOrderslist;
  public List<WebElement>  getEnhancedCommerceOrderslist() {
      return EnhancedCommerceOrderslist;
  }

  

  //---------------------- person xpaths ------------------------------
 
  
  //person accounts
  @FindBy(xpath ="//mark[text()='Person Accounts']")
  WebElement PersonAccounts;
  public WebElement getPersonAccounts() {
      return PersonAccounts;
  }
  
  //alreday enable the person Account
  @FindBy(xpath ="//h2[text()='Person Accounts Enabled']")
  List<WebElement> PersonAccountEnabled;
  public List<WebElement> getPersonAccountEnabled() {
      return PersonAccountEnabled;
  }
  
  @FindBy(xpath ="//div[@title='Step 1 of Person Accounts enablement complete']")
  List<WebElement> PersonAccountVOIlist;
  public List<WebElement> getPersonAccountVOIlist() {
      return PersonAccountVOIlist;
  }
  
  @FindBy(xpath ="//button[@title='View Org Impacts']")
  WebElement PersonAccountVOI;
  public WebElement getPersonAccountVOI() {
      return PersonAccountVOI;
  }

  
  @FindBy(xpath ="//span[contains(@class, 'slds-checkbox_faux')]")
  WebElement PersonAccountVOI_CB;
  public WebElement getPersonAccountVOI_CB() {
      return PersonAccountVOI_CB;
  }
  
  @FindBy(xpath ="//button[@title ='Continue']")
  WebElement PersonAccountVOI_Continue;
  public WebElement getPersonAccountVOI_Continue() {
      return PersonAccountVOI_Continue;
  }

  @FindBy(xpath ="//a[@title ='Create Accounts Record Type in a new tab']")
  WebElement PersonAccountVOI_CARTNT;
  public WebElement getPersonAccountVOI_CARTNT() {
      return PersonAccountVOI_CARTNT;
  }
  
  @FindBy(xpath ="//a[@title ='Create Accounts Record Type in a new tab']")
  List<WebElement> PersonAccountVOI_CARTNTlist;
  public List<WebElement> getPersonAccountVOI_CARTNTlist() {
      return PersonAccountVOI_CARTNTlist;
  }
  
  @FindBy(xpath ="//button[@title='Record Type']")
  WebElement PS_CRT_New;
  public WebElement getPS_CRT_New() {
      return PS_CRT_New;
  }

  //Header of person account
  @FindBy(xpath ="//h1[text()='Person Accounts']")
  WebElement PS_Header;
  public WebElement getPS_Header() {
      return PS_Header;
  }

  @FindBy(xpath ="//div[@class='slds-page-header']")
  WebElement Ac_RT_Header;
  public WebElement getAc_RT_Header() {
      return Ac_RT_Header;
  }


  @FindBy(xpath ="//h1[text()='New Record Type']")
  WebElement Ac_RT_New_Header;
  public WebElement getAc_RT_New_Header() {
      return Ac_RT_New_Header;
  }

  //record type input 
  @FindBy(xpath ="//input[@id='p2']")
  WebElement New_RT_Label;
  public WebElement getNew_RT_Label() {
      return New_RT_Label;
  }
  
  //record type input 
  @FindBy(xpath ="//input[@id='p52']")
  WebElement New_RT_Name;
  public WebElement getNew_RT_Name() {
      return New_RT_Name;
  }
  
  @FindBy(xpath ="//input[@title='Next']")
  WebElement New_RT_NextBtn;
  public WebElement getNew_RT_NextBtn() {
      return New_RT_NextBtn;
  }
  
  @FindBy(xpath ="//select[@title='-- Select Page Layout --']")
  WebElement New_RT_Select_Layout;
  public WebElement getNew_RT_Select_Layout() {
      return New_RT_Select_Layout;
  }
  
  @FindBy(xpath ="//input[@title='Save']")
  WebElement New_RT_SaveBtn;
  public WebElement getNew_RT_SaveBtn() {
      return New_RT_SaveBtn;
  }
  
  @FindBy(xpath ="//div[@class='bPageTitle']")
  WebElement New_RT_NewPage;
  public WebElement getNew_RT_NewPage() {
      return New_RT_NewPage;
  }
  
  @FindBy(xpath ="//button[@title='Enable Person Accounts']")
  WebElement EnablePersonAccounts;
  public WebElement getEnablePersonAccounts() {
      return EnablePersonAccounts;
  }
  
  @FindBy(xpath ="//div[@class='slds-modal__footer']//button[@title='Enable Person Accounts']")
  WebElement EnablePersonAccountsPopUP;
  public WebElement getEnablePersonAccountsPopUP() {
      return EnablePersonAccountsPopUP;
  }
  
  //---------------------- Order Management -------------------------------------------
  
  //order management
  @FindBy(xpath ="//mark[text()='Order Management']")
  WebElement OrderManagement;
  public WebElement getOrderManagement() {
      return OrderManagement;
  }
  
  //Header
  @FindBy(xpath ="//span[text()='Order Management']")
  WebElement OrderManagementHeader;
  public WebElement getOrderManagementHeader() {
      return OrderManagementHeader;
  }
  
  
  //check box
  @FindBy(xpath ="//span[@class='slds-checkbox_faux']")
  List<WebElement> OrderManagementCheckBox;
  public List<WebElement> getOrderManagementCheckBox() {
      return OrderManagementCheckBox;
  }

  //Active check boxes
  @FindBy(xpath ="//span[@class='slds-checkbox_on']")
  List<WebElement> OrderManagementActive;
  public List<WebElement> getOrderManagementActive() {
      return OrderManagementActive;
  }
  
  //inactive
  @FindBy(xpath ="//span[@class='slds-checkbox_off']")
  List<WebElement> OrderManagementInActive;
  public List<WebElement> getOrderManagementInActive() {
      return OrderManagementInActive;
  }
  
  //---------------------Omni Channel Inverntry-----------------------
//omni channel invertry
  @FindBy(xpath ="//mark[text()='Omnichannel Inventory']")
  WebElement Omnichannel;
  public WebElement getOmnichannel() {
      return Omnichannel;
  }
  
  //Header
  @FindBy(xpath ="//span[text()='Omnichannel Inventory']")
  WebElement OmnichannelHeader;
  public WebElement getOmnichannelHeader() {
      return OmnichannelHeader;
  }


  
  @FindBy(xpath ="//h3[text()='Tenant Group ID']")
  WebElement OmnichannelHeaderEnable;
  public WebElement getOmnichannelHeaderEnable() {
      return OmnichannelHeaderEnable;
  }
  
  //-----------------connect with b2c --------------
  @FindBy(xpath ="//mark[text()='B2C Commerce Connections']")
  WebElement connectB2c;
  public WebElement getconnectB2c() {
      return connectB2c;
  }

  @FindBy(xpath ="//span[text()='B2C Commerce Connections']")
  WebElement connectB2cHeader;
  public WebElement getconnectB2cHeader() {
      return connectB2cHeader;
  }

  //New connection
  @FindBy(xpath ="//input[@value='New Connection']")
  WebElement B2cNewConnection;
  public WebElement getB2cNewConnection() {
      return B2cNewConnection;
  }
  
  //New connection
  @FindBy(xpath ="//h2[text()='Connection Request']")
  WebElement B2cNewConnectionHeader;
  public WebElement getB2cNewConnectionHeader() {
      return B2cNewConnectionHeader;
  }
  

  //Connection Name
  @FindBy(xpath ="//input[@title='Connection name for instance connecting.']")
  WebElement B2cNewConnectionName;
  public WebElement getB2cNewConnectionName() {
      return B2cNewConnectionName;
  }
  //B2cInstance Id
  @FindBy(xpath ="//input[@title='The URL used to access the remote application.']")
  WebElement B2cNewConnectionID;
  public WebElement getB2cNewConnectionID() {
      return B2cNewConnectionID;
  }
 //save Btn
  @FindBy(xpath ="//a[text()='Save']")
  WebElement B2cNewConnectionSaveBtn;
  public WebElement getB2cNewConnectionSaveBtn() {
      return B2cNewConnectionSaveBtn;
  }
  
  //allow button
  @FindBy(xpath ="//button[contains(text(), 'Allow')]")
  WebElement allowBtn;
  public WebElement getallowBtn() {
      return allowBtn;
  }
  
  //select div
  @FindBy(xpath ="//span[@class='section availableOptionsSection']//select[@multiple='multiple']")
  WebElement SelectDivforAvaliableOptions;
  public WebElement getSelectDivforAvaliableOptions() {
      return SelectDivforAvaliableOptions;
  }
  
  //add arrow
  @FindBy(xpath ="//input[@class='btn add']")
  WebElement addArrowBtn;
  public WebElement getaddArrowBtn() {
      return addArrowBtn;
  }

  //Save btn
  @FindBy(xpath ="//input[@class='btn' and @value='Save']")
  WebElement saveBtn;
  public WebElement getsaveBtn() {
      return saveBtn;
  }
  
  //pop up save btn
  @FindBy(xpath ="//input[contains(@id, 'requestFeatureSave')]")
  WebElement popUpSaveBtn;
  public WebElement getpopUpSaveBtn() {
      return popUpSaveBtn;
  }
  

  //provision state 
  @FindBy(xpath ="//td[text()='Provisioned']")
  List<WebElement> ProvisionState;
  public List<WebElement> getProvisionState() {
      return ProvisionState;
  }
  
  
  //---------------- path settings -------------------
//path settings 
  @FindBy(xpath ="//mark[text()='Path Settings']")
  WebElement pathsettings;
  public WebElement getpathsettings() {
      return pathsettings;
  }
  
  @FindBy(xpath ="//span[text()='Path Settings']")
  WebElement pathsettingsHeader;
  public WebElement getpathsettingsHeader() {
      return pathsettingsHeader;
  }
  
  @FindBy(xpath ="//span[text()='Enable']")
  WebElement pathsettingsEnable;
  public WebElement getpathsettingsEnable() {
      return pathsettingsEnable;
  }
  
  @FindBy(xpath ="//span[text()='New Path']")
  List<WebElement> pathsettingsNewPath;
  public  List<WebElement> getpathsettingsNewPath() {
      return pathsettingsNewPath;
  }
  


  //-----------------Deployment ---------------------------------------
  

  
  @FindBy(xpath ="//input[@id='installKeyBox']")
  WebElement deploymentKey;
  public WebElement getdeploymentKey() {
      return deploymentKey;
  }
  
  @FindBy(xpath ="//span[text()='Continue']")
  WebElement ContinueBtn;
  public WebElement getContinueBtn() {
      return ContinueBtn;
  }
  
  @FindBy(xpath ="//button[@title='Install']")
  WebElement installBtn;
  public WebElement getinstallBtn() {
      return installBtn;
  }
  
  @FindBy(xpath ="//span[text()='Installation Complete!']")
  WebElement downloadCOmpleted;
  public WebElement getdownloadCOmpleted() {
      return downloadCOmpleted;
  }
  
  @FindBy(xpath ="//span[text()='Done']")
  WebElement doneBtn;
  public WebElement getdoneBtn() {
      return doneBtn;
  }
  
  @FindBy(xpath ="//h1[text()='SprintOneStagingPackage']")
  List<WebElement> updatepackager;
  public  List<WebElement> getupdatepackager() {
      return updatepackager;
  }
  


  

  
  //------------------ post deployment--------------------------
  
  //object manager
  @FindBy(xpath ="//ul[@class='tabBarItems slds-grid']//span[text()='Object Manager']")
  WebElement ObjectManager;
  public WebElement getObjectManager() {
      return ObjectManager;
  }
  //quick find
  @FindBy(xpath ="//input[@id='globalQuickfind']")
  WebElement Quickfind;
  public WebElement getQuickfind() {
      return Quickfind;
  }

  //product serach
  @FindBy(xpath ="//a[text()='Product']")
  WebElement productOM;
  public WebElement getproductOM() {
      return productOM;
  }

  @FindBy(xpath ="//a[text()='Fields & Relationships']")
  WebElement product_O_FR;
  public WebElement getproduct_O_FR() {
      return product_O_FR;
  }
  
  
  @FindBy(xpath ="//span[text()='Product Family']")
  WebElement product_O_FR_PF;
  public WebElement getproduct_O_FR_PF() {
      return product_O_FR_PF;
  }
  
  @FindBy(xpath ="//input[@title ='New Product Family Picklist Values']")
  WebElement product_O_FR_PF_N;
  public WebElement getproduct_O_FR_PF_N() {
      return product_O_FR_PF_N;
  }
  
  @FindBy(xpath ="//textarea[@id='p1']")
  WebElement product_O_FR_PF_TA;
  public WebElement getproduct_O_FR_PF_TA() {
      return product_O_FR_PF_TA;
  }
  
  @FindBy(xpath ="//input[@title ='Save']")
  WebElement product_O_FR_PF_S;
  public WebElement getproduct_O_FR_PF_S() {
      return product_O_FR_PF_S;
  }
  
  
  //headers
  @FindBy(xpath ="//h1//span[text()='Object Manager']")
  WebElement OM_Header;
  public WebElement getOM_Header() {
      return OM_Header;
  }
  
  @FindBy(xpath ="//h1//span[text()='Product']")
  WebElement product_Header;
  public WebElement getproduct_Header() {
      return product_Header;
  }
  
  @FindBy(xpath ="//h2//span[text()='Fields & Relationships']")
  WebElement product_FR;
  public WebElement getproduct_FR() {
      return product_FR;
  }
  @FindBy(xpath ="//h2[text()=' Product Family']")
  WebElement product_FH;
  public WebElement getproduct_FH() {
      return product_FH;
  }
  
  @FindBy(xpath ="//td[text()='Shipping']")
  List<WebElement> product_FH_ALE;
  public List<WebElement> getproduct_FH_ALE() {
      return product_FH_ALE;
  }
  
  //----------orderstatus-----------------

  @FindBy(xpath ="//a[text()='Order']")
  WebElement orderOM;
  public WebElement getorderOM() {
      return orderOM;
  }

  @FindBy(xpath ="//a//span[text()='Status']")
  WebElement order_O_FR_PF;
  public WebElement getorder_O_FR_PF() {
      return order_O_FR_PF;
  }
  
  @FindBy(xpath ="//input[@title ='New Order Status Picklist Values']")
  WebElement order_O_FR_PF_N;
  public WebElement getorder_O_FR_PF_N() {
      return order_O_FR_PF_N;
  }
  
  @FindBy(xpath ="//input[@id='p1']")
  WebElement order_O_FR_PF_N_IP_L;
  public WebElement getorder_O_FR_PF_N_IP_L() {
      return order_O_FR_PF_N_IP_L;
  }
  
  @FindBy(xpath ="//input[@id='p3']")
  WebElement order_O_FR_PF_N_IP_API;
  public WebElement getorder_O_FR_PF_N_IP_API() {
      return order_O_FR_PF_N_IP_API;
  }
  
  @FindBy(xpath ="//select[@id='p5']")
  WebElement order_O_FR_PF_N_IP_Se;
  public WebElement getorder_O_FR_PF_N_IP_Se() {
      return order_O_FR_PF_N_IP_Se;
  }
  
  @FindBy(xpath ="//input[@title='Save']")
  WebElement order_O_FR_PF_N_S;
  public WebElement getorder_O_FR_PF_N_S() {
      return order_O_FR_PF_N_S;
  }
  

  
  @FindBy(xpath ="//h1//span[text()='Order']")
  WebElement Order_Header;
  public WebElement getOrder_Header() {
      return Order_Header;
  }
  @FindBy(xpath ="//h2[text()=' Status']")
  WebElement Order_SH;
  public WebElement getOrder_SH() {
      return Order_SH;
  }
  
  @FindBy(xpath ="//td[text()='In Review']")
  List<WebElement> order_FH_ALE_IR;
  public List<WebElement> getorder_FH_ALE_IR() {
      return order_FH_ALE_IR;
  }
  @FindBy(xpath ="//td[text()='Approved']")
  List<WebElement> order_FH_ALE_AP;
  public List<WebElement> getorder_FH_ALE_AP() {
      return order_FH_ALE_AP;
  }
  @FindBy(xpath ="//td[text()='Fufilled']")
  List<WebElement> order_FH_ALE_FF;
  public List<WebElement> getorder_FH_ALE_FF() {
      return order_FH_ALE_FF;
  }
  @FindBy(xpath ="//td[text()='Canceled']")
  List<WebElement> order_FH_ALE_C;
  public List<WebElement> getorder_FH_ALE_C() {
      return order_FH_ALE_C;
  }
  @FindBy(xpath ="//td[text()='Returned']")
  List<WebElement> order_FH_ALE_R;
  public List<WebElement> getorder_FH_ALE_R() {
      return order_FH_ALE_R;
  }
  
  //--------------order summery -----------------------
  
  //product serach
  @FindBy(xpath ="//a[text()='Order Summary']")
  WebElement OrderSummeryOM;
  public WebElement getOrderSummeryOM() {
      return OrderSummeryOM;
  }
  
  @FindBy(xpath ="//a//span[text()='Status']")
  WebElement OrderSummery_O_FR_PF;
  public WebElement getOrderSummery_O_FR_PF() {
      return OrderSummery_O_FR_PF;
  }
  @FindBy(xpath ="//input[@title ='New Status Picklist Values']")
  WebElement OrderSummery_O_FR_PF_N;
  public WebElement getOrderSummery_O_FR_PF_N() {
      return OrderSummery_O_FR_PF_N;
  }
  @FindBy(xpath ="//textarea[@id='p1']")
  WebElement OrderSummery_O_FR_PF_TA;
  public WebElement getOrderSummery_O_FR_PF_TA() {
      return OrderSummery_O_FR_PF_TA;
  }
  @FindBy(xpath ="//input[@title ='Save']")
  WebElement OrderSummery_O_FR_PF_S;
  public WebElement getOrderSummery_O_FR_PF_S() {
      return OrderSummery_O_FR_PF_S;
  }
  
  //--- cc login details ---------------------

  @FindBy(xpath ="//input[@id='idToken2']")
  WebElement ccuserName;
  public WebElement getccuserName() {
      return ccuserName;
  }

  @FindBy(xpath ="//input[@id='loginButton_0']")
  WebElement ccLoginBtn;
  public WebElement getccLoginBtn() {
      return ccLoginBtn;
  }
 
  @FindBy(xpath ="//input[@type='password' and @id='idToken2'] ")
  WebElement ccPWD;
  public WebElement getccPWD() {
      return ccPWD;
  }

  
  @FindBy(xpath ="//span[@class='sod_select ']")
  WebElement selectSite;
  public WebElement getselectSite() {
      return selectSite;
  }
  
  @FindBy(xpath ="//span[@title='RefArch']")
  WebElement refrachsiteSelect;
  public WebElement getrefrachsiteSelect() {
      return refrachsiteSelect;
  }
  
  //-------------------create a product -------------------------

  @FindBy(xpath ="//div[@class='slds-icon-waffle']")
  WebElement appLauncher;
  public WebElement getappLauncher() {
      return appLauncher;
  }
  
  @FindBy(xpath ="//input[@class='slds-input']")
  WebElement appLauncherSearch;
  public WebElement getappLauncherSearch() {
      return appLauncherSearch;
  }

  @FindBy(xpath ="//a[@data-label='Products']//b")
  WebElement prodcutsTab;
  public WebElement getprodcutsTab() {
      return prodcutsTab;
  }
  
  @FindBy(xpath ="//a[@title='New']")
  WebElement Newprodcut;
  public WebElement getNewprodcut() {
      return Newprodcut;
  }
  
  
  @FindBy(xpath ="(//input[@class=' input'])[1]")
  WebElement prodcutName;
  public WebElement getprodcutName() {
      return prodcutName;
  }
  
  @FindBy(xpath ="(//input[@class=' input'])[2]")
  WebElement prodcutCode;
  public WebElement getprodcutCode() {
      return prodcutCode;
  }
  
  
  @FindBy(xpath ="//input[@type='checkbox' and not(contains(@class, 'keyboardMode--trigger'))]")
  WebElement ActiveCheckBox;
  public WebElement getActiveCheckBox() {
      return ActiveCheckBox;
  }
  
  @FindBy(xpath ="//a[text()='--None--']")
  WebElement prodcutNone;
  public WebElement getprodcutNone() {
      return prodcutNone;
  }
  
  @FindBy(xpath ="//ul[@role='presentation']//li[@role='presentation']//a[@title='Shipping']")
  WebElement prodcutShipping;
  public WebElement getprodcutShipping() {
      return prodcutShipping;
  }
  
  @FindBy(xpath ="//textarea[@role ='textbox']")
  WebElement prodcutDescription;
  public WebElement getprodcutDescription() {
      return prodcutDescription;
  }
  
  @FindBy(xpath ="//button[@title ='Save']")
  WebElement prodcutSaveBtn;
  public WebElement getprodcutSaveBtn() {
      return prodcutSaveBtn;
  }
	
  @FindBy(xpath ="//h2[text() ='New Product']")
  WebElement prodcutFormHeader;
  public WebElement getprodcutFormHeader() {
      return prodcutFormHeader;
  }
	
  @FindBy(xpath ="//div[@aria-label='Recently Viewed|Products|List View']")
  WebElement prodcutlistdiv;
  public WebElement getprodcutlistdiv() {
      return prodcutlistdiv;
  }
  
  //---------------------order delivery methods --------------
  
  @FindBy(xpath ="//a[@data-label='Order Delivery Methods']//b")
  WebElement orderDeliveryMethodTab;
  public WebElement getorderDeliveryMethodTab() {
      return orderDeliveryMethodTab;
  }
  
  @FindBy(xpath ="//a[@title='New']")
  WebElement NeworderDeliveryMethod;
  public WebElement getNeworderDeliveryMethod() {
      return NeworderDeliveryMethod;
  }
  
  
  @FindBy(xpath ="//div[@aria-label='Recently Viewed|Order Delivery Methods|List View']")
  WebElement ListVieworderDeliveryMethod;
  public WebElement getListVieworderDeliveryMethod() {
      return ListVieworderDeliveryMethod;
  }
  
  @FindBy(xpath ="//input[@name='Name']")
  WebElement orderDeliveryMethodName;
  public WebElement getorderDeliveryMethodName() {
      return orderDeliveryMethodName;
  }
  
  @FindBy(xpath ="//input[@name='ReferenceNumber']")
  WebElement orderDeliveryMethodCode;
  public WebElement getorderDeliveryMethodCode() {
      return orderDeliveryMethodCode;
  }
  
  
  @FindBy(xpath ="//textarea[@class='slds-textarea']")
  WebElement orderDeliveryMethodDescription;
  public WebElement getorderDeliveryMethodDescription() {
      return prodcutDescription;
  }
  
  @FindBy(xpath ="//button[@name ='SaveEdit']")
  WebElement orderDeliveryMethodSaveBtn;
  public WebElement getorderDeliveryMethodSaveBtn() {
      return orderDeliveryMethodSaveBtn;
  }
  
  @FindBy(xpath ="//input[@aria-haspopup='listbox']")
  WebElement orderDeliveryMethodListBox;
  public WebElement getorderDeliveryMethodListBox() {
      return orderDeliveryMethodListBox;
  }
  
  @FindBy(xpath ="//span[text()='Ground']")
  WebElement orderDeliveryMethodMethod;
  public WebElement getorderDeliveryMethodMethod() {
      return orderDeliveryMethodMethod;
  }

  //-----------------------Order Managenet ----------------------
  
  @FindBy(xpath ="//a[@data-label='Order Management']//b")
  WebElement OrderManagementTab;
  public WebElement getOrderManagementTab() {
      return OrderManagementTab;
  }

  @FindBy(xpath ="//div[@aria-label='Recently Viewed|Order Summaries|List View']")
  WebElement ListOrderManagementMethod;
  public WebElement getOrderManagementMethod() {
      return ListOrderManagementMethod;
  }
  
  @FindBy(xpath ="//div[@class='slds-page-header__name-title']//span[text()='Recently Viewed']")
  WebElement ListOrderManagementSummeries;
  public WebElement getListOrderManagementSummeries() {
      return ListOrderManagementSummeries;
  }
  
  @FindBy(xpath ="//span[text()='All Order Summaries']")
  WebElement ListOrderManagementSummeriesAll;
  public WebElement getListOrderManagementSummeriesAll() {
      return ListOrderManagementSummeriesAll;
  }


		
}
