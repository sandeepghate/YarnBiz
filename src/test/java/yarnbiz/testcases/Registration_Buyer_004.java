package yarnbiz.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Buyer_004 extends ListenerClass {

/*******************************************************************************************************
	 * Author    : Sandeep Ghate
	 * 
	 * Test Case :Verify the back button 
	 * Test ID   :TC_YBZ_009
	 * 
	 * Summary   :Seller and Buyer should able to click on back button for navigating back page
	 * 
*******************************************************************************************************/

	@Test
	public void Registration_Buyer_004() throws InterruptedException {
		rp.NewBuyer();
		test.info("Buyer Registeration form filled Successfully");
		rp.Back();
		test.info("Back to Login Page");
		String ExpectedTitle= "Buyer Login"; 
		String ActualTitle =driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);

		
		
	}
}
