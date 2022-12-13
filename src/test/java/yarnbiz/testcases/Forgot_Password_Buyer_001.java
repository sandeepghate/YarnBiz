package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Forgot_Password_Buyer_001 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify the forget passwordVe
	 * Test ID   :TC_YBZ_069
	 * 
	 * Summary   :Buyer/seller should be able to click on forget password and nevigate to relevent page	 * 
  
*******************************************************************************************************/
   
	@Test
	public void Forgot_Password_Buyer_001 () throws InterruptedException  
	{
		lp.BuyerLogin();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Forgot Your Password?']")).click();
		
		Thread.sleep(1000);
		String ExpectedTitle= "Forgot Your Password?"; 
		 String ActualTitle =driver.getTitle();
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
	    // test.info("Successfully Redirect to Forgot  Password Page");

	}
}
