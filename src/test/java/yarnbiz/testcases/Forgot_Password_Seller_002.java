package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Forgot_Password_Seller_002 extends ListenerClass{


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify the forget passwordVe
	 * Test ID   :TC_YBZ_076
	 * 
	 * Summary   :Buyer/seller should be able to click on forget password and nevigate to relevent page	 * 
  
*******************************************************************************************************/
   
	@Test
	public void Forgot_Password_Seller_002 () throws InterruptedException  
	{
		
		lp.SellerLogin();;
		
		Thread.sleep(1000);
    	WebElement forgotpasslink=driver.findElement(By.xpath("//span[text()='Forgot Your Password?']"));
		Assert.assertTrue(forgotpasslink.isDisplayed());
      //  test.info("Forgot Password link is present on the login page");

	}
}
