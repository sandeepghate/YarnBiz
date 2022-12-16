package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Cart_Page_002 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Update button to update the QTY
 * Test ID   :TC_YBZ_107
 * 
 * Summary   :Buyer should able to click on Update and QTY should be Update successfully
 * 
********************************************************************************************************/

	@Test
	public void Cart_Page_002() throws Exception
	{				
		lp.BuyerLogin();;
		//test.info("Clicked On Buyer Login");
	     lp.BuyerCredentials();
	      // test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		  cp.AddProductInCart();
		  Thread.sleep(1000);
		  mc.minicartlogo();
        driver.findElement(By.xpath("//a[text()='View and Edit Cart']")).click();
		
        cp.increaseQty();
	      //test.info("Quantity & Cart updated successfully");


		
	}
}
