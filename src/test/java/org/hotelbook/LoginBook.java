package org.hotelbook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class LoginBook extends Baseclass{
	public LoginBook()
	 {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn;

	public WebElement getusername() {
		// TODO Auto-generated method stub
		return username;
	}

	public WebElement getpassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public WebElement getLoginBtn() {
		// TODO Auto-generated method stub
		return loginBtn;
	}
	
	@FindBy(id="location")
	private WebElement selectlocation;
	
	
	@FindBy(id="hotels")
	private WebElement selecthotel;
	
	@FindBy(id="room_type")
	private WebElement selectroomtype;
	
	@FindBy(id="room_nos")
	private WebElement selectnoofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement selectcheckindate;
	
	@FindBy(id="datepick_out")
	private WebElement selectcheckoutdate;
	
	@FindBy(name="adult_room")
	private WebElement adultno;
	
	@FindBy(name="child_room")
	private WebElement childno;
	
	@FindBy(id="Submit")
	private WebElement SubmitBtn;
	
	
	public WebElement getselectlocation() {
		// TODO Auto-generated method stub
		return selectlocation;
	}

	public WebElement getselecthotel() {
		// TODO Auto-generated method stub
		return selecthotel;
	}

	public WebElement getselectroomtype() {
		// TODO Auto-generated method stub
		return selectroomtype;
	}
	
	public WebElement getselectnoofrooms() {
		// TODO Auto-generated method stub
		return selectnoofrooms;
	}
	
	public WebElement getselectcheckindate() {
		// TODO Auto-generated method stub
		return selectcheckindate;
	}
	
	public WebElement getselectcheckoutdate() {
		// TODO Auto-generated method stub
		return selectcheckoutdate;
	}
	
	public WebElement getadultno() {
		// TODO Auto-generated method stub
		return adultno;
	}
	
	public WebElement getchildno() {
		// TODO Auto-generated method stub
		return childno;
	}
	
	public WebElement getSubmitBtn() {
		// TODO Auto-generated method stub
		return SubmitBtn;
	}
	
	@FindBy(id="radiobutton_1")
	private WebElement selecthotelprice;
	
	public WebElement getselecthotelprice() {
		// TODO Auto-generated method stub
		return selecthotelprice;
	}
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	public WebElement getcontinueBtn() {
		// TODO Auto-generated method stub
		return continueBtn;
	}
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement cardnumber;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
    @FindBy(id="cc_exp_month")
	private WebElement expmonth;
    
    @FindBy(id="cc_exp_year")
   	private WebElement expyear;
    
    @FindBy(id="cc_cvv")
   	private WebElement cvvnumber;
    
    @FindBy(id="book_now")
   	private WebElement bookBtn;
    
    
    public WebElement getfirstname() {
		// TODO Auto-generated method stub
		return firstname;
	}
    
    public WebElement getlastname() {
		// TODO Auto-generated method stub
		return lastname;
	}
    
    public WebElement getaddress() {
		// TODO Auto-generated method stub
		return address;
	}
    
    public WebElement getcardnumber() {
		// TODO Auto-generated method stub
		return cardnumber;
	}
    
    public WebElement getcardtype() {
		// TODO Auto-generated method stub
		return cardtype;
	}
    
    public WebElement getexpmonth() {
		// TODO Auto-generated method stub
		return expmonth;
	}
    
    public WebElement getexpyear() {
		// TODO Auto-generated method stub
		return expyear;
	}
    
    public WebElement getcvvnumber() {
		// TODO Auto-generated method stub
		return cvvnumber;
	}
    
    public WebElement getbookBtn() {
		// TODO Auto-generated method stub
		return bookBtn;
	}
    
  
	
	
	
	
	
	
	
		
		
		
	}
	
	
	
	
	



