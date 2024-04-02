package validations;

import baseClass.baseClass;
import functionality.Actionsss;
import pageObjects.crmXpaths;

public class deploymentValidations extends baseClass{
	private static final crmXpaths crm = new crmXpaths(driver);
	
	public static void VerifyDownloadPackage() throws Exception {
		test.info("Verify wheather the user is able to Download the package"); 
       if (Actionsss.displayElement(Actionsss.fluentWait(crm.getdownloadCOmpleted()))) {
           // Success message is displayed
       	   test.pass("Successfully clicked on the  install button  on the packeage install page and Download the package ");
           logger.info("Successfully clicked on the  install button  on the packeage install page and Download the package");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       }
      
	 }

}
