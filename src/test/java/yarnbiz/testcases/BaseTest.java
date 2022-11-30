package yarnbiz.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadDataFromConfig;
import yarnbiz.pages.LoginPage;
public class BaseTest {
	
	public static WebDriver driver;
	public LoginPage lp;

	
	@BeforeSuite
	public void initBrowser() throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
	options.addArguments("--disable-notifications");	
//	options.addArguments("--incognito");
		options.addArguments("--start-maximized");
//	options.addArguments("--headless");
//	Headless is a mode in which we execute the script but it will not display any activity to the user 
		
		driver = new ChromeDriver(options); //chrome browser will get open
        String url = ReadDataFromConfig.getPropData("url");
	    driver.get(url);		

	  // driver.switchTo().alert().accept();
	}
		
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	@BeforeClass
	public void objectCreation() throws IOException
	{
		 lp = new LoginPage(driver);
//		 db = new DashBoard(driver);
	}

	
}
