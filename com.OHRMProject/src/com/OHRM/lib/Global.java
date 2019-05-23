package com.OHRM.lib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	public String URL="http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/login.php";
	public FileInputStream propfile;
	public String propURL="C:/Users/admin/Desktop/automate/com.OHRMProject/src/com/utility/Properties.java";
	public String expected_verifyLogintest="WelcomeLogin";
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook wb;
	public XSSFSheet ws;
	public XSSFRow row;
	public XSSFCell cell;
	public String xlfile="C:/Users/admin/Desktop/automate/com.OHRMProject/ReadData/OHRMLogindata.xlsx";
	public String xlsheet="Sheet1";

}
