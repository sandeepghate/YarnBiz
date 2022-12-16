package yarnbiz.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Cart_Page_007 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :check weather the user is able to add the item to the cart
 * Test ID   :TC_YBZ_119
 * 
 * Summary   :user should be able to add items to cart
 *   
********************************************************************************************************/

	@Test
	public void Cart_Page_007() throws Exception
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
