package stepdefinitions;

import org.testng.Assert;

import core.BaseTest;
import io.cucumber.java.en.Then;
import page.BookingAtHospitalPage;
import page.HomePage;

public class BookingAtHospitalStepDefinitions {
	
	private BookingAtHospitalPage bookingAtHospitalPage;
	
	public BookingAtHospitalStepDefinitions() {
		bookingAtHospitalPage = new BookingAtHospitalPage(BaseTest.getDriver(), BaseTest.getAction());
	}
	
	@Then("User should type {string} and filter {string} in search box")
	public void user_should_type_in_search_box(String searchKey, String filter) {
		bookingAtHospitalPage.search(searchKey, filter);
	}

	@Then("User should see result facility match the name {string}")
	public void user_should_see_result_facility_match_the_name(String searchKey) {
		Assert.assertTrue(bookingAtHospitalPage.isHealthFacilityDisplayed(searchKey), String.format("No result match the name %s", searchKey)); 
	}
	
	@Then("User should click on book now {string}")
	public void user_should_click_on_book_now(String string) {
	    bookingAtHospitalPage.clickOnBookNowBtn(string);
	}
}
