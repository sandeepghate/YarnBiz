package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Cart_Page_004 extends ListenerClass {
	

/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Continue shopping link on cart
 * Test ID   :TC_YBZ_110
 * 
 * Summary   :Buyer should be able to click on Continue shopping and nevigate to Relevant page
 * 
********************************************************************************************************/

	@Test
	public void Cart_Page_004() throws Exception
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
		  driver.findElement(By.xpath("//a[@title='Continue Shopping']")).click();
		  Thread.sleep(1000);
	       String ExpectedTitle= "Leading Yarn Market Place in India | YarnBiz"; 
		   String ActualTitle =driver.getTitle();
		   Assert.assertEquals(ActualTitle, ExpectedTitle);
		    //test.info("Redirect to edit page.");
		  
	}

}
