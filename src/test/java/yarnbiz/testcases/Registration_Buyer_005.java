package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Buyer_005 extends ListenerClass {
	

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
	public void Registration_Buyer_005 () throws InterruptedException
	{
		rp.NewBuyer();
		driver.findElement(By.xpath("//input[@id='gst']")).sendKeys("18AABCU9603R1ZM");
		driver.findElement(By.xpath("//input[@id='gstname']")).sendKeys("UJJIVAN SMALL FINANCE BANK LIMITED");
		driver.findElement(By.xpath("//button[@class='action primary gstbtn padding_btn']")).click();

		Thread.sleep(1000);
    	WebElement GSTVerified=driver.findElement(By.xpath("//div[text()='GST verified!!!!!']"));
		Assert.assertTrue(GSTVerified.isDisplayed());
        test.info("Buyer GST is Verified");
		
		
		//div[text()='GST verified!!!!!']
	}

}
