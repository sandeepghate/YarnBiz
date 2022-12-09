package yarnbiz.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Seller_001 extends ListenerClass {
/***************************************************************************************************
	 * Author    : Sandeep Ghate
	 * 
	 * Test Case :Verify the User is able to redirect on registration form of seller and Buyer.
	 * Test ID   :TC_YBZ_001
	 * 
	 * Summary   :User should be redirect to Registeration form of  Seller and Buyer
 * @throws InterruptedException 
	 * 
****************************************************************************************************/

	@Test
	public void Registration_Seller_001() throws InterruptedException
	{
		
		rp.NewSeller();
		 String ExpectedTitle= "Seller Sign Up"; 
		 String ActualTitle =driver.getTitle();
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
         test.info("Successfully Redirect to Seller Registration Form");

		
    }

}
