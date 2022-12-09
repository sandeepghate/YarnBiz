package yarnbiz.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class LoginPage extends BaseClass {

	WebDriver driver;
	
	//*[@id="ammenu-header-container"]/div[1]/div/ul/li[3]/a
	@FindBy(xpath ="//a[contains(text(),'Buyer Login ')]")
	private WebElement BuyerLogin;
	
	@FindBy(xpath ="//a[contains(text(),'Seller Login')]")
	private WebElement SellerLogin;
	
	@FindBy(xpath ="//*[@class='action primary accept']")
	private WebElement stayinform;
	
	@FindBy(xpath ="//*[@id='reset_type_login']")
	private WebElement logintype;
	
	@FindBy(xpath ="//*[@id='email']")
	private WebElement username;
	
	@FindBy(xpath ="//*[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath ="//div[contains(@class,'rc-anchor-center-item rc-anchor-checkbox-holder')]//span[contains(@id,'recaptcha-anchor')]")
	private WebElement captcha;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement loginbutton;
	

	public LoginPage(WebDriver driver) throws IOException {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void BuyerLogin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     BuyerLogin.click();
		
	}
	
	public void SellerLogin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    SellerLogin.click();
	}

    public void enterCredentials(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		//Actions act= new Actions (driver);
		//act.click(captcha);
	}
   public void captcha()
   {
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  //driver.switchTo().frame("//iframe[@name='a-oxoisjqpadz']");
	//WebElement checkbox=driver.findElement(By.xpath("//div[contains(@class,'rc-anchor-center-item rc-anchor-checkbox-holder')]//span[contains(@id,'recaptcha-anchor')]"));
	 // checkbox.click();
	   
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@name='a-oxoisjqpadz']")));
	
	WebElement captchaCheckbox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'rc-anchor-center-item rc-anchor-checkbox-holder')]//span[contains(@id,'recaptcha-anchor')]")));
	captchaCheckbox.click();
   }
	

	public void clickOnLogin() {
		loginbutton.click();
	}
		
		
	}


