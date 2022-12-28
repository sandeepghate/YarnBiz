package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;



public class PLP_Page_005 extends ListenerClass{

/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify adding product into the Watch List by Hovering on product
	 * Test ID   :TC_YBZ_189
	 * 
	 * Summary   :User should be able to Add Product into the wish list when he hovers on any product
********************************************************************************************************/

    @Test
	public void PLP_Page_005 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pl.SearchProduct();
	
	  Thread.sleep(3000);

	  
		  driver.findElement(By.xpath("(//*[@title='Add to Watch List'])[1]")).click();
		  Thread.sleep(2000);
	
 
		  Thread.sleep(3000);
	    	WebElement RequiredMsg=driver.findElement(By.xpath("//*[text()='Watch List']"));
			Assert.assertTrue(RequiredMsg.isDisplayed());
	        //test.info("Product added to watchlist .");	  
		  
	}
}
