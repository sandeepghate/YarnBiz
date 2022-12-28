package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PLP_Page_004 extends ListenerClass{

/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify Sort by Price working as expected
	 * Test ID   :TC_YBZ_188
	 * 
	 * Summary   :User should be able to see results as per price sorting he applied
********************************************************************************************************/

    @Test
	public void PLP_Page_004 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pl.SearchProduct();
	
	  Thread.sleep(3000);

	  
		  driver.findElement(By.xpath("(//*[@class='amtheme-select-block -no-border'])[1]")).click();
		  Thread.sleep(2000);
	
		  driver.findElement(By.xpath("(//*[@class='amtheme-option '])[2]")).click();
 
		  Thread.sleep(3000);
	      String ExpectedUrl= "https://stage.yarnbiz.com/spun.html?product_list_order=price"; 
		   String ActualUrl =driver.getCurrentUrl();
		   Assert.assertEquals(ActualUrl, ExpectedUrl);
		    //test.info("Redirect to current URL page.");
	  
		  
	}
	
}
