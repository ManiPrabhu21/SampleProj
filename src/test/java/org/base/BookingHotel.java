package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel extends BaseClas {
	public BookingHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="cc_num")
	WebElement ccnum;
	
	@FindBy(id="cc_type")
	WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	WebElement expyear;
	
	@FindBy(id="cc_cvv")
	WebElement  cvv;
	
	@FindBy(id="book_now")
	WebElement  booknow;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	} 
	
	public void bookingHotel(String FirstName,String LastName,String BillingAddress,String CreditCardNo,String CreditCardType,String ExpiryMonth,String ExpiryYear,String CVVNumber) {
		passtxt(getFirstname(), FirstName);
		passtxt(getLastname(), LastName);
		passtxt(getAddress(), BillingAddress);
		passtxt(getCcnum(),CreditCardNo);
		SelectBy(getCctype(), "text", CreditCardType);
		SelectBy(getExpmonth(), "text", ExpiryMonth);
		SelectBy(getExpyear(), "text", ExpiryYear);
		passtxt(getCvv(), CVVNumber);
		click(getBooknow());
	}
	

	
	
	
	
	
	
	
	
	

}
