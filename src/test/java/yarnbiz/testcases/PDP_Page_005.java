package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PDP_Page_005 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Add to cart button
 * Test ID   :TC_YBZ_165
 * 
 * Summary   :Buyer should be able to click on add to cart and product should be able to add product in cart
 *   
********************************************************************************************************/

	@Test
	public void PDP_Page_005() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");

		  
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		 Thread.sleep(1000);
		  mc.minicartlogo();	

		  
    Thread.sleep(2000);  
	WebElement RequiredMsg=driver.findElement(By.xpath("//span[text()='Cart Subtotal']"));
	Assert.assertTrue(RequiredMsg.isDisplayed());
  //test.info("Successfully product added in cart .");
	
	}
}
