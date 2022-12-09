package yarnbiz.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {
	
WebDriver driver;
	
	
//*[@id=\"ammenu-header-container\"]/section/section/nav/ul/li[3]/a/p/span
	@FindBy(xpath ="//span[text()='Sell On YarnBiz']")
	private WebElement SellOnYarnBiz;

	//*[@id=\"ammenu-header-container\"]/section/section/nav/ul/li[4]/a/p/span
	@FindBy(xpath ="//span[text()='Buy On YarnBiz']")
	private WebElement BuyOnYarnBiz;
	//*[@id="ammenu-header-container"]/section/section/nav/ul/li[4]/a/p/span

	@FindBy(xpath ="//*[@id=\"maincontent\"]/div[3]/div/div[2]/section/section[1]/div[1]/div/div[1]/div/div[3]/a[1]")
	private WebElement NewSeller;
	
	@FindBy(xpath ="//a[@class='btnTheme-primary']")//*[@id="maincontent"]/div[3]/div/div[2]/section/section[1]/div[1]/div/div[1]/div/div[3]/a[1]
	private WebElement NewBuyer;

	@FindBy(xpath ="//*[@class='btn-block']")
	private WebElement BecomeSeller;
	
	@FindBy(xpath ="(//a[@class='btn-block'])[2]")
	private WebElement BecomeBuyer;
	
	@FindBy(xpath ="//*[@class='logo ammenu-logo ']")
	private WebElement Logo;
	
	@FindBy(xpath ="//span[text()='Home']")
	private WebElement Home;
	
	@FindBy(xpath ="//span[text()='Back']")
	private WebElement BackButton;
	
	@FindBy(xpath ="//span[text()='Create an Account']")
	private WebElement CreateButton;
	
		public RegistrationPage(WebDriver driver) throws IOException {
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
		public void Home () {
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
		 Home.click();
		}
		public void Back () {
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			 BackButton.click();
			}
		public void CreateAccountBuyer () throws InterruptedException {
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			 CreateButton.click();
			 Thread.sleep(1000);
			// driver.findElement(By.xpath("//span[text()='Ok']")).click();

			 
			}
		public void CreateAccountSeller () throws InterruptedException {
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			 Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='primary sellerregister']")).click();
				
				//a[@class='wk-signup-complete-dashboard-btn']
				
			}
		
		public void Logo () {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			 Logo.click();
			}
		
		public void NewSeller() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(2000);
			SellOnYarnBiz.click();
			Thread.sleep(1000);
			NewSeller.click();
			Thread.sleep(1000);
			BecomeSeller.click();
			
		}
		
		public void NewBuyer() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(2000);
			 BuyOnYarnBiz.click();
				Thread.sleep(1000);
			   NewBuyer.click();
				Thread.sleep(1000);

			   BecomeBuyer.click();	
			   }
		
			
		public void BuyerRegistration () throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(2000);
		       BuyOnYarnBiz.click();
				Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			   NewBuyer.click();
				Thread.sleep(1000);
			   BecomeBuyer.click();
				Thread.sleep(1000);
			    driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sandeep");
				driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Ghate");
				driver.findElement(By.xpath("//input[@id='customer_mobile']")).sendKeys("8334985590");//Change
				driver.findElement(By.xpath("//input[@id='gst']")).sendKeys("18AABCU9603R1ZM");
				driver.findElement(By.xpath("//input[@id='gstname']")).sendKeys("Techsevin Pvt Ltd");
				driver.findElement(By.xpath("//button[@class='action primary gstbtn padding_btn']")).click();
				driver.findElement(By.xpath("//button[@class='send_otp action primary']")).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
				driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1234");
				driver.findElement(By.xpath("//button[@class='verif_otp action primary']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='action primary panbtn padding_btn']")).click();
				driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("saneokpokhdh@techsevin.com");//Change
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sandeep@12345");
				driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Sandeep@12345");
				driver.findElement(By.xpath("//input[@id='panname']")).sendKeys("CHFPG2292E");
				driver.findElement(By.xpath("//input[@id='pan']")).sendKeys("SANDEEP VENKATESHRAO GHATE");
				driver.findElement(By.xpath("//input[@id='tancompany']")).sendKeys("Techsevin Pvt Ltd");
				driver.findElement(By.xpath("//input[@id='tan']")).sendKeys("123456789");
				driver.findElement(By.xpath("//button[@class='action primary tanbtn padding_btn']")).click();
				driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Techsevin Solution");
				driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("1234567890");
				driver.findElement(By.xpath("//input[@id='street_1']")).sendKeys("C-79 Sarvdharm Society");
				driver.findElement(By.xpath("//input[@id='street_2']")).sendKeys("Ashok Nagar");
				driver.findElement(By.xpath("//input[@id='street_3']")).sendKeys("Mhada Yerwda");
				driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
				driver.findElement(By.xpath("//select[@id='region_id']")).sendKeys("Goa");
				driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("411006");
				driver.findElement(By.xpath("//select[@id='country']")).sendKeys("Nepal");
				driver.findElement(By.xpath("//select[@id='user_type']")).sendKeys("Trader");
				driver.findElement(By.xpath("//input[@id='address:poc_email_address']")).sendKeys("sandeep.ghate@pocmusic.com");
				driver.findElement(By.xpath("//input[@id='address:poc_mobile_number']")).sendKeys("9854876424");
				driver.findElement(By.xpath("//input[@id='address:buyer_gst_number']")).sendKeys("18AABCU9603R1ZM");
				driver.findElement(By.xpath("//input[@id='beneficiaryName']")).sendKeys("Sandeep Ghate");
				driver.findElement(By.xpath("//input[@id='beneficiaryAccount']")).sendKeys("784124456412");
				driver.findElement(By.xpath("//input[@id='beneficiaryIFSC']")).sendKeys("KKBK0006545");
				driver.findElement(By.xpath("//input[@id='beneficiaryMobile']")).sendKeys("9835456215");
				driver.findElement(By.xpath("(//span[text()='Verify'])[4]")).click();
				
				
			}	
		public void SellerRegistration () throws InterruptedException {
			Thread.sleep(2000);
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			SellOnYarnBiz.click();
			Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			NewSeller.click();
			Thread.sleep(1000);

			BecomeSeller.click();
			driver.findElement(By.xpath("//input[@id='supplier-email']")).sendKeys("Sqwqokzokqqug@techsevin.com");//Plz Change
			driver.findElement(By.xpath("//input[@id='supplier-password']")).sendKeys("Sandeep@1234");
			driver.findElement(By.xpath("//input[@id='supplier-re-password']")).sendKeys("Sandeep@1234");
			driver.findElement(By.xpath("//input[@id='customer_mobile']")).sendKeys("8886434544");//Plz Change
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       

			driver.findElement(By.xpath("//button[@class='send_otp action primary']")).click();
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       

			driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1234");
			driver.findElement(By.xpath("//button[@class='verif_otp action primary']")).click();
		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            Thread.sleep(2000);
     		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
            Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='supplier-first-name']")).sendKeys("Sandeep");
			driver.findElement(By.xpath("//input[@id='supplier-last-name']")).sendKeys("Ghate");
			driver.findElement(By.xpath("//input[@id='supplier-company']")).sendKeys("Techsevin Pvt Ltd");
			driver.findElement(By.xpath("//input[@id='supplier-company-url']")).sendKeys("WWW.Teznoknszqdj.COM");//Plz change
			driver.findElement(By.xpath("//input[@id='supplier-phone']")).sendKeys("9542564866");
			driver.findElement(By.xpath("//select[@id='region_id']")).sendKeys("Goa");
			driver.findElement(By.xpath("//input[@id='supplier-city']")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@id='supplier-postcode']")).sendKeys("411006");
			driver.findElement(By.xpath("//input[@id='supplier-address']")).sendKeys("Katraj narhe near jspm");
			driver.findElement(By.xpath("//input[@id='gst']")).sendKeys("18AABCU9603R1ZM");
			driver.findElement(By.xpath("//input[@id='gstname']")).sendKeys("Sandeep Ghate");
			driver.findElement(By.xpath("(//span[text()='Verify'])[1]")).click();
			driver.findElement(By.xpath("//input[@id='panname']")).sendKeys("Sandeep Ghate");
			driver.findElement(By.xpath("//input[@id='pan']")).sendKeys("CHFPG2292E");
			driver.findElement(By.xpath("(//span[text()='Verify'])[2]")).click();
			driver.findElement(By.xpath("//input[@id='tancompany']")).sendKeys("Techsevin Pvt Ltd");
			driver.findElement(By.xpath("//input[@id='tan']")).sendKeys("18AABCU9603R1ZM");
			driver.findElement(By.xpath("(//span[text()='Verify'])[3]")).click();
			driver.findElement(By.xpath("//input[@id='beneficiaryName']")).sendKeys("Sandeep Ghate");
			driver.findElement(By.xpath("//input[@id='beneficiaryAccount']")).sendKeys("54564426548");
			driver.findElement(By.xpath("//input[@id='beneficiaryIFSC']")).sendKeys("KKBK007112");
			driver.findElement(By.xpath("//input[@id='beneficiaryMobile']")).sendKeys("9521556524");
			driver.findElement(By.xpath("(//span[text()='Verify'])[4]")).click();
			
		//	driver.findElement(By.xpath("(//button[@id='register']")).click();
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//div[@class='primary sellerregister']")).click();
			
//div[text()='You have successfully registered as Supplier with us.']
						
		}	
		public void SellerForm() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
			driver.findElement(By.xpath("//input[@id='supplier-email']")).sendKeys("Sandeepgegeg@techsevin.com");
			driver.findElement(By.xpath("//input[@id='supplier-password']")).sendKeys("Sandeep@1234");
			driver.findElement(By.xpath("//input[@id='supplier-re-password']")).sendKeys("Sandeep@1234");
			driver.findElement(By.xpath("//input[@id='customer_mobile']")).sendKeys("8983656524");
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       

			driver.findElement(By.xpath("//button[@class='send_otp action primary']")).click();
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       

			driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1234");
			driver.findElement(By.xpath("//button[@class='verif_otp action primary']")).click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	       

			driver.findElement(By.xpath("//button[@id='proceed']")).click();
			driver.findElement(By.xpath("//input[@id='supplier-first-name']")).sendKeys("Sandeep");
			driver.findElement(By.xpath("//input[@id='supplier-last-name']")).sendKeys("Ghate");
			driver.findElement(By.xpath("//input[@id='supplier-company']")).sendKeys("Techsevin Pvt Ltd");
			driver.findElement(By.xpath("//input[@id='supplier-company-url']")).sendKeys("WWW.Techsevin.COM");
			driver.findElement(By.xpath("//input[@id='supplier-phone']")).sendKeys("9542564866");
			driver.findElement(By.xpath("//select[@id='region_id']")).sendKeys("Goa");
			driver.findElement(By.xpath("//input[@id='supplier-city']")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@id='supplier-postcode']")).sendKeys("411006");
			driver.findElement(By.xpath("//input[@id='supplier-address']")).sendKeys("Katraj narhe near jspm");
			driver.findElement(By.xpath("//input[@id='gst']")).sendKeys("18AABCU9603R1ZM");
			driver.findElement(By.xpath("//input[@id='gstname']")).sendKeys("Sandeep Ghate");
			driver.findElement(By.xpath("(//span[text()='Verify'])[1]")).click();
			driver.findElement(By.xpath("//input[@id='panname']")).sendKeys("Sandeep Ghate");
			driver.findElement(By.xpath("//input[@id='pan']")).sendKeys("CHFPG2292E");
			driver.findElement(By.xpath("(//span[text()='Verify'])[2]")).click();
			driver.findElement(By.xpath("//input[@id='tancompany']")).sendKeys("Techsevin Pvt Ltd");
			driver.findElement(By.xpath("//input[@id='tan']")).sendKeys("18AABCU9603R1ZM");
			driver.findElement(By.xpath("(//span[text()='Verify'])[3]")).click();
			driver.findElement(By.xpath("//input[@id='beneficiaryName']")).sendKeys("Sandeep Ghate");
			driver.findElement(By.xpath("//input[@id='beneficiaryAccount']")).sendKeys("54564426548");
			driver.findElement(By.xpath("//input[@id='beneficiaryIFSC']")).sendKeys("KKBK007112");
			driver.findElement(By.xpath("//input[@id='beneficiaryMobile']")).sendKeys("9521556524");
			driver.findElement(By.xpath("(//span[text()='Verify'])[4]")).click();
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
			driver.findElement(By.xpath("(//span[text()='Register']")).click();
	
			
//div[text()='You have successfully registered as Supplier with us.']
		
		}	
		public void BuyerForm() {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
			   driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sandeep");
				driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Ghate");
				driver.findElement(By.xpath("//input[@id='customer_mobile']")).sendKeys("9854612367");
				driver.findElement(By.xpath("//input[@id='gst']")).sendKeys("18AABCU9603R1ZM");
				driver.findElement(By.xpath("//input[@id='gstname']")).sendKeys("Techsevin Pvt Ltd");
				driver.findElement(By.xpath("//button[@class='action primary gstbtn padding_btn']")).click();
				driver.findElement(By.xpath("//button[@class='send_otp action primary']")).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
				driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1234");
				driver.findElement(By.xpath("//button[@class='verif_otp action primary']")).click();
				driver.findElement(By.xpath("//button[@class='action primary panbtn padding_btn']")).click();
				driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("sandeep.ghate@techsevin.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sandeep@12345");
				driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Sandeep@12345");
				driver.findElement(By.xpath("//input[@id='panname']")).sendKeys("CHFPG2292E");
				driver.findElement(By.xpath("//input[@id='pan']")).sendKeys("SANDEEP VENKATESHRAO GHATE");
				driver.findElement(By.xpath("//input[@id='tancompany']")).sendKeys("Techsevin Pvt Ltd");
				driver.findElement(By.xpath("//input[@id='tan']")).sendKeys("123456789");
				driver.findElement(By.xpath("//button[@class='action primary tanbtn padding_btn']")).click();
				driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Techsevin Solution");
				driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("1234567890");
				driver.findElement(By.xpath("//input[@id='street_1']")).sendKeys("C-79 Sarvdharm Society");
				driver.findElement(By.xpath("//input[@id='street_2']")).sendKeys("Ashok Nagar");
				driver.findElement(By.xpath("//input[@id='street_3']")).sendKeys("Mhada Yerwda");
				driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
				driver.findElement(By.xpath("//select[@id='region_id']")).sendKeys("Goa");
				driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("411006");
				driver.findElement(By.xpath("//select[@id='country']")).sendKeys("Nepal");
				driver.findElement(By.xpath("//select[@id='user_type']")).sendKeys("Trader");
				driver.findElement(By.xpath("//input[@id='address:poc_email_address']")).sendKeys("sandeep.ghate@pocmusic.com");
				driver.findElement(By.xpath("//input[@id='address:poc_mobile_number']")).sendKeys("9854876424");
				driver.findElement(By.xpath("//input[@id='address:buyer_gst_number']")).sendKeys("18AABCU9603R1ZM");
				driver.findElement(By.xpath("//input[@id='beneficiaryName']")).sendKeys("Sandeep Ghate");
				driver.findElement(By.xpath("//input[@id='beneficiaryAccount']")).sendKeys("784124456412");
				driver.findElement(By.xpath("//input[@id='beneficiaryIFSC']")).sendKeys("KKBK0006545");
				driver.findElement(By.xpath("//input[@id='beneficiaryMobile']")).sendKeys("9835456215");
				driver.findElement(By.xpath("(//span[text()='Verify'])[4]")).click();
				
		
		}	
		

		
		public void SellOnYarnBiz() throws InterruptedException {
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	  
			SellOnYarnBiz.click();
		
		}	
		
		public void BuyOnYarnBiz () throws InterruptedException {
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			BuyOnYarnBiz.click();
		
		}	
		
		public void VerifyGST () {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	       
			driver.findElement(By.xpath("//input[@id='gst']")).sendKeys("18AABCU9603R1ZM");
			driver.findElement(By.xpath("//input[@id='gstname']")).sendKeys("Techsevin Pvt Ltd");
			driver.findElement(By.xpath("//button[@class='action primary gstbtn padding_btn']")).click();

		}	
		
		
		
		
		
		
	}

	
	


