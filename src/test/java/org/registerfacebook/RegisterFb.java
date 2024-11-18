package org.registerfacebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class RegisterFb extends Baseclass {
	
	public RegisterFb() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="Create new account")
	private WebElement createBtn;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(linkText="Female")
	private WebElement female;
	
	@FindBy(name="reg_email__")
	private WebElement giveemail;
	
	@FindBy(name="reg_passwd__")
	private WebElement createpass;
	
	@FindBy(name="websubmit")
	private WebElement websubmit;
	
	public WebElement createBtn() {
		// TODO Auto-generated method stub
		return createBtn;
	}
	
	
	
	
	
	
	

}
