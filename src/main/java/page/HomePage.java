package page;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import core.BasePage;
import core.Label;
import core.Constants;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Đặt khám theo bác sĩ')]")
	private WebElement bookingByDoctor;

	public void navigateToHomePage() {
		driver.navigate().to(baseUrl);
	}
	
	public boolean isBookingByDoctorDisplayed() {
		return isElementVisibility(bookingByDoctor);
	}

	

}
