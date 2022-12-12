package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Login_Buyer_004 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify user can login using  registered mobile number 
 * Test ID   :TC_YBZ_060
 * 
 * Summary   :Successful login.
 * 
********************************************************************************************************/

	@Test
	public void Login_Buyer_004() throws Exception
	{				
		lp.BuyerLogin();
		Thread.sleep(2000);
		lp.SellerLoginWithNumber();
		
		 Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@id='login_mobile']")).sendKeys("7752462188");//9909112288
		   driver.findElement(By.xpath("//button[@class='send_otp_login action primary']")).click();
		   driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1234");
		   driver.findElement(By.xpath("//button[@class='verif_otp_login action primary']")).click();  
           Thread.sleep(1000);
		   driver.findElement(By.xpath("//button[@id='send2']")).click();  
		 //span[text()='Seller Login']

	   String ExpectedTitle= "Category List /"; //Category List /
	   String ActualTitle =driver.getTitle();
	   Assert.assertEquals(ActualTitle, ExpectedTitle);
	   

		
	}
}
