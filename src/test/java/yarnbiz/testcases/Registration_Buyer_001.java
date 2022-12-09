package yarnbiz.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Buyer_001 extends ListenerClass {

/***************************************************************************************************
	 * Author    : Sandeep Ghate
	 * 
	 * Test Case :Verify the User is able to redirect on registration form of seller and Buyer.
	 * Test ID   :TC_YBZ_001
	 * 
	 * Summary   :User should be redirect to Registeration form of  Seller and Buyer
 
	 * 
****************************************************************************************************/

	
	@Test
	public void Registration_Buyer_001() throws InterruptedException
	{		
		rp.NewBuyer();
		 String ExpectedTitle= "Buyer Sign Up"; 
		 String ActualTitle =driver.getTitle();
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
		 test.info("Successfully Redirect to Buyer Registration Form");

		
    }
	
	
	

}
