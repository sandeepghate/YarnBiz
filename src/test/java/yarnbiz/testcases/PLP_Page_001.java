package yarnbiz.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PLP_Page_001 extends ListenerClass{

/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify The List Page
	 * Test ID   :TC_YBZ_176
	 * 
	 * Summary   :User Should be redirected to relevant listing page
********************************************************************************************************/

    @Test
	public void PLP_Page_001 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pl.SearchProduct();
	
	  
	  
	  Thread.sleep(1000);
      String ExpectedTitle= "Spun"; 
	   String ActualTitle =driver.getTitle();
	   Assert.assertEquals(ActualTitle, ExpectedTitle);
	    //test.info("Redirect to edit page.");
	  	
	}
	
}
