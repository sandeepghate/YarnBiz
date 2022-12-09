package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Buyer_006 extends ListenerClass{


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
	public void Registration_Buyer_006 () throws InterruptedException
	{
		rp.NewBuyer();
		driver.findElement(By.xpath("//input[@id='pan']")).sendKeys("CHFPG2292E");
		driver.findElement(By.xpath("//input[@id='panname']")).sendKeys("GHATE SANDEEP VENKATESHRAO");
		driver.findElement(By.xpath("//button[@class='action primary panbtn padding_btn']")).click();

		Thread.sleep(1000);
    	WebElement PanVerified=driver.findElement(By.xpath("//div[text()='Pan verified!!!!!']"));
		Assert.assertTrue(PanVerified.isDisplayed());
        test.info("Buyer PAN is Verified");
		
		
		//div[text()='Pan verified!!!!!']
	}
	
}
