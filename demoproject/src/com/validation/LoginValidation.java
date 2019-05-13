package com.validation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginValidation extends OrangeLogin{
	@Test
	public void logIn() throws IOException, InterruptedException
	{
		FileInputStream pf = new FileInputStream("C:/Users/admin/Desktop/automate/myproject/input.properties");
		Properties pr = new Properties();
		pr.load(pf);
		FileInputStream fi = new FileInputStream("C:/Users/admin/Desktop/automate/myproject/Orangelogin data.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowcount = ws.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow r = ws.getRow(i);
			driver.findElement(By.name(pr.getProperty("username"))).clear();
			driver.findElement(By.name(pr.getProperty("username"))).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("password"))).clear();
			driver.findElement(By.name(pr.getProperty("password"))).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("submit"))).click();
			driver.navigate().back();
			
		}
	}
}
