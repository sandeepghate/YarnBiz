package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PDP_Page_007 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Quantity to be ordered for spun yarn
 * Test ID   :TC_YBZ_173
 * 
 * Summary   :It should be in bags and aligned with MOQ in bags
********************************************************************************************************/
    @Test
	public void PDP_Page_007 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pd.SearchSpunProduct();
	
	  
	  Thread.sleep(3000);
	    	WebElement weightBox=driver.findElement(By.xpath("//*[text()='Weight Per Box(s): 20 kgs']"));
			Assert.assertTrue(weightBox.isDisplayed());
	        //test.info("Weight per box is displayed.");
			 
			Thread.sleep(1000);
	WebElement priceBox=driver.findElement(By.xpath("(//*[@class='price weight_content'])[3]"));
		Assert.assertTrue(priceBox.isDisplayed());
	   //test.info("Price per Weight is displayed.");
							
		Thread.sleep(1000);
	WebElement minOrder=driver.findElement(By.xpath("(//*[@class='wk-supplier-collection-header-txt wk-product-min-allowed-qty'])[1]"));
		Assert.assertTrue(minOrder.isDisplayed());
	   //test.info("Min Order qty  is displayed.");
		
		
}
}