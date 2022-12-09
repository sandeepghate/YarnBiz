package yarnbiz.testcases;

import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

/*******************************************************************************************************
 * Author    : Sandeep Ghate
 * 
 * Test Case :
 * Test ID   :TC_YBZ_003
 * 
 * Summary   :
 * 
********************************************************************************************************/


public class Login_Buyer extends ListenerClass{
	
	@Test
	public void Login_Buyer() throws Exception
	{				
		lp.BuyerLogin();
		test.info("Clicked On Buyer Login");
		lp.enterCredentials();
	    test.info("Credentials Entered ");
       // lp.captcha();
   	   // test.info("Captcha checkbox clicked");
		lp.clickOnLogin();
	    test.info("clicked on login button");
		

		
	}
	

}
