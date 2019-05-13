package com.Loginvalidation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class loginValidation extends baseclass {
	
	@Test
	public void logIn() throws IOException
	{
		FileInputStream pf = new FileInputStream("C:/Users/admin/Desktop/automate/myproject/input.properties");
		Properties prop = new Properties();
		prop.load(pf);
		FileInputStream fi = new FileInputStream("C:/Users/admin/Desktop/automate/myproject/Orangelogin data.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowcount = ws.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow r = ws.getRow(i);
			driver.findElement(By.(prop.get("username"))).sendKeys();
		}
	}

}
