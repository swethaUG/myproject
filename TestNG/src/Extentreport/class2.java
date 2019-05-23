package Extentreport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class class2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("E:/book3.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet st=wb.getSheet("Student");
		
		int rs=st.getLastRowNum();
		//int cs=st.getRow(0).getLastCellNum();
		//System.out.println("Numbers of rows are:" +(rs+1));
	   // System.out.println("Numbers of columes are:" +cs);
		
		for(int i=0;i<=rs;i++)
		{
			XSSFRow r=st.getRow(i);
			int cs=r.getLastCellNum();
			//for(int j=0;j<cs;j++)
			//{
				//XSSFCell c=r.getCell(j);
				//String result=c.toString();
				//System.out.print(result);
				XSSFCell c=r.getCell(0);
				XSSFCell c1=r.getCell(1);
				String data=c.getStringCellValue();
				String data1=c1.getStringCellValue();
				System.out.print(data + ""+ data1);
				//System.out.println(data1 + "");*/
				
				
			//}
			System.out.println();
			
		}

	}

}
