package yarnbiz.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellerProduct extends BaseClass{

WebDriver driver;
	
	@FindBy(xpath ="//*[@id='wk-mp-menu-product']")
	private WebElement Products;
	
	@FindBy(xpath ="//*[text()='Add Products']")
	private WebElement AddProducts;
	
	@FindBy(xpath ="//*[text()='My Products List']")
	private WebElement MyProducts;
	
	@FindBy(xpath ="//*[@name='set']")
	private WebElement attributeSet;
	
	@FindBy(xpath ="//*[text()='Filament']")
	private WebElement filament;
	
	@FindBy(xpath ="//*[text()='Spun']")
	private WebElement spun;

	@FindBy(xpath ="//*[@title='Continue']")
	private WebElement ContinueButton;
	
	@FindBy(xpath ="//*[@title='Save']")
	private WebElement Save;
	
	@FindBy(xpath ="//*[@title='Save & Duplicate']")
	private WebElement saveDuplicate;
	
	@FindBy(xpath ="//*[@id='name']")
	private WebElement productName;
	
	@FindBy(xpath ="//*[@id='sku']")
	private WebElement sku;
	
	@FindBy(xpath ="//*[@id='price_per_kg']")
	private WebElement prizeKg;
	
	@FindBy(xpath ="//*[@id='qty']")
	private WebElement stock;
	
	@FindBy(xpath ="//*[@id='weight']")
	private WebElement weightKg;
	
	@FindBy(xpath ="(//*[@id='visibility'])[2]")
	private WebElement plantAdd;
	
	@FindBy(xpath ="//*[contains(@value,'PLANT')]")
	private WebElement address;
	
	@FindBy(xpath ="//*[@name='product[lot_no]']")
	private WebElement lotNo;
	
	@FindBy(xpath ="//*[@name='product[uom]']")
	private WebElement mesurement;
	
	@FindBy(xpath ="//*[@value='21']")
	private WebElement filamentBox;

	@FindBy(xpath ="//*[@value='20']")
	private WebElement spunBox;

	@FindBy(xpath ="//*[@name='product[length]']")
	private WebElement bagLength;

	@FindBy(xpath ="//*[@name='product[breadth]']")
	private WebElement bagWidth;
	
	@FindBy(xpath ="//*[@name='product[height]']")
	private WebElement bagHeight;
	
	@FindBy(xpath ="//*[@value='34']")
	private WebElement redyInv;
	
	@FindBy(xpath ="//*[@id='min_gst_amount']")
	private WebElement hsnNo;
	
	public SellerProduct(WebDriver driver) throws IOException {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void AddProduct () throws InterruptedException
	{
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
		Products.click();
		Thread.sleep(2000);
		AddProducts.click();
		Thread.sleep(2000);
		//attributeSet.click();
		//Thread.sleep(2000);
		//filament.click();
		Thread.sleep(2000);
		ContinueButton.click();
		productName.sendKeys("Auto Product 4"); //CHange
		sku.sendKeys("1001:30");//change
		prizeKg.sendKeys("100");
		weightKg.sendKeys("100");
		stock.sendKeys("100");
		plantAdd.click();
		address.click();
		lotNo.sendKeys("100");
		mesurement.click();
		filamentBox.click();
		bagLength.sendKeys("10");
		bagWidth.sendKeys("10");
		bagHeight.sendKeys("10");
        redyInv.click();
        hsnNo.sendKeys("1005");
		
        Thread.sleep(2000);
		Save.click();
	}
	
	public void filterProduct() throws InterruptedException {
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
		Products.click();
		Thread.sleep(2000);
		MyProducts.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Filters']")).click();
		
		
	}
	}

