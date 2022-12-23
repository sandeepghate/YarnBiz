package yarnbiz.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDP_Page extends BaseClass {

	WebDriver driver;

	@FindBy(xpath ="//input[@class='amsearch-input']")
	private WebElement Search;
	
	@FindBy(xpath ="(//a[@title='jaimin test'])[3]")
	private WebElement SelectProduct;
	

	@FindBy(xpath ="//input[@id='validate-zip']")
	private WebElement EnterZip;
	
	@FindBy(xpath ="//span[text()='Check']")
	private WebElement CheckZip;
	
	
	public PDP_Page(WebDriver driver) throws IOException {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void SearchProduct () throws InterruptedException {
	
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
		Search.sendKeys("jaimin");//search product
		Thread.sleep(2000);
        SelectProduct.click();
		Thread.sleep(1000);
	
	}
	public void checkZip() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
		EnterZip.sendKeys("411006");
		Thread.sleep(1000);

		CheckZip.click();
		Thread.sleep(4000);

	
	
	}


}
