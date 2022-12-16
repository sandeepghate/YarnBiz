package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Cart_Page_006 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the checkout button on the cart
 * Test ID   :TC_YBZ_118
 * 
 * Summary   :Buyer should be able to Click on check out button and nevigate to the check out page
 * 
********************************************************************************************************/

	@Test
	public void Cart_Page_006() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(10000);
		  mc.minicartlogo();
	        driver.findElement(By.xpath("//a[text()='View and Edit Cart']")).click();
			  Thread.sleep(8000);
		        driver.findElement(By.xpath("(//button[@class='action secondary checkout'])[2]")).click();

		        Thread.sleep(1000);
				  String ExpectedTitle= "Checkout"; 
				   String ActualTitle =driver.getTitle();
				   Assert.assertEquals(ActualTitle, ExpectedTitle);
				 //   test.info("Successfully Redirect to checkout page.");
					
	}
}
