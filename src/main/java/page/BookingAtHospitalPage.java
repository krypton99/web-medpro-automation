package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import core.BasePage;

public class BookingAtHospitalPage extends BasePage {
	
	// %s is a dynamic health facility name
	private String bookNowBtn = "//h3[contains(text(),'%s')]/following::span[contains(text(),'Đặt khám ngay')]";
	
	@FindBy(how = How.ID, using = "hospital")
	private WebElement search;
	
	@FindBy(how = How.CLASS_NAME, using = "ant-select-selection-search-input")
	private WebElement searchFilter;
	
	public BookingAtHospitalPage(WebDriver driver, Actions action) {
		super(driver, action);
	}
	
	public boolean isHealthFacilityDisplayed(String name) {
		return isElementVisibilityBy(By.xpath(String.format("//h3[contains(text(),'%s')]", name)));
	}
	
	public void clickOnBookNowBtn(String healthFacilityName) {
		clickOnBy(By.xpath(String.format(bookNowBtn, healthFacilityName)));
	}
	
	public void search(String searchKey, String filter) {
		if(searchKey != "") {
			enterText(search, searchKey);
		}
		if(filter != "") {
			action.click(searchFilter).perform();
			clickOn(driver.findElement(By.xpath(String.format("//div[@title='%s']", filter))));
		}
	}
	
}
