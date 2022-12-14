package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_008 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify Order Number after success Place order
 * Test ID   :TC_YBZ_142
 * 
 * Summary   :Buyer should be able to get order id after successfully order place
 * 
 *     
********************************************************************************************************/
	
	@Test
	public void CheckOut_Page_008() throws Exception
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

	        Thread.sleep(1000);
		  cop.ClickOnCheckOut();
	        Thread.sleep(8000);
	     
	       driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
	       
	        		
			Thread.sleep(8000);
		       driver.findElement(By.xpath("//span[text()='Pay Now']")).click();

		        Thread.sleep(8000);
		       driver.findElement(By.xpath("(//span[text()='Place Order'])[1]")).click();

		       	Thread.sleep(8000);
			    	WebElement orderId=driver.findElement(By.xpath("//a[@class='order-number']"));
					Assert.assertTrue(orderId.isDisplayed());
			        //test.info("Get Order Id Successfully.");
				 
	}
}
