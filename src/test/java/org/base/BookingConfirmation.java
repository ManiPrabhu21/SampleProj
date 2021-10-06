package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClas {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	WebElement orderno;
	
	@FindBy(id="my_itinerary")
	WebElement myitinerary;

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}
	
	public String bookingConfirmation() {
	implicityWait();
		String orderid = attribute(orderno, "value");
		click(getMyitinerary());
		return orderid;
	}

}
