package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Login_Seller_004 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify user can login using  registered mobile number 
 * Test ID   :TC_YBZ_049
 * 
 * Summary   :Successful login.
 * 
********************************************************************************************************/

	@Test
	public void Login_Seller_004() throws Exception
	{				
		lp.SellerLogin();
		Thread.sleep(2000);
		lp.SellerLoginWithNumber();
		
		 Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@id='login_mobile']")).sendKeys("9909112288");//9909112288
		   driver.findElement(By.xpath("//button[@class='send_otp_login action primary']")).click();
		   driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1234");
		   driver.findElement(By.xpath("//button[@class='verif_otp_login action primary']")).click();  
           Thread.sleep(1000);
		   driver.findElement(By.xpath("//button[@id='send2']")).click();  
		 //span[text()='Seller Login']

	   String ExpectedTitle= "Supplier Dashboard"; //Category List /
	   String ActualTitle =driver.getTitle();
	   Assert.assertEquals(ActualTitle, ExpectedTitle);
	   

		
	}
}
