package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PDP_Page_004 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the watch list 
 * Test ID   :TC_YBZ_164
 * 
 * Summary   :Buyer should be able to click on watch list and add product to Watch List
 * 
 *
********************************************************************************************************/
    @Test
	public void PDP_Page_004 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pd.SearchProduct();
	
	  pd.checkZip();
	  
  	driver.findElement(By.xpath("(//span[@class='amtheme-circle-icon'])[1]")).click();

	  
	  Thread.sleep(5000);
	    	WebElement productName=driver.findElement(By.xpath("//*[@class='message-success success message']"));
			Assert.assertTrue(productName.isDisplayed());
	        //test.info("Product successfully added to watchlist.");
			
	}
}
