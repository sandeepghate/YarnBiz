package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Mini_Cart_004 extends ListenerClass{



/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the checkout button on mini cart
 * Test ID   :TC_YBZ_103
 * 
 * Summary   :Buyer should be able to click check out button and nevigate to the checkout page  
 * 
********************************************************************************************************/

	@Test
	public void Mini_Cart_004() throws Exception
	{				
		lp.BuyerLogin();;
		test.info("Clicked On Buyer Login");
         lp.BuyerCredentials();
		   test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(2000);
		  mc.minicartlogo();
		  
		  driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();

		  Thread.sleep(1000);
	       String ExpectedTitle= "Checkout"; 
		   String ActualTitle =driver.getTitle();
		   Assert.assertEquals(ActualTitle, ExpectedTitle);
		    test.info("Redirect to checkout page.");
		  
		
	}
}
