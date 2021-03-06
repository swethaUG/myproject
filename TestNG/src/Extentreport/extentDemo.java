package Extentreport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentDemo {
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	@BeforeClass
	public void setExtent()
	{
		// To specify the location to store result
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		// Title of the report
		htmlReporter.config().setDocumentTitle("Automation Report");
		// Name of the report
		htmlReporter.config().setReportName("Functional Report");
		// To Specify Theme like STANDARD/DARK
		htmlReporter.config().setTheme(Theme.DARK); 
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Tester Name", "Madhukar");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test
	public void titleTest() throws IOException {
		test=extent.createTest("OrangeHRM_TitleTest");
		String pgTitle=driver.getTitle();
		Assert.assertEquals("OrangeHRM", pgTitle);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:/Users/admin/Desktop/automate/TestNG/test-output/screenshot.png"));
		test.addScreenCaptureFromPath("C:/Users/admin/Desktop/automate/TestNG/test-output/screenshot.png");// adding screen shot
	}
	
	@AfterClass
	public void endReport()
	{
		extent.flush();
	}
	
	}


