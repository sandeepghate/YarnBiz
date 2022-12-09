package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {

static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		
		String path = System.getProperty("user.dir")+"//reports//yarnbizreport.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setTheme(Theme.STANDARD);
		
		reporter.config().setReportName("YarnBiz Report");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "YarnBiz");
		
		extent.setSystemInfo("Environment", "STAGE");
		
		extent.setSystemInfo("Executed by", "Sandeep Ghate");
		
		return extent;
	}
}
