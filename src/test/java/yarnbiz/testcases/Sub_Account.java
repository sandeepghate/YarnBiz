package yarnbiz.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class Sub_Account extends ListenerClass {


/*******************************************************************************************************
 * Author    :Sandeep Ghate
 * 
 * Test Case :Verify buyer can add 5 sub users to get day-today business activities completed.
 * Test ID   :TC_YBZ_067
 * 
 * Summary   :buyer succesfully added 5 sub users to get day-today business activities completed.
 * 
********************************************************************************************************/
   
	
	@Test
	public void SubAccount() throws InterruptedException {
		lp.BuyerLogin();;
		//test.info("Clicked On Seller Login");
		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sandeepg@techsevin.com ");
		   driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Sandeep@12345");
	//   test.info("Credentials Entered ");
		
		lp.clickOnLogin();
		   driver.findElement(By.xpath("//a[@class='amtheme-link -watchlist ']")).click();
		   driver.findElement(By.xpath("//a[text()='Sub Accounts']")).click();
		   driver.findElement(By.xpath("//span[text()=' Add New Sub Account']")).click();
		   driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sandeep");
		   driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Ghate");
		   driver.findElement(By.xpath("//input[@id='email']s']")).sendKeys("Sandeep@gmail.com");
		   driver.findElement(By.xpath("//option[text()=' Can Approve Carts']")).click();
		   driver.findElement(By.xpath("//span[text()=' Save Sub Account']")).click();

		
	}
}
