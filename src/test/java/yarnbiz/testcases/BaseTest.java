package yarnbiz.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadDataFromConfig;
import yarnbiz.pages.CartPage;
import yarnbiz.pages.LoginPage;
import yarnbiz.pages.MiniCartPage;
import yarnbiz.pages.RegistrationPage;
public class BaseTest {
	
	public static WebDriver driver;
	public LoginPage lp;
	public RegistrationPage rp;
    public MiniCartPage mc;
    public CartPage cp;

	
//	@BeforeSuite
//	public void initBrowser() throws IOException {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		
//	options.addArguments("--disable-notifications");	
////	options.addArguments("--incognito");
//		options.addArguments("--start-maximized");
////	options.addArguments("--headless");
////	Headless is a mode in which we execute the script but it will not display any activity to the user 
//		
//		driver = new ChromeDriver(options); //chrome browser will get open
////        String url = ReadDataFromConfig.getPropData("url");
////	    driver.get(url);		
//
//	  // driver.switchTo().alert().accept();
//	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options); //chrome browser will get open

		String url = ReadDataFromConfig.getPropData("stageurl");
	    driver.get(url);
//	    Thread.sleep(100);
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	    lp = new LoginPage(driver);
		rp = new RegistrationPage(driver);
	    mc = new MiniCartPage(driver);
	    cp = new CartPage(driver);

	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
//	
//	@BeforeClass
//	public void objectCreation() throws IOException
//	{
//		 lp = new LoginPage(driver);
//		 rp = new RegistrationPage(driver);
//	}
	
	
}
