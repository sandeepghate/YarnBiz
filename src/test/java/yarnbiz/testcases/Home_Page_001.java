package yarnbiz.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Home_Page_001 extends ListenerClass{

/*******************************************************************************************************
	 * Author    : Sandeep Ghate
	 * 
	 * Test Case :Verify the Sell On YarnBiz and Buy On YarnBiz text must present on home page
	 * Test ID   :TC_YBZ_024
	 * 
	 * Summary   :Sell On YarnBiz and Buy On YarnBiz text must be present on the home page
	 * 
*******************************************************************************************************/
	
@Test	
public void Home_Page_001() throws InterruptedException {
	
	Thread.sleep(2000);
	WebElement SellOnYarnBiz=driver.findElement(By.xpath("//span[text()='Sell On YarnBiz']"));
	WebElement BuyOnYarnBiz=driver.findElement(By.xpath("//span[text()='Buy On YarnBiz']"));

	Assert.assertTrue(SellOnYarnBiz.isDisplayed());
	Assert.assertTrue(BuyOnYarnBiz.isDisplayed());
    test.info("Both text present on home page");
	
	
}
	

}
