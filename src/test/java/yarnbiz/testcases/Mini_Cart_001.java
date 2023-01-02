package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Mini_Cart_001 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the mini Cart Page
 * Test ID   :TC_YBZ_097
 * 
 * Summary   :User should be able to See Mini Cart Page
 * 
********************************************************************************************************/

	@Test
	public void Mini_Cart_001() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
	     lp.BuyerCredentials();
	      // test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		  mc.minicartlogo();
		
			Thread.sleep(1000);
	    	WebElement RequiredMsg=driver.findElement(By.xpath("//span[text()='My Cart,'][1]"));
			Assert.assertTrue(RequiredMsg.isDisplayed());
	      //  test.info("My Cart is displayed.");
		    

		
	}
}
