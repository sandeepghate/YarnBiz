package yarnbiz.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Buyer_007 extends ListenerClass {


/***************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify that the OTP should not validate if the user enters an incorrect OTP
	 * Test ID   :TC_YBZ_037
	 * 
	 * Summary   :An error message should appear with "not verified"
 
	 * 
****************************************************************************************************/

	@Test
	public void Registration_Buyer_007() throws InterruptedException
	{		
		rp.NewBuyer();
		driver.findElement(By.xpath("//input[@id='customer_mobile']")).sendKeys("8334985590");//Change
		driver.findElement(By.xpath("//button[@class='send_otp action primary']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1515");
		driver.findElement(By.xpath("//button[@class='verif_otp action primary']")).click();
		
		  Thread.sleep(1000);
	     	WebElement NotVerifiedMsg=driver.findElement(By.xpath("//span[text()='Not Verified']"));
	 		Assert.assertTrue(NotVerifiedMsg.isDisplayed());
	        test.info("Get error message- Not Verified");
	 		
	 		Thread.sleep(2000);
	 		driver.findElement(By.xpath("//input[@id='otp']")).clear();
			driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1234");
			driver.findElement(By.xpath("//button[@class='verif_otp action primary']")).click();
			 Thread.sleep(1000);
		     	WebElement VerifiedMsg=driver.findElement(By.xpath("//span[text()='Verified']"));
		 		Assert.assertTrue(VerifiedMsg.isDisplayed());
		        test.info("Get Success message-Verified");
	 		//span[text()='Verified']


    }
}
