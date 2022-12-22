package yarnbiz.testcases;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class LoginPageTest extends ListenerClass{


	@Test(priority = 1)
	public void verifyLogin() throws InterruptedException
	{				
		lp.BuyerLogin();
		test.info("Clicked On Buyer Login");
		lp.enterCredentials();
	    test.info("Credentials Entered ");
        lp.captcha();
   	    test.info("Captcha checkbox clicked");
		lp.clickOnLogin();
	    test.info("clicked on login button");
		
	}
	
	
}
