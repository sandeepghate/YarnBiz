package yarnbiz.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Login_Buyer_006 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify user cannot login by leaving userid and password field blank
	 * Test ID   :TC_YBZ_064
	 * 
	 * Summary   :message would appear with message that "this is required field" 
	 * 
*******************************************************************************************************/
  
    @Test
	public void Login_Seller_006() throws InterruptedException {
		lp.BuyerLogin();;
		//test.info("Clicked On Seller Login");
	   
	   Thread.sleep(1000);
	  
		lp.clickOnLogin();
	    //test.info("clicked on login button");
		
		Thread.sleep(1000);
    	WebElement RequiredMsg=driver.findElement(By.xpath("//div[text()='This is a required field.']"));
		AssertJUnit.assertTrue(RequiredMsg.isDisplayed());
        //test.info("Get error message- this is required field");
	   
	}
}
