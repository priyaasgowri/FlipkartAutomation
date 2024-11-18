package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utility.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.utility.Baseclass;
import org.hotelbook.LoginBook;


		
public class ExcelRead extends Baseclass{
//	public static String excelRead(String filename,String sheetname,int row,int cell) throws FileNotFoundException {
//
//		File loc=new File(System.getProperty("user.dir")
//				+"\\src\\test\\resources\\Excel\\"+filename+".xlsx");
//		FileInputStream fs=new FileInputStream(loc);
//		Workbook w=new XSSFWorkbook(fs);
//		Sheet s=w.getsheet(sheetnamae);
//		Row r=s.getRow(row);
//		Cell c=r.getCell(cell);
//		 int type=c.getCellType();
//
//		 //type 1=string
//		 //type 0=number,date
//
//		 String value=null;
//
//		 if(type==1) {
//			 value=c.getStringCellValue();
//		 }
//		 else {
//			 if(DateUtil.isCellDateFormatted(c)) {
//				 Date date=c.getDateCellValue();
//				 SimpleDateFormat sf=new SimpleDateFormat("dd-mm-yyyy");
//				 value=sf.format(date);
//			 }
//			 else {
//				 double db=c.getNumericCellValue();
//				 long num=(long) db;
//				 value=String.valueOf(num);
//			 }
//		 }
//
//
//		return sheetname;
//	}

}
