package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Login_Buyer_007 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify user cant login using  Unregistered mobile number 
 * Test ID   :TC_YBZ_062
 * 
 * Summary   :message would appear with message that Account with this number doesn't exist
 * 
********************************************************************************************************/

	@Test
	public void Login_Buyer_007() throws Exception
	{				
		lp.BuyerLogin();
		Thread.sleep(2000);
		lp.SellerLoginWithNumber();
		
		 Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@id='login_mobile']")).sendKeys("7745421542");//9909112288
		   driver.findElement(By.xpath("//button[@class='send_otp_login action primary']")).click();
		  
			Thread.sleep(1000);
	    	WebElement RequiredMsg=driver.findElement(By.xpath("//p[@class='smserror']"));
			Assert.assertTrue(RequiredMsg.isDisplayed());
	        //test.info("Get error message- Account with this number doesn't exist");
		   

		
	}
}
