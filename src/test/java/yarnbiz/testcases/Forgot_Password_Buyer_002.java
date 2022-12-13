package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Forgot_Password_Buyer_002 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify the forget password link should be present on  the login page
	 * Test ID   :TC_YBZ_076
	 * 
	 * Summary   :the forgot password link is present on the login page  
*******************************************************************************************************/
   
	@Test
	public void Forgot_Password_Buyer_002 () throws InterruptedException  
	{
		lp.BuyerLogin();
		
		Thread.sleep(1000);
    	WebElement forgotpasslink=driver.findElement(By.xpath("//span[text()='Forgot Your Password?']"));
		Assert.assertTrue(forgotpasslink.isDisplayed());
      //  test.info("Forgot Password link is present on the login page");
	}
}
