package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class LoginPage extends Baseclass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginBtn;

	public WebElement getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public WebElement getLoginBtn() {
		// TODO Auto-generated method stub
		return loginBtn;
	}
}

//without pageFactory
//public WebElement username() {
//	
//	WebElement user=driver.findElement(By.id("email"));
//	return user;
//}


	
	
	
	



