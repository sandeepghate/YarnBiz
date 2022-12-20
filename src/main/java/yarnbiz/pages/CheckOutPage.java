package yarnbiz.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BaseClass{
	
WebDriver driver;
	
	@FindBy(xpath ="//button[@id='top-cart-btn-checkout']")
	private WebElement CheckOutButton;
	
	@FindBy(xpath ="//button[@title='New Address']")
	private WebElement NewAddress;
	
	//*[text()='Thank You for Placing an Order on YarnBiz. ']
	
	
	public CheckOutPage(WebDriver driver) throws IOException {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnCheckOut () throws InterruptedException {

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	     	
//		  driver.findElement(By.xpath("//a[text()='View and Edit Cart']")).click();
//		  Thread.sleep(8000);
//	        driver.findElement(By.xpath("(//button[@class='action secondary checkout'])[2]")).click();
//	      
	    CheckOutButton.click();
	}
	public void shippingAddress () throws InterruptedException {

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(2000);

		NewAddress.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sumedh");
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Paikrao");
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("jsp road nagar");
		driver.findElement(By.xpath("(//div[@class='amtheme-select-block'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='Maharashtra'])[3]")).click();
	
		driver.findElement(By.xpath("//input[@name='city']")).clear();
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='postcode']")).clear();
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("431715");
		driver.findElement(By.xpath("//input[@name='telephone']")).clear();		
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9845125166");
		driver.findElement(By.xpath("(//*[@class=\"input-text\"])[12]")).sendKeys("jhdydy@gmail.com");
		driver.findElement(By.xpath("(//*[@class=\"input-text\"])[13]")).sendKeys("9845120066");
		//driver.findElement(By.xpath("//input[@id='shipping-save-in-address-book']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='action action-save']")).click();

		
		



		

	}

}
