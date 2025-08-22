package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.BasePage;

public class BookingTypePage extends BasePage{
	
	public BookingTypePage(WebDriver driver, Actions action) {
		super(driver, action);
	}
	
	private String typeCard = "//div[contains(text(),'%s')]";
	
	public void clickOnBookingType(String bookingTypeName) {
		clickOnBy(By.xpath(String.format(typeCard, bookingTypeName)));
	}
}
