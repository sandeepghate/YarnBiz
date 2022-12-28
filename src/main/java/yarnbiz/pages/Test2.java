package yarnbiz.pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	int i = 10;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

  try {
	    driver.get("https://www.goibibo.com/flights/");
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");

		List<WebElement> ele = driver.findElements(By.xpath(
				"//ul[@id='autoSuggest-list']//li//p[@class='sc-iAKWXU fyJDfj']//span[@class='autoCompleteTitle ']"));
		System.out.println("TotalElement List:" + ele.size());

		for (WebElement i : ele) {
			
				System.out.println(i.getText());
		
			
			if (i.getText().contains("Pune, India")) 
			{
				i.click();
			}
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("M");

		List<WebElement> webele = driver.findElements(By.xpath(
				"//ul[@id='autoSuggest-list']//li//p[@class='sc-iAKWXU fyJDfj']//span[@class='autoCompleteTitle ']"));

		System.out.println("TotalElement List:" + webele.size());

		for (WebElement s : webele) {
			System.out.println(s.getText());

			if (s.getText().contains("Mysore, India")) {
				s.click();
				break;
			}
		}
		}
  }
	catch(StaleElementReferenceException e)
	{
		System.out.println("stale element exception");
	
	}
		driver.close();

	}
}
