package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;

public class demodata {
	{
		propfile = new FileInputStream(propURL);
		Properties prop = new Properties();
		prop.load(propfile);
		String actual_verifyLoginTest = driver.findElement(By.xpath(prop.getProperty("loginverify"))).getText();
		Assert.assertEquals(actual_verifyLoginTest,expected_verifyLogintest);
		System.out.println("Sucessfully logged into OHRM page");
		
		
	}
	public void Login() throws IOException
	{
		propfile = new FileInputStream(propURL);
		Properties prop = new Properties();
		prop.load(propfile);
		try
		{
			fi = new FileInputStream(xlfile);
			wb= new XSSFWorkbook(fi);
			ws= wb.getSheet(xlsheet);
			int rowcount = ws.getLastRowNum();
			for(int i=0;i<=rowcount;i++)
				{
					row = ws.getRow(i);
					int cellcount = row.getLastCellNum();
					for(int j=0;j<cellcount;j++)
					{
					cell = row.getCell(i);
					try
					{
						DataFormatter formatter = new DataFormatter();
						formatter.formatCellValue(cell);
						driver.findElement(By.name(prop.getProperty("username"))).clear();
						driver.findElement(By.name(prop.getProperty("username"))).sendKeys(row.getCell(j).getStringCellValue());
						driver.findElement(By.name(prop.getProperty("password"))).clear();
						driver.findElement(By.name(prop.getProperty("password"))).sendKeys(row.getCell(j).getStringCellValue());
						driver.findElement(By.name(prop.getProperty("login"))).click();
					}
					catch(Exception e)
					{
						System.out.println("null value");
					}
					}
				}
			}
			catch(Exception e)
			{
				throw(e);
			}
			
		
		

}
