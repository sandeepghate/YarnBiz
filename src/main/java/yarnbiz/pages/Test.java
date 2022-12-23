package yarnbiz.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
        
		try
		{
		driver.findElement(By.xpath("(//p[@class='sc-bBHxTw hqJqrJ fswWidgetPlaceholder'])[2]")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("M");
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//p[@class='sc-iAKWXU fyJDfj']//span[@class='autoCompleteTitle ']"));
		System.out.println("TotalElement List:" + ele.size());

		for (WebElement i : ele) 
	    {  
			System.out.println(i.getText());
			
			if (i.getText().contains("Pantnagar, India")) 
			{
				i.click();
			}
		}
		}
		catch(StaleElementReferenceException e)
		{
			System.out.println("stale element exception:");
		
		}
		driver.close(); 
	}
}
