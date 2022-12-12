package yarnbiz.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Login_Seller_002 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify user is login with valid EmaiID and Password
 * Test ID   :TC_YBZ_047
 * 
 * Summary   :Successful login.
 * 
********************************************************************************************************/

	@Test
	public void Login_Seller_002() throws Exception
	{				
		lp.SellerLogin();
		//test.info("Clicked On Seller Login");
		lp.enterCredentials();
	//   test.info("Credentials Entered ");
		
		lp.clickOnLogin();
	  //  test.info("clicked on login button");
	    
	   String ExpectedTitle= "Supplier Dashboard"; 
	   String ActualTitle =driver.getTitle();
	   Assert.assertEquals(ActualTitle, ExpectedTitle);
	   

		
	}
}
