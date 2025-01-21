package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.BasePage;

public class ServiceLayout extends BasePage{

	public ServiceLayout(WebDriver driver, Actions action) {
		super(driver, action);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Đặt khám theo bác sĩ')]/..")
	private WebElement ftBookingByDoctor;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Đặt khám tại cơ sở')]/..")
	private WebElement ftBookingAtHospital;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Tư vấn khám bệnh qua video')]/..")
	private WebElement ftTelemed;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Đặt lịch xét nghiệm')]/..")
	private WebElement ftTesting;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Gói khám sức khỏe')]/..")
	private WebElement ftMedicalScreening;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Đặt lịch tiêm chủng')]/..")
	private WebElement ftVaccine;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Y tế tại nhà')]/..")
	private WebElement ftMedicalAtHome;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Thanh toán Viện phí')]/..")
	private WebElement ftMedicalFeePay;

	public void navigateToHomePage() {
		driver.get(baseUrl);
	}
	
	public boolean isFtBookingByDoctorDisplayed() {
		return isElementVisibility(ftBookingByDoctor);
	}
	
	public boolean isFtBookingAtHospitalDisplayed() {
		return isElementVisibility(ftBookingAtHospital);
	}
	
	public boolean isFtTelemedDisplayed() {
		return isElementVisibility(ftTelemed);
	}
	
	public boolean isFtTestingDisplayed() {
		return isElementVisibility(ftTesting);
	}
	
	public boolean isFtMedicalScreeningDisplayed() {
		return isElementVisibility(ftMedicalScreening);
	}

	public boolean isFtVaccineDisplayed() {
		return isElementVisibility(ftVaccine);
	}
	
	public boolean isFtMedicalAtHomeDisplayed() {
		return isElementVisibility(ftMedicalAtHome);
	}
	
	public boolean isFtMedicalFeePayDisplayed() {
		return isElementVisibility(ftMedicalFeePay);
	}
}
