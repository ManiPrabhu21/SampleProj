package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClas;
import org.base.BookingConfirmation;
import org.base.BookingHotel;
import org.base.CancelBooking;
import org.base.CancelVerification;
import org.base.Login;
import org.base.SearchHotel;
import org.base.SelectHotel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends BaseClas {
	@Given("User are on the Adactin Login page")
	public void user_are_on_the_Adactin_Login_page() {
		browserConfiguration("chrome");
		
		launchUrl("https://adactinhotelapp.com/");
	}

	@When("User should enter {string},{string}")
	public void user_should_enter(String Username, String Password) {
		Login login = new Login();
		login.login(Username, Password);
	}

	@When("User should search hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_search_hotel(String Location, String Hotels, String RoomType, String NumberofRooms,
			String CheckInDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {

		SearchHotel search = new SearchHotel();
		search.searchHotel(Location, Hotels, RoomType, NumberofRooms, CheckInDate, CheckOutDate, AdultsperRoom,
				ChildrenperRoom);

	}

	@When("User should select the hotel")
	public void user_should_select_the_hotel() {

		SelectHotel select = new SelectHotel();
		select.selectHotel();

	}

	@When("User should book the hotel {string},{string},{string}")
	public void user_should_book_the_hotel(String FirstName, String LastName, String BillingAddress,
			io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> maps = dataTable.asMaps();
		Map<String, String> map = maps.get(1);
		String CreditCardNo = map.get("CreditCardNo");
		String CreditCardType = map.get("CreditCardType");
		String ExpiryMonth = map.get("ExpiryMonth");
		String ExpiryYear = map.get("ExpiryYear");
		String CVVNumber = map.get("CVVNumber");

		BookingHotel book = new BookingHotel();
		book.bookingHotel(FirstName, LastName, BillingAddress, CreditCardNo, CreditCardType, ExpiryMonth, ExpiryYear,
				CVVNumber);

	}

	@Then("User should verify {string} message")
	public void user_should_verify_message(String string) {
		
		
		BookingConfirmation bookconfrm = new BookingConfirmation();
		String confirm = bookconfrm.bookingConfirmation();
		
		CancelBooking cancelbook = new CancelBooking();
		cancelbook.cancelBooking(confirm);
		
		CancelVerification cancelVerification=new CancelVerification();
		String msg = cancelVerification.canceVerification();
		
		
		Assert.assertEquals(msg, string);
		
		driver.quit();
		
		
	}

}