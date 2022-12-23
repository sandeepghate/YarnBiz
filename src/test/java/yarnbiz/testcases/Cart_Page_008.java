package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Cart_Page_008 extends ListenerClass{
	

/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :verify if an item is out of stock 
 * Test ID   :TC_YBZ_125
 * 
 * Summary   :a user can not add it to the cart
 * 
********************************************************************************************************/

	@Test
	public void Cart_Page_008() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
		  Thread.sleep(1000);

		  mc.clearCart();
		  Thread.sleep(1000);
		  
		 cp.OutOfStockProductInCart();
		 
         Thread.sleep(2000);  
	     WebElement RequiredMsg=driver.findElement(By.xpath("//div[text()='Product that you are trying to add is not available.']"));
	     Assert.assertTrue(RequiredMsg.isDisplayed());
           //test.info("Product out of stock");
  
	}

}
