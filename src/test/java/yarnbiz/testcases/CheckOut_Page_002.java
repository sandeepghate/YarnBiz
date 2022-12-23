package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_002 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Ship here Address 
 * Test ID   :TC_YBZ_127
 * 
 * Summary   :Buyer should be able to select any One Ship address by selecting select button
 *   
********************************************************************************************************/
	
	@Test
	public void CheckOut_Page_002() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(8000);
		  mc.minicartlogo();

	        Thread.sleep(2000);
		  cop.ClickOnCheckOut();
	        Thread.sleep(8000);
		  driver.findElement(By.xpath("//button[@class='action action-select-shipping-item']")).click();
		        
	}
}
