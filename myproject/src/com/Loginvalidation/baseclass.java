package com.Loginvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseclass {
	ChromeDriver driver = null;
	String url = "http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/login.php";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver= new ChromeDriver();
	    driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
