package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Login_Buyer_005 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify user is cant  login with invalid emaild and invalid password
	 * Test ID   :TC_YBZ_061
	 * 
	 * Summary   :a pop up message box to show an error You did not sign in correctly or your account is 
                  temporerly disable.  
	 * 
*******************************************************************************************************/
  
    @Test
	public void Login_Buyer_005() throws InterruptedException {
		lp.BuyerLogin();
		//test.info("Clicked On Seller Login");
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sandip@gmail.com ");
	   driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456789 ");
	   //test.info("Credentials Entered ");
		lp.clickOnLogin();
	    //test.info("clicked on login button");
		
		Thread.sleep(1000);
    	WebElement RequiredMsg=driver.findElement(By.xpath("//div[text()='You did not sign in correctly or your account is temporarily disabled.']"));
		Assert.assertTrue(RequiredMsg.isDisplayed());
        //test.info("Get error message- this is required field");
	   
	}
}
