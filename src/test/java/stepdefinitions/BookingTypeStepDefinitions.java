package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Then;
import page.BookingAtHospitalPage;
import page.BookingTypePage;

public class BookingTypeStepDefinitions {

	private BookingTypePage bookingTypePage;
	
	public BookingTypeStepDefinitions() {
		bookingTypePage = new BookingTypePage(BaseTest.getDriver(), BaseTest.getAction());
	}
	@Then("User should choose booking type {string}")
	public void user_should_choose_booking_type(String string) {
		bookingTypePage.clickOnBookingType(string);
	}
}
