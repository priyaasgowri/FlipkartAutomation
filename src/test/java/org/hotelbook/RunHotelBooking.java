package org.hotelbook;

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

public class RunHotelBooking extends Baseclass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		browserLaunch("chrome");
		
		urlLaunch("https://adactinhotelapp.com/");
		
		implicitWait(10);
		
		LoginBook l=new LoginBook();
		sendKeys(l.getusername(), "priyagowri2024");
		sendKeys(l.getpassword(), "Gowripriya@2024");
		click(l.getLoginBtn());
		l.selectByvisibletext(l.getselectlocation(), "Sydney");
	    click(l.getselectlocation());
	    Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		l.selectByIndex(l.getselecthotel(), 1);
	    click(l.getselecthotel());
	    Thread.sleep(1000);
		Robot i=new Robot();
		i.keyPress(KeyEvent.VK_ENTER);
		i.keyRelease(KeyEvent.VK_ENTER);
		l.selectByIndex(l.getselectnoofrooms(), 1);
	    click(l.getselectnoofrooms());
	    Thread.sleep(1000);
		Robot u=new Robot();
		u.keyPress(KeyEvent.VK_ENTER);
		u.keyRelease(KeyEvent.VK_ENTER);
		sendKeys(l.getselectcheckindate(),"11/11/2024");
		sendKeys(l.getselectcheckoutdate(), "20/11/2024");
		l.selectByIndex(l.getadultno(), 2);
	    click(l.getadultno());
	    Thread.sleep(1000);
		Robot j=new Robot();
		j.keyPress(KeyEvent.VK_ENTER);
		j.keyRelease(KeyEvent.VK_ENTER);
		l.selectByIndex(l.getchildno(), 3);
	    click(l.getchildno());
	    Thread.sleep(1000);
		Robot k=new Robot();
		k.keyPress(KeyEvent.VK_ENTER);
		k.keyRelease(KeyEvent.VK_ENTER);
		click(l.getSubmitBtn());
		click(l.getselecthotelprice());
		click(l.getcontinueBtn());
		
		sendKeys(l.getfirstname(),"gowripriya");
		sendKeys(l.getlastname(),"marimuthu");
		sendKeys(l.getaddress(),"stnoe st,md");
		sendKeys(l.getcardnumber(),"1234567890987654");
	
		l.selectByIndex(l.getcardtype(), 2);
	    click(l.getcardtype());
	    Thread.sleep(1000);
		Robot q=new Robot();
		q.keyPress(KeyEvent.VK_ENTER);
		q.keyRelease(KeyEvent.VK_ENTER);
		
		l.selectByIndex(l.getexpmonth(), 2);
	    click(l.getexpmonth());
	    Thread.sleep(1000);
		Robot w=new Robot();
		w.keyPress(KeyEvent.VK_ENTER);
		w.keyRelease(KeyEvent.VK_ENTER);
		
		l.selectByIndex(l.getexpyear(), 3);
	    click(l.getexpmonth());
	    Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		
		sendKeys(l.getcvvnumber(),"345");
		
		click(l.getbookBtn());
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
