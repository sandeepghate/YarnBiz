package yarnbiz.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class CartPage extends BaseClass {

	WebDriver driver;
	
	@FindBy(xpath ="//input[@class='amsearch-input']")
	private WebElement Search;
	
	@FindBy(xpath ="(//a[@title='jaimin test'])[3]")
	private WebElement SelectProduct;
	
	@FindBy(xpath ="//input[@id='validate-zip']")
	private WebElement EnterZip;
	
	@FindBy(xpath ="//span[text()='Check']")
	private WebElement CheckZip;
	
	@FindBy(xpath ="//button[@id='product-addtocart-button']")
	private WebElement addtocartbutton;
	
	@FindBy(xpath ="//span[@class='cart-price']")
	private WebElement CartPrize;
	
	@FindBy(xpath ="//div[@title='Plus']")
	private WebElement incQuantity;
	
	@FindBy(xpath ="//div[@title='Minus']")
	private WebElement decQuantity;
	

	@FindBy(xpath ="//input[@class='input-text qty amtheme-qty']")
	private WebElement qtyCount;
	
	@FindBy(xpath ="(//button[@name='update_cart_action'])[1]")
	private WebElement updateButton;
	
	public CartPage(WebDriver driver) throws IOException {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
		public void AddProductInCart () throws InterruptedException {
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			Search.sendKeys("jaimin");//search product
			Thread.sleep(2000);
            SelectProduct.click();
			Thread.sleep(1000);
            EnterZip.sendKeys("411006");
			Thread.sleep(1000);
            CheckZip.click();
			Thread.sleep(5000);
			addtocartbutton.click();
			
			}
		public void OutOfStockProductInCart () throws InterruptedException {
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			Search.sendKeys("test11");//search product
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='amsearch-highlight'])[2]")).click();
			Thread.sleep(3000);
            EnterZip.sendKeys("411006");
			Thread.sleep(2000);
            CheckZip.click();
			Thread.sleep(5000);
			addtocartbutton.click();
			
			}
		public void increaseQty() throws InterruptedException {
		
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			String count = qtyCount.getAttribute("value");
			System.out.println(count);
			Thread.sleep(3000);
			incQuantity.click();
			Thread.sleep(10000);
			updateButton.click();
			Thread.sleep(10000);
			String count1 = qtyCount.getAttribute("value");
			System.out.println(count1);
			 if (count != count1)
			 { 
				 System.out.println("Qty increased"); 
				 }
			 else {
			 System.out.println("Qty not increased");
			 }	 
	     }
		public void decreaseQty() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			String count = qtyCount.getAttribute("value");
			//System.out.println(count);
			decQuantity.click();
			Thread.sleep(3000);
			updateButton.click();
			Thread.sleep(3000);
			String count1 = qtyCount.getAttribute("value");
			//System.out.println(count1);
			 if (count != count1)
			 { 
				 System.out.println("Qty increased"); 
				 }
			 else {
			 System.out.println("Qty not increased");
			 }
			 

	     }
		 

}