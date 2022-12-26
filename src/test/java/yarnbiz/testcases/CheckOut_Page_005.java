package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_005 extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Next Button on the Check out page 
 * Test ID   :TC_YBZ_132
 * 
 * Summary   :Buyer should be able to click on Next button and navigate to /next page
 * 
 *     
********************************************************************************************************/
	
	@Test
	public void CheckOut_Page_005() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(8000);
		  mc.minicartlogo();

	        Thread.sleep(1000);
		  cop.ClickOnCheckOut();
	        Thread.sleep(5000);
	     
	       driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
	       
	       Thread.sleep(5000);
	     
	    	WebElement textpresent=driver.findElement(By.xpath("//div[text()='Select Billing Address And Payment Method']"));
			Assert.assertTrue(textpresent.isDisplayed());
	        //test.info("My Cart is displayed.");
			
		       Thread.sleep(5000);

	       String ExpectedTitle= "Checkout"; 
		   String ActualTitle =driver.getTitle();
		   Assert.assertEquals(ActualTitle, ExpectedTitle);
		    //test.info("Successfully Redirect to Checkout-Payment Page.");
		  
	      
	        		
	        
	}
}
