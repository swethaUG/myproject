package demopackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoClass {
	WebDriver driver;
	Logger logger;
	
	@Test
	public void demoTest()
	{
		logger = Logger.getLogger("DemoClass");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		logger.info("browser launched");
		driver.get("http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/login.php");
		logger.info("application opned");
		driver.manage().window().maximize();
		
	}

}
