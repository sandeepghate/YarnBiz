package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import extentlisteners.ListenerClass;

public class Forgot_Password_Buyer_003 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify send mail button
	 * Test ID   :TC_YBZ_077
	 * 
	 * Summary   :a pop up message box to show an ****@gmail.com you will receive an email with alink to reset your password
*******************************************************************************************************/
   
	@Test (enabled = false)
	public void Forgot_Password_Buyer_003 () throws InterruptedException  
	{
		Thread.sleep(1000);

		lp.BuyerLogin();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Forgot Your Password?']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("aaxyza@gmail.com");
		driver.findElement(By.xpath("//span[text()='Send Email']")).click();

		Thread.sleep(5000);
		SoftAssert softverify = new SoftAssert();
    	WebElement forgotpasslink=driver.findElement(By.xpath("//div[text()='If there is an account associated with aaxyza@gmail.com you will receive an email with a link to reset your password.']"));
		softverify.assertTrue(forgotpasslink.isDisplayed());
      //  test.info("Forgot Password link is present on the login page");
	

//		Thread.sleep(5000);
//    	WebElement forgotpasslink1=driver.findElement(By.xpath("//div[text()='We received too many requests for password resets. Please wait and try again later or contact info@yarnbiz.com.']"));
//		softverify.assertTrue(forgotpasslink1.isDisplayed());
//      //  test.info("Forgot Password link is present on the login page");

		softverify.assertAll();
	}
}
