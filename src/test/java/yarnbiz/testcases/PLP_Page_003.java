package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class PLP_Page_003 extends ListenerClass{


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify Filter by Category is working as expected
	 * Test ID   :TC_YBZ_184
	 * 
	 * Summary   :User should be able to see results as per category filter he applied
********************************************************************************************************/

    @Test
	public void PLP_Page_003 () throws InterruptedException {
		
		
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

		  driver.findElement(By.xpath("(//*[@class='filter-options-title'])[1]")).click();
		  Thread.sleep(2000);

		  driver.findElement(By.xpath("//*[text()='POY/FOY']")).click();

		  Thread.sleep(2000);
	      String ExpectedTitle1= "POY/FOY - Filament"; 
		   String ActualTitle1 =driver.getTitle();
		   Assert.assertEquals(ActualTitle1, ExpectedTitle1);
		    //test.info("Redirect to POY/FOY -Filament page.");
	
    
    }
	

}
