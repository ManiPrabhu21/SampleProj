package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClas {
	
	public SearchHotel() {
	
	PageFactory.initElements(driver, this);

	}
	@FindBy(id="location")
	WebElement tdnlocation;
	
	@FindBy(id="hotels")
	WebElement tdnhotels;
	
	@FindBy(id="room_type")
	WebElement tdnroomtype;
	
	@FindBy(id="room_nos")
	WebElement tdnroomnos;
	
	@FindBy(id="datepick_in")
	WebElement tdndatepickin;
	
	@FindBy(id="datepick_out")
	WebElement tdndatepickout;
	
	@FindBy(id="adult_room")
	WebElement tdnadultroom;
	
	@FindBy(id="child_room")
	WebElement tdnchildroom;
	
	@FindBy(id="Submit")
	WebElement btnclick;

	public WebElement getTdnlocation() {
		return tdnlocation;
	}

	public WebElement getTdnhotels() {
		return tdnhotels;
	}

	public WebElement getTdnroomtype() {
		return tdnroomtype;
	}

	public WebElement getTdnroomnos() {
		return tdnroomnos;
	}

	public WebElement getTdndatepickin() {
		return tdndatepickin;
	}

	public WebElement getTdndatepickout() {
		return tdndatepickout;
	}

	public WebElement getTdnadultroom() {
		return tdnadultroom;
	}

	public WebElement getTdnchildroom() {
		return tdnchildroom;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}
	
	public void searchHotel(String Location ,String Hotels,String RoomType,String NumberofRooms,String CheckInDate,String CheckOutDate,String AdultsperRoom,String ChildrenperRoom) {
		SelectBy(getTdnlocation(), "text", Location);
		SelectBy(getTdnhotels(), "text", Hotels);
		SelectBy(getTdnroomtype(), "text", RoomType);
		SelectBy(getTdnroomnos(), "text", NumberofRooms);
		passtxt(getTdndatepickin(), CheckInDate);
		passtxt(getTdndatepickout(), CheckOutDate);
		SelectBy(getTdnadultroom(), "text", AdultsperRoom);
		SelectBy(getTdnchildroom(), "text", ChildrenperRoom);
		click(getBtnclick());
		
		
	}
	
	
}
	
	
	
