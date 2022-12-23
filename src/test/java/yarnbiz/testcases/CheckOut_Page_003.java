package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_003 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the add New Address on check out page
 * Test ID   :TC_YBZ_128
 * 
 * Summary   :Buyer should able to click on new address and add new address successfully
 * 
 *     
********************************************************************************************************/
	
	@Test
	public void CheckOut_Page_003() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(8000);
		  mc.minicartlogo();

	        Thread.sleep(1000);
		  cop.ClickOnCheckOut();
	        Thread.sleep(1000);
	        cop.shippingAddress();
	        
	}
}
