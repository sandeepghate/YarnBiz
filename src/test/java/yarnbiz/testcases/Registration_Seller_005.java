package yarnbiz.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Seller_005 extends ListenerClass {
	


/*******************************************************************************************************
	 * Author    : Sandeep Ghate
	 * 
	 * Test Case :Verify the PAN name and PAN Number by click on verify the PAN number
	 * Test ID   :TC_YBZ_014
	 * 
	 * Summary   :Seller and Buyer should able to Click on verify the PAN Number link and verify
	 * 
*******************************************************************************************************/

	@Test
	public void Registration_Seller_005 () throws InterruptedException
	{
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
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	       
        Thread.sleep(2000);
 		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@id='pan']")).sendKeys("CHFPG2292E");
		driver.findElement(By.xpath("//input[@id='panname']")).sendKeys("GHATE SANDEEP VENKATESHRAO");
		driver.findElement(By.xpath("//button[@class='action primary panbtn padding_btn']")).click();

		Thread.sleep(1000);
    	WebElement PanVerified=driver.findElement(By.xpath("//div[text()='Pan verified!!!!!']"));
		Assert.assertTrue(PanVerified.isDisplayed());
         test.info("Seller PAN is Verified");
		
		
		//div[text()='Pan verified!!!!!']
	}
	

}
