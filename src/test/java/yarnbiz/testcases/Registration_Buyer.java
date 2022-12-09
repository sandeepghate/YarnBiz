package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Buyer extends ListenerClass{
	
	//***************CHANGE DATA FOR THIS TEST CASE **************************//

/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Check the user able to register by entering the valid data in all field
	 * Test ID   :TC_YBZ_030
	 * 
	 * Summary   :user is able to register with valid data
	 * 
*******************************************************************************************************/

	

	@Test
	public void Registration_Buyer() throws InterruptedException {
		rp.BuyerRegistration();;
		test.info("Buyer Registeration form filled Successfully");
		rp.CreateAccountBuyer();
		test.info("Successfully clicked on create account button");
		driver.findElement(By.xpath("//span[text()='Ok']")).click();

		WebElement ThankYou=driver.findElement(By.xpath("//div[text()='Thank you for registering with Yarnbiz.']"));
		Assert.assertTrue(ThankYou.isDisplayed());
         test.info("text is displayed");
		

		//span[text()='Ok']
		//div[text()='Thank you for registering with Yarnbiz.']
		
	}

}
