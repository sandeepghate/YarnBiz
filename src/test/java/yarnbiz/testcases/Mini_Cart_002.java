package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Mini_Cart_002 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Edit Icon on the mini my cart
 * Test ID   :TC_YBZ_101
 * 
 * Summary   :Buyer should able to click on edit and nevigate to the edit page
 * 
********************************************************************************************************/

	@Test
	public void Mini_Cart_002() throws Exception
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
		  
		  driver.findElement(By.xpath("//a[@class='action edit']")).click();
		  
		  Thread.sleep(1000);
		  String ExpectedTitle= "jaimin test"; //product name
		   String ActualTitle =driver.getTitle();
		   Assert.assertEquals(ActualTitle, ExpectedTitle);
		    test.info("Successfully Redirect to edit page.");
		    

		
	}
}
