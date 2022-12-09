package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Home_Page_002 extends ListenerClass {


/*******************************************************************************************************
	 * Author    : Sandeep Ghate
	 * 
	 * Test Case :Verify the user is able to click on Sell on YarnBiz and  Buy on YarnBiz
	 * Test ID   :TC_YBZ_025
	 * 
	 * Summary   :The user has succesfully clicked on Sell on YarnBiz and redirect to the next page
  
	 * 
*******************************************************************************************************/
	
@Test	
public void Home_Page_002() throws InterruptedException {
	
	rp.BuyOnYarnBiz();
	String ExpectedTitle= "Buy Yarn in Bulk / Wholesale Online - Yarnbiz"; 
	 String ActualTitle =driver.getTitle();
	 Assert.assertEquals(ActualTitle, ExpectedTitle);
	test.info("Buyer Successfully Redirect to Next Page");
    rp.Home();
	Thread.sleep(2000);
	rp.SellOnYarnBiz();
	String ExpectedTitle2= "Sell Yarn - Become a Yarn Seller - Yarnbiz"; 
	 String ActualTitle2 =driver.getTitle();
	 Assert.assertEquals(ActualTitle2, ExpectedTitle2);
	 test.info("Seller Successfully Redirect to Next Page");

	
}
	

}
