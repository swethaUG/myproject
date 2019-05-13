package com.validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fff {

	public static void main(String[] args) {
		
			WebDriver driver= null;
			 String URl="https://www.facebook.com/";
			 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		     driver=new ChromeDriver();
		     driver.get(URl);
		     driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/form/table/tbody/tr/td[1]/input[1]")).sendKeys("swetha");
		    // driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div[2]/div/form/table/tbody/tr/td[1]/input[1]")).sendKeys("swetha");

		}

	}


