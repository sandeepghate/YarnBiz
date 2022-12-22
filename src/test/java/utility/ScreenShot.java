package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	//WAP to take the screenshot and call that method into another class
	
	public static String captureScreenshotWithPath(WebDriver driver, String filename) throws IOException
	{
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
	//	String path = System.getProperty("user.dir")+"\\screenshots\\"+filename+".png"; //for windows

		String path = "/home/techsevin/git/YarnBiz/screenshots/"+filename+".png";  //for linux
		
		File destination = new File(path);
	    
		FileHandler.copy(source, destination);
		
        return path;
        
	}
	
	
	}


