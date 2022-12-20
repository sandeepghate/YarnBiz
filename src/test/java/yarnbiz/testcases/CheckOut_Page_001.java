package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_001 extends ListenerClass {

/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Check Out Page
 * Test ID   :TC_YBZ_126
 * 
 * Summary   :Buyer should be able to nevigate to Check Out Page
 *   
********************************************************************************************************/
	@Test
	public void CheckOut_Page_001() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(10000);
		  mc.minicartlogo();

	        Thread.sleep(1000);
		  cop.ClickOnCheckOut();
		  
		        Thread.sleep(1000);
				  String ExpectedTitle= "Checkout"; 
				   String ActualTitle =driver.getTitle();
				   Assert.assertEquals(ActualTitle, ExpectedTitle);
				 //   test.info("Successfully Redirect to checkout page.");
					
	}
}
