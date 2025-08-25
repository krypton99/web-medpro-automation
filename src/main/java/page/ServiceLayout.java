package page;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

	@FindBy(how = How.XPATH, using = "//div[@class='styles_NewPackageMonth__opibT']/button")
	private WebElement mostLikeCSYTShowAllBtn;

	@FindBy(how = How.XPATH, using = "//div[@class='styles_NewDoctorTelemed__J0G0e']")
	private WebElement telemedSection;

	@FindBy(how = How.XPATH, using = "//div[@class='styles_NewBookingPackage__YfRIj']")
	private WebElement healthPackageSection;

	@FindBy(how = How.XPATH, using = "//div[@class='styles_CarouselBanner__FZzTn']")
	private WebElement homeMultiCarouselBannerSection;

	@FindBy(how = How.XPATH, using = "//div[@class='slick-arrow slick-next styles_btnNext__s56Fp']")
	private WebElement ftNextButton;

	@FindBy(how = How.XPATH, using = "//div[@class='slick-arrow slick-next styles_btnNext__O74q2']")
	private WebElement mostLikeHospitalNextButton;

	@FindBy(how = How.XPATH, using = "//div[@class='styles_CarouselBannerDesktop__04f02']//div[@class='slick-slide slick-active slick-current']")
	private WebElement activeCarouselBannerSelector;

	private String activeCarouselMultiBannerSelector = "//div[@class='styles_CarouselBannerDesktop__ijLFa']//div[contains(@class,'slick-active')][%d]";
	private String mostLikeHospitalCardSelector = "//div[@class='styles_DetailPackageMonth__ti8cF']//span[contains(text(),'%s')]/../../..";
	private String mostLikeHospitalCardButtonSelector = "//div[@class='styles_DetailPackageMonth__ti8cF']//span[contains(text(),'%s')]/../following-sibling::button";
	private String carouselBannerIndicatedBtnSelector = "//div[@class='styles_CarouselBannerDesktop__04f02']//ul[@class='slick-dots slick-dots-bottom']/li[%d]";
	private String carouselMultiBannerIndicatedBtnSelector = "//div[@class='styles_CarouselBannerDesktop__ijLFa']//ul[@class='slick-dots slick-dots-bottom']/li[%d]";
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

	public void clickOnCarouselBannerIndicatedButton(int index) {
		clickOnBy(By.xpath(String.format(carouselBannerIndicatedBtnSelector,index)));
	}
	public void clickOnCarouselBanner(int index) throws InterruptedException {
		Actions actions = new Actions(BaseTest.getDriver());
		WebElement indicatedButton = getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(carouselBannerIndicatedBtnSelector,index))));
		actions.moveToElement(indicatedButton).click(indicatedButton).perform();
		Thread.sleep(2000);
		actions.click(activeCarouselBannerSelector).perform();
//		actions.moveToElement(indicatedButton).click(indicatedButton).click(activeCarouselBannerSelector).perform();
	}

	public void clickOnMultiCarouselBanner(int slideNumber, int bannerNumber) throws InterruptedException {
		Actions actions = new Actions(BaseTest.getDriver());
		WebElement indicatedButton = getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(carouselMultiBannerIndicatedBtnSelector,slideNumber))));
		actions.click(indicatedButton).perform();
		Thread.sleep(2000);
		WebElement banner = getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(activeCarouselMultiBannerSelector, bannerNumber))));
		actions.click(banner).perform();
	}

	public void clickOnMostLikeHospitalCard(String hospitalName) {
		clickOnBy(By.xpath(String.format(mostLikeHospitalCardSelector,hospitalName)));
	}

	public void moveToMostLikeHospitalSection() {
		Actions actions = new Actions(BaseTest.getDriver());
		actions.moveToElement(mostLikeCSYTShowAllBtn).perform();
	}
	public void clickOnMostLikeHospitalNextBtn() {
		clickOn(mostLikeHospitalNextButton);
	}

	public void clickOnMostLikeHospitalBookingButton(String hospitalName) {
		clickOnBy(By.xpath(String.format(mostLikeHospitalCardButtonSelector, hospitalName)));
	}


	public boolean isMostLikeHospitalCardDisplayed(String hospitalName) {
		return isElementVisibilityBy(By.xpath(String.format(mostLikeHospitalCardSelector,hospitalName)));
	}
}
