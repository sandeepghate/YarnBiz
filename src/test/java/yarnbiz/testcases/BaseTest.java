package yarnbiz.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadDataFromConfig;
import yarnbiz.pages.CartPage;
import yarnbiz.pages.CheckOutPage;
import yarnbiz.pages.LoginPage;
import yarnbiz.pages.MiniCartPage;
import yarnbiz.pages.PDP_Page;
import yarnbiz.pages.PLP_Page;
import yarnbiz.pages.RegistrationPage;
import yarnbiz.pages.SellerProduct;
public class BaseTest {
	
	public static WebDriver driver;
	public LoginPage lp;
	public RegistrationPage rp;
    public MiniCartPage mc;
    public CartPage cp;
    public CheckOutPage cop;
    public PDP_Page pd;
    public PLP_Page pl;
    public SellerProduct sp;


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

	    lp = new LoginPage(driver);
		rp = new RegistrationPage(driver);
	    mc = new MiniCartPage(driver);
	    cp = new CartPage(driver);
        cop = new CheckOutPage(driver);
        pd = new PDP_Page(driver);
        pl=new PLP_Page(driver);
        sp=new SellerProduct(driver);
        
	}

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

	
	
}
