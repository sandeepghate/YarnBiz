package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PDP_Page_008 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Quantity to be ordered for Filament yarn
 *
 * Test ID   :TC_YBZ_174
 * 
 * Summary   :It should be in KGs and aligned with MOQ in KGs
********************************************************************************************************/
    @Test
	public void PDP_Page_008 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	  // test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
      //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
      //  test.info("clicked on login button");
	  pd.SearchProduct();
	
	  
	  Thread.sleep(3000);
	    	WebElement weightBox=driver.findElement(By.xpath("//*[text()='Weight Per Box(s): 11 kgs']"));
			Assert.assertTrue(weightBox.isDisplayed());
	        //test.info("Weight per box is displayed.");
			 
			Thread.sleep(1000);
	WebElement priceBox=driver.findElement(By.xpath("(//*[@class='price weight_content'])[3]"));
		Assert.assertTrue(priceBox.isDisplayed());
	       //test.info("Price per Weight is displayed.");
							
	
		
}

}
