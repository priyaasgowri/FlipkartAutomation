package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.httpclient.util.DateUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static void browserLaunch(String browsername) {
		if(browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
			else if(browsername.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(browsername.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
	}
			public static void urlLaunch(String url) {
				driver.get(url);
				driver.manage().window().maximize();
			}
			public static void implicitWait(long secs) {
				driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
			}
			public static void sendKeys(WebElement e,String value) {
				e.sendKeys(value);
			}
			public static void click(WebElement e) {
				e.click();
			}
			public static String getText(WebElement e) {
				String text=e.getText();
				return text;
			}
			public static void moveToElement(WebElement e) {
				Actions a=new Actions(driver);
				a.moveToElement(e).perform();
			}
			//downarrow
			public static void downArrow() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
			//selectbyindex
			public static void selectByIndex(WebElement e,int index) {
				Select s=new Select(e);
				s.selectByIndex(index);
			}//selectbyvisibletext
			public static void selectByvisibletext(WebElement e,String text) {
				Select s=new Select(e);
				s.selectByVisibleText(text);
			}
			public static void navigate(String url) {
			 driver.navigate().to(url);
			}
			//navigateback
			public static void navigateback() {
				driver.navigate().back();
			}
			public static void framesIndex(int index) {
				driver.switchTo().frame(index);
			}
		
			
			//getattribute
			public static String getAttribute(WebElement e) {
				String attribute=e.getAttribute(null);
						return null;
			}
			//close
			public static void closequit() {
			driver.quit();
			driver.close();
			}
			
			//isEnabled
			public static  boolean isEnabled(WebElement e) {
				boolean enablestatus=e.isEnabled();
				return enablestatus;
			}
			public static void contextClick(WebElement e)  {
				Actions a=new Actions(driver);
				a.contextClick().perform();
				
				}
			public static void  doubleClick(WebElement e) {
				Actions a=new Actions(driver);
				a.doubleClick().perform();
				
			}
			public static void alertaccept(WebElement e) {
				Alert s= driver.switchTo().alert();
				s.accept();
			}
			public static void alertdismiss(WebElement e) {
				Alert s= driver.switchTo().alert();
				s.dismiss();
			}
			public static void promptalert(WebElement e,String value) {
				Alert s= driver.switchTo().alert();
				s.sendKeys(value);
				s.accept();
			}
			public static WebDriver LaunchBrowser(String browsername) {
				switch(browsername) {
				case "chrome":
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					break;
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
					break;
				case "edge":
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
					break;
					
				}
				
				return driver;
				
			}
			
			public static  void screenShot(String filename) throws IOException {
				TakesScreenshot tk=(TakesScreenshot)driver;
				File src=tk.getScreenshotAs(OutputType.FILE);
				File des=new File(System.getProperty("user.dir")
						+"\\src\\test\\resources\\Screenshot\\"+filename+"_"+System.currentTimeMillis()+".png");
				FileUtils.copyFile(src,des);
			}
			public static void jsSendkeys(WebElement e,String value) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].setAttribute('value','"+value+"')",e);
					
				
			}
			
//			public static String excelRead(String filename,String sheetname,int row,int cell) throws FileNotFoundException {
//
//				File loc=new File(System.getProperty("user.dir")
//						+"\\src\\test\\resources\\Excel\\"+filename+".xlsx");
//				FileInputStream fs=new FileInputStream(loc);
//				Workbook w=new XSSFWorkbook(fs);
//				Sheet s=w.getsheet(sheetnamae);
//				Row r=s.getRow(row);
//				Cell c=r.getCell(cell);
//				 int type=c.getCellType();
//
//				 //type 1=string
//				 //type 0=number,date
//
//				 String value=null;
//
//				 if(type==1) {
//					 value=c.getStringCellValue();
//				 }
//				 else {
//					 if(DateUtil.isCellDateFormatted(c)) {
//						 Date date=c.getDateCellValue();
//						 SimpleDateFormat sf=new SimpleDateFormat("dd-mm-yyyy");
//						 value=sf.format(date);
//					 }
//					 else {
//						 double db=c.getNumericCellValue();
//						 long num=(long) db;
//						 value=String.valueOf(num);
//					 }
//				 }
//
//
//				return sheetname;
//			}
//
				
				
			
				
				
				
				
			
			}
	
			
			
			
	
			
			
			
			
			


	
		

