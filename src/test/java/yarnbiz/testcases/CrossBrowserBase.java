package yarnbiz.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserBase {

	WebDriver driver;
	FirefoxOptions firefoxoptions = new FirefoxOptions();
	ChromeOptions chromeoptions = new ChromeOptions();
	
	@Parameters("browser")
	@BeforeTest
	public void initialize(String browser)
	{
	  
	
		if (browser.equalsIgnoreCase("chrome"))
		{
			 WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
			 System.out.println("Chrome is Launched");
			
		}
		
		else if (browser.equalsIgnoreCase("firefox"))
		{
			 WebDriverManager.firefoxdriver().setup();
			 driver =new FirefoxDriver();
			 System.out.println("Chrome is Launched");
			
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
		 WebDriverManager.edgedriver().setup();
		 driver =new EdgeDriver();
		 System.out.println("Edge is Launched");
		}

	}
		@Test
		public void Login()
		{
		  driver.get("https://projects.dev.techsevin.com/?controller=AuthController&action=login");	
		  
		}
		
 
		
		
		
		
		
		
	}
	
