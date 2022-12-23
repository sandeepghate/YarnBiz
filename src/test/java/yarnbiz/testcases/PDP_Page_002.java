package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PDP_Page_002 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Check Available by pin code
 * Test ID   :TC_YBZ_161
 * 
 * Summary   :Buyer should be able to enter pin code and check availability
********************************************************************************************************/
    @Test
	public void PDP_Page_002 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pd.SearchProduct();
	
	  pd.checkZip();
	  
	  
	  Thread.sleep(3000);
	    	WebElement zipMsg=driver.findElement(By.xpath("//span[@id='zipcode-message']"));
			Assert.assertTrue(zipMsg.isDisplayed());
	        //test.info("Seller Name is displayed.");
			
		//	(//span[@class='amtheme-circle-icon'])[1]
	}
}
