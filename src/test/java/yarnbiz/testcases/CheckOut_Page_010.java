package yarnbiz.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class CheckOut_Page_010 extends ListenerClass  {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify the continue shopping button on success page
	 * Test ID   :TC_YBZ_147
	 * 
	 * Summary   :Buyer should be able to click on continue shopping and navigate to home page
	 * 
	 *     
********************************************************************************************************/
		
		@Test
		public void CheckOut_Page_0010() throws Exception
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
		        Thread.sleep(8000);
		     
		       driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
		       
		        		
				Thread.sleep(8000);
			       driver.findElement(By.xpath("//span[text()='Pay Now']")).click();

			        Thread.sleep(8000);
			       driver.findElement(By.xpath("(//span[text()='Place Order'])[1]")).click();

			       	Thread.sleep(8000);
				       driver.findElement(By.xpath("//a[@class='action outline continue']")).click();


				 	  Thread.sleep(8000);
				        String ExpectedTitle= "Leading Yarn Market Place in India | YarnBiz"; 
				 	   String ActualTitle =driver.getTitle();
				 	   AssertJUnit.assertEquals(ActualTitle, ExpectedTitle);
				 	    //test.info("Redirect to Home page.");
				 	  
		}
}
