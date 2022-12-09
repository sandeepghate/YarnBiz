package yarnbiz.testcases;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

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
	public void Registration_Buyer_003() throws InterruptedException {
		//rp.BuyerRegistration();
		rp.NewBuyer();
	//	test.info("Buyer Registeration form filled Successfully");
		rp.CreateAccountBuyer();
//		test.info("Successfully clicked on create account button");
		
		Thread.sleep(1000);
    	WebElement RequiredMsg=driver.findElement(By.xpath("//div[text()='This is a required field.']"));
		Assert.assertTrue(RequiredMsg.isDisplayed());
        // test.info("Get error message- this is required field");
		
		
		//span[text()='Ok']
		//div[text()='Thank you for registering with Yarnbiz.']
		
//		WebElement clickbutton=driver.findElement(By.xpath("//span[text()='Create an Account']"));
//		assert.assertTrue(clickbutton.isDisplayed());
		
	}

}
