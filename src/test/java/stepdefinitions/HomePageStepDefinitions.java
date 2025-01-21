package stepdefinitions;

import org.checkerframework.checker.units.qual.h;
import org.testng.Assert;

import core.BasePage;
import core.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomePageStepDefinitions {
	private HomePage homePage;

	public HomePageStepDefinitions() {
		homePage = new HomePage(BaseTest.getDriver(), BaseTest.getAction());
	}

	@Given("User open Medpro")
	public void user_open_medpro() {
		homePage.navigateToHomePage();
	}

	@Then("User should see booking by doctor feature")
	public void user_should_see_booking_by_doctor_feature() {
		Assert.assertTrue(homePage.isFtBookingByDoctorDisplayed());
	}

	@Then("User should click on call video with doctor")
	public void user_should_click_on_call_video_with_doctor() {
	    homePage.clickOnGoiVideoVoiBacSi();;
	}
}
