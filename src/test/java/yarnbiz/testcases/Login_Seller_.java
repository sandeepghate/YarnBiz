package yarnbiz.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify user is login with valid EmaiID and Password
 * Test ID   :TC_YBZ_047
 * 
 * Summary   :Successful login.
 * 
********************************************************************************************************/


public class Login_Seller_ extends ListenerClass{
	@Test
	public void Login_Seller_() throws Exception
	{				
		lp.SellerLogin();;
		//test.info("Clicked On Seller Login");
		lp.enterCredentials();
	   //test.info("Credentials Entered ");
		
        // lp.captcha();
   	   // test.info("Captcha checkbox clicked");
		
		lp.clickOnLogin();
	    //test.info("clicked on login button");
	    
	   String ExpectedTitle= "Supplier Dashboard"; 
	   String ActualTitle =driver.getTitle();
	   Assert.assertEquals(ActualTitle, ExpectedTitle);
	   

		
	}

}
