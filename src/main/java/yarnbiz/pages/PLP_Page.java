package yarnbiz.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PLP_Page  extends BaseClass{

	WebDriver driver;

	@FindBy(xpath ="//input[@class='amsearch-input']")
	private WebElement Search;
	
	@FindBy(xpath ="//*[@title='Spun']")
	private WebElement SelectProduct;
	
	
	public PLP_Page(WebDriver driver) throws IOException {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	public void SearchProduct () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
		Search.sendKeys("spun");//search product
		Thread.sleep(2000);
        SelectProduct.click();
		Thread.sleep(1000);
	
	}

	
	
}
