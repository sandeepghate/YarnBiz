package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Cart_Page_005 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Summary on the cart page
 * Test ID   :TC_YBZ_113
 * 
 * Summary   :Buyer should able to see the summary on tha cart page 
 * 
********************************************************************************************************/

	@Test
	public void Cart_Page_005() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(2000);
		  mc.minicartlogo();
	        driver.findElement(By.xpath("//a[text()='View and Edit Cart']")).click();
			  Thread.sleep(8000);
		  
		   WebElement RequiredMsg=driver.findElement(By.xpath("//div[@class='cart-summary']"));
		   Assert.assertTrue(RequiredMsg.isDisplayed());
		   //test.info("Summary present on cart page.");

	}
}
