package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_004 extends ListenerClass {



/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Edit button on below the new address added
 * Test ID   :TC_YBZ_130
 * 
 * Summary   :Buyer should be able to Click on edit button and edit the New address successfully
 * 
 *     
********************************************************************************************************/
	
	@Test
	public void CheckOut_Page_004() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(10000);
		  mc.minicartlogo();

	        Thread.sleep(1000);
		  cop.ClickOnCheckOut();
	        Thread.sleep(1000);
	        cop.shippingAddress();
	        
	        Thread.sleep(5000);

	       driver.findElement(By.xpath("(//button[text()='Edit'])[3]")).click();
	       driver.findElement(By.xpath("//input[@name='company']")).sendKeys("TCS");
	       driver.findElement(By.xpath("//span[text()='Ship Here']")).click();

	        		
	        
	}
}
