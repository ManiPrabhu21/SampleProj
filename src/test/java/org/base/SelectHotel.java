package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClas{
	public SelectHotel() {
		
	PageFactory.initElements(driver, this);	
	
	}
	@FindBy(id="radiobutton_0")
	WebElement radioclick;
	
	@FindBy(id="continue")
	WebElement continueclick;

	public WebElement getRadioclick() {
		return radioclick;
	}

	public WebElement getContinueclick() {
		return continueclick;
	}
	public void selectHotel() {
		click(getRadioclick());
		click(getContinueclick());

	}
	
	
		
	
	
	
	
}
