package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Cart_Page_001 extends ListenerClass{

/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the mini Cart Page
 * Test ID   :TC_YBZ_105
 * 
 * Summary   :User should be able to navigate to Cart Page
 * 
********************************************************************************************************/

	@Test
	public void Cart_Page_001() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
	     lp.BuyerCredentials();
	      // test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		  cp.AddProductInCart();
		  Thread.sleep(1000);
		  mc.minicartlogo();
        driver.findElement(By.xpath("//a[text()='View and Edit Cart']")).click();
		  
		  Thread.sleep(1000);
		  String ExpectedTitle= "Shopping Cart"; //product name
		   String ActualTitle =driver.getTitle();
		   Assert.assertEquals(ActualTitle, ExpectedTitle);
	   //   test.info("Successfully Redirect to cart page.");
			

		
	}

}
