package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PLP_Page_006 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify the product descriptiion
	 * Test ID   :TC_YBZ_200
	 * 
	 * Summary   :Purpose , Nature , Count Type , Quality, UOM, Specialty 
                  Minimum Order Quantity, Seller type , Seller Name ,
                  Seller Locations , Test Report, Stock Type, Delivery Details
********************************************************************************************************/

    @Test
	public void PLP_Page_006() throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pl.SearchProduct();
	
	  Thread.sleep(3000);

	  
		  driver.findElement(By.xpath("(//*[@class='amtheme-quick-view'])[1]")).click();
	
 
		  Thread.sleep(3000);
	    	WebElement allelePresent=driver.findElement(By.xpath("(//*[@class='am-custom-tab am-custom-tab-2'])[1] "));
			Assert.assertTrue(allelePresent.isDisplayed());
	        //test.info("All Elements are Present .");	  
		  
	}
}
