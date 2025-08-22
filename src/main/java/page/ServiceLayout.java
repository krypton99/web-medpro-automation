package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.BasePage;

public class ServiceLayout extends BasePage {

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

	@FindBy(how = How.XPATH, using = "//div[@class='styles_NewPackageMonth__opibT']")
	private WebElement mostLikeCSYTSection;

	@FindBy(how = How.XPATH, using = "//div[@class='styles_NewDoctorTelemed__J0G0e']")
	private WebElement telemedSection;

	@FindBy(how = How.XPATH, using = "//div[@class='styles_NewBookingPackage__YfRIj']")
	private WebElement healthPackageSection;

	@FindBy(how = How.XPATH, using = "//div[@class='styles_CarouselBanner__FZzTn']")
	private WebElement homeMultiCarouselBannerSection;

	@FindBy(how = How.XPATH, using = "//div[@class='slick-arrow slick-next styles_btnNext__s56Fp']")
	private WebElement ftNextButton;

	protected String ftSelector = "//div[@class='styles_serviceHeader__rJZ7Q']//h3[contains(text(),'%s')]";

	public void navigateToHomePage() {
		get(baseUrl);
	}
	public boolean isMostLikeCSYTDisplayed() {
		return isElementVisibility(mostLikeCSYTSection);
	}
	public boolean isTelemedSectionDisplay() {
		return isElementVisibility(telemedSection);
	}
	public boolean isHealthPackageSectionDisplayed() {
		return isElementVisibility(healthPackageSection);
	}
	public boolean isMultiCarouselBannerSectionDisplayed() {
		return isElementVisibility(homeMultiCarouselBannerSection);
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
	
	public void clickOnFtBookingAtHospital() {
		clickOn(ftBookingAtHospital);
	}
	public void clickOnFtNextButton() {
		clickOn(ftNextButton);
	}
}
