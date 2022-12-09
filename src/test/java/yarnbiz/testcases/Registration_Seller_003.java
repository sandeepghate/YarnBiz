package yarnbiz.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Seller_003 {


/*******************************************************************************************************
 * Author    : Sandeep Ghate
 * 
 * Test Case :Verify the Create account button 
 * Test ID   :TC_YBZ_009
 * 
 * Summary   :Seller and Buyer should able to click on Create account to create the account
 * 
*******************************************************************************************************/

public class Registration_Buyer_003 extends ListenerClass{


	@Test
	public void Registration_Seller_003() throws InterruptedException {
//		rp.SellerRegistration();
//		test.info("Seller Registeration form filled Successfully");
//    	rp.CreateAccountSeller();
//		test.info("Successfully clicked on create account button");

		rp.NewSeller();
		driver.findElement(By.xpath("//input[@id='supplier-email']")).sendKeys("ashzziuags@techsevin.com");//Plz Change
		driver.findElement(By.xpath("//input[@id='supplier-password']")).sendKeys("Sandeep@1234");
		driver.findElement(By.xpath("//input[@id='supplier-re-password']")).sendKeys("Sandeep@1234");
		driver.findElement(By.xpath("//input[@id='customer_mobile']")).sendKeys("2239944544");//Plz Change
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       

		driver.findElement(By.xpath("//button[@class='send_otp action primary']")).click();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       

		driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@class='verif_otp action primary']")).click();
	//	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	       
        Thread.sleep(2000);
 		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        Thread.sleep(1000);
        
        rp.CreateAccountSeller();
        
		Thread.sleep(1000);
    	WebElement RequiredMsg=driver.findElement(By.xpath("//div[text()='This is a required field.']"));
		Assert.assertTrue(RequiredMsg.isDisplayed());
        // test.info("Get error message- this is required field");
		
		
      //div[text()='This is a required field.']
	}
		
}
}
