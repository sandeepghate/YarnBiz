package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PDP_Page_001 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verfiy the Product name on the PDP
 * Test ID   :TC_YBZ_155
 * 
 * Summary   :Buyer should be able to see Prodct name on PDP
********************************************************************************************************/
    @Test
	public void PDP_Page_001 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pd.SearchProduct();
	
	  
	  Thread.sleep(3000);
	    	WebElement productName=driver.findElement(By.xpath("//*[@class='page-title']"));
			Assert.assertTrue(productName.isDisplayed());
	        //test.info("Product Name is displayed.");
	}
}
