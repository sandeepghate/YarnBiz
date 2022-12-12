package yarnbiz.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Registration_Seller extends ListenerClass {
	

	//***************CHANGE DATA FOR THIS TEST CASE **************************//

/*******************************************************************************************************
	 * Author    :Sandeep Ghate
	 * 
	 * Test Case :Check the user able to register by entering the valid data in all field
	 * Test ID   :TC_YBZ_030
	 * 
	 * Summary   :user is able to register with valid data
	 * 
*******************************************************************************************************/

	

	@Test
    public void Registration_Seller() throws InterruptedException 
    {
    	rp.SellerRegistration();
		//test.info("Seller Registeration form filled Successfully");
    	rp.CreateAccountSeller();
   // 	Thread.sleep(1000);
//    	WebElement VoilaCreate=driver.findElement(By.xpath("//div[text()='Voila! Account Created!']"));
//		Assert.assertTrue(VoilaCreate.isDisplayed());
//        test.info("text is displayed");

    	//div[text()='Voila! Account Created!']
    }
}
