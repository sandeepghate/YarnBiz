package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_009 extends ListenerClass {

/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify the date of order in success page
	 * Test ID   :TC_YBZ_146
	 * 
	 * Summary   :Buyer should be able to see Date of order on Success page
	 * 
	 *     
********************************************************************************************************/
		
		@Test
		public void CheckOut_Page_009() throws Exception
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
				    	WebElement orderId=driver.findElement(By.xpath("(//p[@class='amtheme-title'])[3]"));
						Assert.assertTrue(orderId.isDisplayed());
				        //test.info("Order Date Present on success page.");
						//a[@class='action outline continue'] 
		}
}
