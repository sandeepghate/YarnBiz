package yarnbiz.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniCartPage extends BaseClass{

	WebDriver driver;

	@FindBy(xpath ="//*[@class='a'][1]")
	private WebElement MiniCartLogo;
	
	@FindBy(xpath ="//input[@class='amsearch-input']")
	private WebElement Search;
	
	@FindBy(xpath ="(//a[@title='jaimin test'])[3]")
	private WebElement SelectProduct;
	
	@FindBy(xpath ="//input[@id='validate-zip']")
	private WebElement EnterZip;
	
	@FindBy(xpath ="//span[text()='Check']")
	private WebElement CheckZip;
	
	
	@FindBy(xpath ="//div[@title='Plus']")
	private WebElement incQuantity;
	
	@FindBy(xpath ="//div[@title='Minus']")
	private WebElement decQuantity;
	
	@FindBy(xpath ="//button[@id='product-addtocart-button']")
	private WebElement addtocartbutton;
	
	
	
	
	//button[@id='product-addtocart-button']
	//a[text()='shopping cart']
	//a[@class='action delete']
	//button[@id='top-cart-btn-checkout']
	//a[text()='View and Edit Cart']
	
	public MiniCartPage(WebDriver driver) throws IOException {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
		
		public void minicartlogo () throws InterruptedException {
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			MiniCartLogo.click();
			}		
		
		public void searchProduct () throws InterruptedException {
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			Search.sendKeys("jaimin");//search product
			}	
		
		public void addProductInCart () throws InterruptedException {
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			Search.sendKeys("jaimin");//search product
			Thread.sleep(2000);
            SelectProduct.click();
			Thread.sleep(1000);
            EnterZip.sendKeys("411006");
			Thread.sleep(1000);
            CheckZip.click();
           // incQuantity.click();
			Thread.sleep(5000);
			addtocartbutton.click();
			
			}		
		
	}

