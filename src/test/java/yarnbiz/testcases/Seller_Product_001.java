package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;
public class Seller_Product_001 extends ListenerClass{
	
	//***************CHANGE DATA FOR THIS TEST CASE **************************//


/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Verify the Seller should allowed to add new product 
	 * Test ID   :TC_YBZ_242
	 * 
	 * Summary   :User should be able allowed to add new Product ,modify with an option to do for a single 
	 *            product else bulk upload using fixed standard template of nimbark 
	 * 
*******************************************************************************************************/

	@Test
	public void Seller_Product_001() throws InterruptedException 
	{
		lp.SellerLogin();;
		//test.info("Clicked On Seller Login");
		lp.enterCredentials();
	   //test.info("Credentials Entered ");
		
		lp.clickOnLogin();
	    //test.info("clicked on login button");
		
		sp.AddProduct();
		
		
		Thread.sleep(1000);
    	WebElement RequiredMsg=driver.findElement(By.xpath("//*[text()='Your product has been successfully saved']"));
		Assert.assertTrue(RequiredMsg.isDisplayed());
        //test.info("seller Product added successfully.");
	}
}
