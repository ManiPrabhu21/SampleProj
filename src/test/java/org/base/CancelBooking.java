package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends BaseClas{
	public CancelBooking() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="order_id_text")
		private WebElement txtSearchOrderid;
		
		@FindBy(id="search_hotel_id")
		private WebElement btnSearchHotelId;
		
		
		@FindBy(xpath="(//input[@type=\"button\"])[1]")
		private WebElement btnCancel;

		public WebElement getTxtSearchOrderid() {
			return txtSearchOrderid;
		}

		public WebElement getBtnSearchHotelId() {
			return btnSearchHotelId;
		}

		public WebElement getBtnCancel() {
			return btnCancel;
		}
		
		public void cancelBooking(String orderid) {
			passtxt(txtSearchOrderid, orderid);
			click(getBtnSearchHotelId());
			click(getBtnCancel());
			driver.switchTo().alert().accept();
			
			
			
			

		}
		

	}


