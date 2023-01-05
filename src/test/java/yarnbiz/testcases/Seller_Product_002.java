package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Seller_Product_002 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify the filter menu on Product Listing page
	 * 
	 * Test ID   :TC_YBZ_253
	 * 
	 * Summary   :user should be able to Options to refine the product listed on a page using its key 
	             attributes like Purpose , Nature, Type, Price Bucket, Seller, Stock type (Ready Inventory,
	             Prebooked or Inquiry), UOM (Bags for Spun yarn, Kgs for Filament), MOQ/MBQ, Test Reports
	 * 
	 * 
*******************************************************************************************************/

	@Test
	public void Seller_Product_002() throws InterruptedException 
	{
		lp.SellerLogin();
		//test.info("Clicked On Seller Login");
		lp.enterCredentials();
	   //test.info("Credentials Entered ");
		lp.clickOnLogin();
	    //test.info("clicked on login button");
		
		sp.filterProduct();
		
		  Thread.sleep(1000);
	    	WebElement allFilterPresent=driver.findElement(By.xpath("//*[@class='admin__fieldset admin__data-grid-filters']"));
			Assert.assertTrue(allFilterPresent.isDisplayed());
	        //test.info("All filter displayed.");

	}

}
