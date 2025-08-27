package page;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.HashMap;

import core.BaseTest;
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

public class HomePage extends ServiceLayout {

	public HomePage(WebDriver driver, Actions action) {
		super(driver, action);

	}
	private String associatedHospitalLogoSelector = "//div[@class='styles_Cooperated__vJ51D']//span[contains(text(),'%s')]/../../..";
	private String specialitySelector = "//div[@class='styles_MPSpecialistCard__wEym9']//div[contains(text(),'%s')]/..";
	@FindBy(how = How.XPATH, using = "//div[@class='ant-modal-content']")
	private WebElement homeBanner;
	@FindBy(how = How.XPATH, using = "//button[@class='ant-btn ant-btn-default styles_btnAntd__zap7d styles_btnClose__aaIs_']")
	private WebElement closeBannerBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_Cooperated__vJ51D']")
	private WebElement cooperateSection;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_cashBackWrapper__N4I_O']")
	private WebElement scrollBand;
	@FindBy(how = How.XPATH, using = "//input[@class='ant-input']")
	private WebElement universalSearchInput;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_CarouselBannerDesktop__04f02']")
	private WebElement homeCarouselBanner;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_MPSpecialistCard__wEym9']")
	private WebElement homeSpecialitySection;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_homeDownload__A3sQl']")
	private WebElement homeDownloadAppSection;
	@FindBy(how = How.XPATH, using = "(//div[@class='index_Rectangle3462__lLZRw'])[2]")
	private WebElement homeMultiCarouselBannerRectangle;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_groupButtonDownload__9c7DZ']//img[@alt='Tải ứng dụng App Store']/../../..")
	private WebElement downloadAppIOS;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_groupButtonDownload__9c7DZ']//img[@alt='Tải ứng dụng Google Play']/../../..")
	private WebElement downloadAppAndroid;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_serviceItem__rXAzb styles_right__2xFMu']")
	private WebElement downloadAppElement;

	@FindBy(how = How.XPATH, using = "//div[@class='styles_NewPackageMonth__y1ZOk']")
	private WebElement homeReviewSection;
	@FindBy(how = How.XPATH, using = "//div[@class='slick-arrow slick-next styles_btnNext__JVlZ3']")
	private WebElement associatedHospitalNextButton;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_achievement__2LmHN']")
	private WebElement homeSocialReviewSection;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_statistic__0XdP7']")
	private WebElement homeStatisticSection;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_MPSpecialistCard__wEym9']/button")
	private WebElement specialityShowAllBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_news__3c5mf']")
	private WebElement homeMedicalNewsSection;
	@FindBy(how = How.XPATH, using = "//div[@class='styles_supportMethod__CHIzY']")
	private WebElement homeSupportSection;
	public Boolean isHomeBannerDisplayed() {
		return isElementVisibility(homeBanner);
	}
	public Boolean isCooperateSectionDisplayed() {
		return isElementVisibility(cooperateSection);
	}
	public Boolean isScrollBandDisplayed() {
		return isElementVisibility(scrollBand);
	}
	public Boolean isUniversalSearchInputDisplayed() {
		return isElementVisibility(universalSearchInput);
	}
	public Boolean isCarouselBannerDisplayed() {
		return isElementVisibility(homeCarouselBanner);
	}
	public Boolean isSpecialitySectionDisplayed() {
		return isElementVisibility(homeSpecialitySection);
	}
	public Boolean isDownloadAppSectionDisplayed() {
		return isElementVisibility(homeDownloadAppSection);
	}
	public Boolean isReviewSectionDisplayed() {
		return isElementVisibility(homeReviewSection);
	}
	public Boolean isSocialReviewSectionDisplayed() {
		return isElementVisibility(homeSocialReviewSection);
	}
	public Boolean isStatisticSectionDisplayed() {
		return isElementVisibility(homeStatisticSection);
	}
	public Boolean isMedicalNewsSectionDisplayed() {
		return isElementVisibility(homeMedicalNewsSection);
	}
	public Boolean isSupportSectionDisplayed() {
		return isElementVisibility(homeSupportSection);
	}
	public void clickOnCloseBannerBtn() {
		clickOn(closeBannerBtn);
	}
	public void clickOnAssociatedHospital(String hospitalName) {
		clickOnBy(By.xpath(String.format(associatedHospitalLogoSelector, hospitalName)));
	}
	public void clickOnFeatureByName(String ftName) {
		clickOnBy(By.xpath(String.format(ftSelector, ftName)));
	}
	public void clickOnSpeciality(String speciality) {
		clickOnBy(By.xpath(String.format(specialitySelector, speciality)));
	}
	public boolean isFeatureVisibilityByName(String ftName) {
		return isElementVisibilityBy(By.xpath(String.format(ftSelector, ftName)), 2);
	}
	public boolean isAssociatedHospitalLogoVisibilityByName(String hospitalName) {
		return isElementVisibilityBy(By.xpath(String.format(associatedHospitalLogoSelector, hospitalName)), 2);
	}

	public void clickOnAssociatedHospitalNextButton() {
		Actions action = new Actions(BaseTest.getDriver());
		action.moveToElement(homeCarouselBanner).click(associatedHospitalNextButton).perform();
	}
	public void clickOnDownloadAppIOS() {
		clickOn(downloadAppIOS);
	}
	public void clickOnDownloadAppAndroid() {
		clickOn(downloadAppAndroid);
	}
	public void moveToSpecialitySection() {
		Actions actions = new Actions(BaseTest.getDriver());
		actions.moveToElement(specialityShowAllBtn).perform();
	}
	public void moveToDownloadAppSection() {
		Actions actions = new Actions(BaseTest.getDriver());
		actions.moveToElement(downloadAppElement).perform();
	}
	public void moveToCarouselMultiBannerSection() {
		Actions actions = new Actions(BaseTest.getDriver());
		actions.moveToElement(homeMultiCarouselBannerRectangle).perform();
	}
}
