package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClass1 extends Log {
	WebDriver driver;
	@Test
	public void myMethod()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	    driver = new ChromeDriver();
		logger.info("browser launched");
		driver.get("http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/login.php");
		logger.info("applicatio opened");
		
		
	}
	

}
