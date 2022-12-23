package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PDP_Page_006 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify Essential Navigation Tool 
 * Test ID   :TC_YBZ_170
 * 
 * Summary   :The Home Page, Watchlist, Account, Help, Search 
              Product or Category, Cart, Go to Cart should be 
              available  on PDP
********************************************************************************************************/
    @Test
	public void PDP_Page_006 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pd.SearchProduct();
	
	  
	  Thread.sleep(3000);
	    	WebElement homePresent=driver.findElement(By.xpath("//span[text()='Home']"));
			Assert.assertTrue(homePresent.isDisplayed());
	        //test.info("Home is displayed.");
			 
			Thread.sleep(1000);
	WebElement watchList=driver.findElement(By.xpath("//*[@class='amtheme-icon -hover-bg -selected']"));
		Assert.assertTrue(watchList.isDisplayed());
	   //test.info("Product Name is displayed.");
							
		Thread.sleep(1000);
	WebElement myAccount=driver.findElement(By.xpath("(//span[@class='action toggle switcher-options'])[1]"));
		Assert.assertTrue(myAccount.isDisplayed());
	   //test.info("My Account is displayed.");
		
		
   Thread.sleep(1000);
     WebElement help=driver.findElement(By.xpath("//h3[text()='Help']"));
     Assert.assertTrue(help.isDisplayed());
     //test.info("Help is displayed.");				
		
     Thread.sleep(1000);
     WebElement serchProd=driver.findElement(By.xpath("//input[@class='amsearch-input']"));
     Assert.assertTrue(serchProd.isDisplayed());
     //test.info("Search Bar is displayed.");	
     
     Thread.sleep(1000);
     WebElement addCart=driver.findElement(By.xpath("//button[@title='Add to Cart']"));
     Assert.assertTrue(addCart.isDisplayed());
     //test.info("Add to cart is displayed.");	
   
   
		
	}
}
