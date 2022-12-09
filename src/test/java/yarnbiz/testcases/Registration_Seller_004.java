package yarnbiz.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Seller_004 extends ListenerClass{

	

/*******************************************************************************************************
	 * Author    : Sandeep Ghate
	 * 
	 * Test Case :Verify the GST Number by clicking on verify the gst number
	 * Test ID   :TC_YBZ_012
	 * 
	 * Summary   :Seller and Buyer should able to Click on verify the gst link and verify
	 * 
*******************************************************************************************************/
	
	
	@Test
	public void Registration_Seller_004 () throws InterruptedException
	{
		rp.NewSeller();
		driver.findElement(By.xpath("//input[@id='supplier-email']")).sendKeys("ashiuags@techsevin.com");//Plz Change
		driver.findElement(By.xpath("//input[@id='supplier-password']")).sendKeys("Sandeep@1234");
		driver.findElement(By.xpath("//input[@id='supplier-re-password']")).sendKeys("Sandeep@1234");
		driver.findElement(By.xpath("//input[@id='customer_mobile']")).sendKeys("1139944544");//Plz Change
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       

		driver.findElement(By.xpath("//button[@class='send_otp action primary']")).click();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       

		driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@class='verif_otp action primary']")).click();
	//	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	       
        Thread.sleep(1000);
 		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='gst']")).sendKeys("18AABCU9603R1ZM");
		driver.findElement(By.xpath("//input[@id='gstname']")).sendKeys("UJJIVAN SMALL FINANCE BANK LIMITED");
		driver.findElement(By.xpath("//button[@class='action primary gstbtn padding_btn']")).click();

		Thread.sleep(1000);
    	WebElement GSTVerified=driver.findElement(By.xpath("//div[text()='GST verified!!!!!']"));
		Assert.assertTrue(GSTVerified.isDisplayed());
        test.info("Seller GST is Verified");
		
		
		//div[text()='GST verified!!!!!']
	}

}
