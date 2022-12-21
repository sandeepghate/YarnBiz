package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_007 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify place order button 
 * Test ID   :TC_YBZ_140
 * 
 * Summary   :Buyer should be able to click on place order button and order should be place Successfully
 * 
 *     
********************************************************************************************************/
	
	@Test
	public void CheckOut_Page_007() throws Exception
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
	        Thread.sleep(2000);
	     
	       driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
	       
	        		
			Thread.sleep(3000);
		       driver.findElement(By.xpath("//span[text()='Pay Now']")).click();

		        Thread.sleep(1000);
		       driver.findElement(By.xpath("(//span[text()='Place Order'])[1]")).click();

		       Thread.sleep(8000);
		    	WebElement orderSuccess=driver.findElement(By.xpath("//*[text()='Thank You for Placing an Order on YarnBiz. ']"));
				Assert.assertTrue(orderSuccess.isDisplayed());
		        //test.info("Order placed Successfully.");
				//a[@class='order-number'] 
	}
}
