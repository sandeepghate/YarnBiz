package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Login_Buyer_001 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify that Existing Buyer butten is visible and clickable or not
	 * Test ID   :TC_YBZ_057
	 * 
	 * Summary   :The Existing Buyer button is visible and clickable and redirect to the login page
  
	 * 
*******************************************************************************************************/
  
  @Test
  public void Login_Buyer_001() throws InterruptedException {
	rp.BuyOnYarnBiz();
	driver.findElement(By.xpath("//a[@class='btnTheme-secondary']")).click();
	Thread.sleep(1000);
	String ExpectedTitle= "Buyer Login"; 
	 String ActualTitle =driver.getTitle();
	 Assert.assertEquals(ActualTitle, ExpectedTitle);
    // test.info("Successfully Redirect to Seller Login ");
  }
	
}
