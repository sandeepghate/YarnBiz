package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PLP_Page_002 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify Filter and Sort are working or not
	 * Test ID   :TC_YBZ_182
	 * 
	 * Summary   :User Should be able to Filter and Sort as per their choice
********************************************************************************************************/

    @Test
	public void PLP_Page_002 () throws InterruptedException {
		
		
	  lp.BuyerLogin();;
	// test.info("Clicked On Buyer Login");
      lp.BuyerCredentials();
    //   test.info("Credentials Entered ");
	  lp.clickOnLogin();
    //  test.info("clicked on login button");
	  pl.SearchProduct();
	
	  Thread.sleep(3000);

	  driver.findElement(By.xpath("(//*[@class='filter-options-title'])[1]")).click();
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("//*[text()='Cotton']")).click();

	  Thread.sleep(2000);
      String ExpectedTitle= "Cotton - Spun"; 
	   String ActualTitle =driver.getTitle();
	   Assert.assertEquals(ActualTitle, ExpectedTitle);
	    //test.info("Redirect to Cotton - Spun page.");
		  Thread.sleep(3000);

		  driver.findElement(By.xpath("(//*[@class='amtheme-select-block -no-border'])[1]")).click();
		  Thread.sleep(2000);
	
		  driver.findElement(By.xpath("(//*[@class='amtheme-option '])[1]")).click();
 
		  Thread.sleep(3000);
	      String ExpectedUrl= "https://stage.yarnbiz.com/spun/cotton.html?product_list_order=name"; 
		   String ActualUrl =driver.getCurrentUrl();
		   Assert.assertEquals(ActualUrl, ExpectedUrl);
		    //test.info("Redirect to current URL page.");
	  
		  
	}
	
}
