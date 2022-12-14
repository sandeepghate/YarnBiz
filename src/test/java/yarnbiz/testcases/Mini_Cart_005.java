package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Mini_Cart_005 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the view and edit mini cart 
 * Test ID   :TC_YBZ_104
 * 
 * Summary   :Buyer should be able to click on view and edit and nevibgate to the view and edit page 
 * 
********************************************************************************************************/

	@Test
	public void Mini_Cart_005() throws Exception
	{				
		lp.BuyerLogin();;
		test.info("Clicked On Buyer Login");
	     lp.BuyerCredentials();
	       test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(2000);
		  mc.minicartlogo();
		  
		  driver.findElement(By.xpath("//a[text()='View and Edit Cart']")).click();
		  
		  Thread.sleep(1000);
		  String ExpectedTitle= "Shopping Cart"; //product name
		   String ActualTitle =driver.getTitle();
		   Assert.assertEquals(ActualTitle, ExpectedTitle);
		    test.info("Successfully Redirect to edit page.");
		    

		
	}
}
