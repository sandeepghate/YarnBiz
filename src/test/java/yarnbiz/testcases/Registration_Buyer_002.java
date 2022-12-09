package yarnbiz.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadDataFromConfig;
/***************************************************************************************************
 * Author    : Sandeep Ghate
 * 
 * Test Case :Verify the user shoule able to add details in the registeration form
 * Test ID   :TC_YBZ_004
 * 
 * Summary   :User should able to add basic details .
 * 
****************************************************************************************************/


public class Registration_Buyer_002 extends ListenerClass{


	@Test
	public void Registration_Buyer_002() throws InterruptedException
	{		
		rp.BuyerRegistration();
		test.info("Buyer Registeration form filled Successfully");
	
	}
	
	
}