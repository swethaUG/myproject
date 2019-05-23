package com.OHRM.lib;
import org.openqa.selenium.chrome.ChromeDriver;



public class General extends Global{
	public void setUp()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver.get(URL);
		driver.manage().window().maximize();
	}
	public void tearDown()
	{
		//driver.quit();
	}
	
}

