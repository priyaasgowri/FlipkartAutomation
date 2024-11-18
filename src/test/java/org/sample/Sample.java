package org.sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.registerfacebook.RegisterFb;
import org.test.LoginPage;
import org.utility.Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends Baseclass {
	public static void main(String[] args) {
		browserLaunch("chrome");
		
		urlLaunch("https://www.facebook.com/");
		
		implicitWait(10);
		
//		//LoginPage l=new LoginPage();
//		sendKeys(l.getUsername(), "gowri");
//		sendKeys(l.getPassword(), "63547");
//		click(l.getLoginBtn());
		RegisterFb c=new RegisterFb();
		click(c.createBtn());
		//navigateback();
		
		
		
	
	
//		WebElement user=driver.findElement(By.id("email"));
//		user.sendKeys("gowri");
//		WebElement pass=driver.findElement(By.id("pass"));
//		pass.sendKeys("1234");
		//WebElement loginbtn=driver.findElement(By.name("login"));
		//loginbtn.click();
		
		
		
		
	}



}
