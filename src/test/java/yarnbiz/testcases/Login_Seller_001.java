package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Login_Seller_001 extends ListenerClass {


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify that Existing seller button is visible and clickable or not
	 * Test ID   :TC_YBZ_046
	 * 
	 * Summary   :TheExisting seller button is visible and clickable and redirect to the login page
  
	 * 
*******************************************************************************************************/
  
  @Test
  public void Login_Seller_001() throws InterruptedException {
	rp.SellOnYarnBiz();
	//a[@class='btnTheme-secondary']
	driver.findElement(By.xpath("//a[@class='btnTheme-secondary']")).click();
	Thread.sleep(1000);
	String ExpectedTitle= "Seller Login"; 
	 String ActualTitle =driver.getTitle();
	 Assert.assertEquals(ActualTitle, ExpectedTitle);
   // test.info("Successfully Redirect to Seller Registration Form");
  }
	
}
