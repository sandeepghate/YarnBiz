package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PDP_Page_003 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the seller name on the PDP
 * Test ID   :TC_YBZ_158
 * 
 * Summary   :Buyer should be able to see seller name on the PDP
********************************************************************************************************/
    @Test
	public void PDP_Page_003 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pd.SearchProduct();
	
	  pd.checkZip();
	  
	  
	  Thread.sleep(5000);
	    	WebElement productName=driver.findElement(By.xpath("//*[@id='sellernamme']"));
			Assert.assertTrue(productName.isDisplayed());
	        //test.info("Seller name Displayed.");
			
		
	}
}
