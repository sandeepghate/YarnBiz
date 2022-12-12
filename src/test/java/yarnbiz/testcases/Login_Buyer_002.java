package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Login_Buyer_002 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify user is login with valid EmaiID and Password
 * Test ID   :TC_YBZ_058
 * 
 * Summary   :Successful login.
 * 
********************************************************************************************************/

	@Test
	public void Login_Buyer_002() throws Exception
	{				
		lp.BuyerLogin();;
		//test.info("Clicked On Seller Login");
		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sandeepg@techsevin.com ");
		   driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Sandeep@12345");
	//   test.info("Credentials Entered ");
		
		lp.clickOnLogin();
	  //  test.info("clicked on login button");
	    
	   String ExpectedTitle= "Category List /"; // Leading Yarn Market Place in India | YarnBiz
	   String ActualTitle =driver.getTitle();
	   Assert.assertEquals(ActualTitle, ExpectedTitle);
	   

		
	}
}
