package com.program;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstclass {
	Logger logger;
	WebDriver driver;
	@Test
	public void demoTest() {
	//create Logger class
	logger= Logger.getLogger("Log4j1");
	PropertyConfigurator.configure("log4j.properties");
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	logger.info("Browser executable file running");
	driver=new ChromeDriver();
	logger.info("Browser launched");
	driver.get("https://opensource-demo.orangehrmlive.com/");
	logger.info("Application opened");
	driver.manage().window().maximize();
	}


}
