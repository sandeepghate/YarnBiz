package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_006 extends ListenerClass{
	 

/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Payment Method on Checkout 
 * Test ID   :TC_YBZ_138
 * 
 * Summary   :Buyer should be able to select Paymet Method 
 * 
 *     
********************************************************************************************************/
	
	@Test
	public void CheckOut_Page_006() throws Exception
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
	       driver.findElement(By.xpath("//span[text()='Net Banking']")).click();

	       Thread.sleep(5000);
	    	WebElement elementPrs=driver.findElement(By.xpath("(//span[text()='Place Order'])[2]"));
			Assert.assertTrue(elementPrs.isDisplayed());
	        //test.info("My Cart is displayed.");
	       
	        		
			Thread.sleep(3000);
		       driver.findElement(By.xpath("//span[text()='Pay Now']")).click();

		       Thread.sleep(5000);
		    	WebElement elementPrs1=driver.findElement(By.xpath("(//span[text()='Place Order'])[1]"));
				Assert.assertTrue(elementPrs1.isDisplayed());
		        //test.info("My Cart is displayed.");
		       
	}
}
