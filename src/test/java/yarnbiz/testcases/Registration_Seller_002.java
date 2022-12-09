package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

/*******************************************************************************************************
 * Author    : Sandeep Ghate
 * 
 * Test Case :Verify the user shoule able to add details in the registeration form
 * Test ID   :TC_YBZ_004
 * 
 * Summary   :User should able to add basic details .
 * 
********************************************************************************************************/


public class Registration_Seller_002 extends ListenerClass {

	 @Test
	    public void Registration_Seller_002() throws InterruptedException 
	    {
	    	rp.SellerRegistration();
			test.info("Seller Registeration form filled Successfully");
			
	    //	WebElement VoilaCreate=driver.findElement(By.xpath("//div[text()='Voila! Account Created!']"));
		//	Assert.assertTrue(VoilaCreate.isDisplayed());
	      //test.info("text is displayed");

	    	//div[text()='Voila! Account Created!']
	    	
	    }
}
