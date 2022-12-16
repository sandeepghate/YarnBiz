package yarnbiz.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Cart_Page_003 extends ListenerClass{


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify the Delet icon on the mini my cart
 * Test ID   :TC_YBZ_109
 * 
 * Summary   :Buyer should be able to click on delet icon and iteam should be delet from mini cart 
 * 
********************************************************************************************************/

	@Test
	public void Cart_Page_003() throws Exception
	{				
		lp.BuyerLogin();
		//test.info("Clicked On Buyer Login");
        lp.BuyerCredentials();
		//test.info("Credentials Entered ");
		  lp.clickOnLogin();
	      //test.info("clicked on login button");
	    
		  Thread.sleep(1000);
		 mc.addProductInCart();
		 
		  Thread.sleep(2000);
		  mc.minicartlogo();
	        driver.findElement(By.xpath("//a[text()='View and Edit Cart']")).click();
			  Thread.sleep(8000);
		  driver.findElement(By.xpath("(//*[@class='amtheme-icon'])[10]")).click();
		  Thread.sleep(3000);
		   WebElement RequiredMsg=driver.findElement(By.xpath("//p[text()='You have no items in your shopping cart.']"));
		   Assert.assertTrue(RequiredMsg.isDisplayed());
		   //test.info("Successfully items deleted from cart.");

		
	}
}
