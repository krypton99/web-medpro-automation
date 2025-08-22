package stepdefinitions;

import io.cucumber.java.en.And;
import org.checkerframework.checker.units.qual.h;
import org.testng.Assert;

import core.BasePage;
import core.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

import javax.swing.*;
import java.util.HashMap;
import java.util.Set;

public class HomePageStepDefinitions {
	private HomePage homePage;
	private static String originalWindow;


	public HomePageStepDefinitions() {
		homePage = new HomePage(BaseTest.getDriver(), BaseTest.getAction());

	}

	@Given("User open Medpro")
	public void user_open_medpro() {
//		homePage.navigateToHomePage();
	}

	@Then("User should see booking by doctor feature")
	public void user_should_see_booking_by_doctor_feature() {
		Assert.assertTrue(homePage.isFtBookingByDoctorDisplayed());
	}

	@Then("User should click on call video with doctor")
	public void user_should_click_on_call_video_with_doctor() {
	    homePage.clickOnGoiVideoVoiBacSi();;
	}

	@Then("User should choose {string} medical feature")
	public void user_should_choose_medical_feature(String string) {
	    homePage.clickOnFtBookingAtHospital();
	}

	@Then("User should see medpro logo")
	public void userShouldSeeMedproLogo() {
		Assert.assertTrue(homePage.isLogoVisibility(),"Không tìm thấy logo Medpro");
	}

	@And("User should see tiktok logo")
	public void userShouldSeeTiktokLogo() {
		Assert.assertTrue(homePage.isTiktokLogoVisibility(),"Không tìm thấy logo Tiktok");
	}

	@And("User should see facebook logo")
	public void userShouldSeeFacebookLogo() {
		Assert.assertTrue(homePage.isFacebookLogoVisibility(),"Không tìm thấy logo Facebook");
	}

	@And("User should see download app button")
	public void userShouldSeeDownloadAppButton() {
		Assert.assertTrue(homePage.isDownloadAppButtonVisibility(),"Không tìm thấy nút tải app Medpro");
	}

	@And("User should see zalo logo")
	public void userShouldSeeZaloLogo() {
		Assert.assertTrue(homePage.isZaloLogoVisibility(),"Không tìm thấy logo Zalo");
	}

	@And("User should see youtube logo")
	public void userShouldSeeYoutubeLogo() {
		Assert.assertTrue(homePage.isYoutubeLogoVisibility(),"Không tìm thấy logo Youtube");
	}

	@And("User should see notification button")
	public void userShouldSeeNotificationButton() {
		Assert.assertTrue(homePage.isNotificationButtonVisibility(),"Không tìm thấy button Thông báo");
	}

	@And("User should see account menu")
	public void userShouldSeeAccountMenu() {
		Assert.assertTrue(homePage.isAccountMenuVisibility(),"Không tìm thấy menu tài khoản");
	}

	@And("User should see choose language button")
	public void userShouldSeeChooseLanguageButton() {
		Assert.assertTrue(homePage.isLanguageVisibility(),"Không tìm thấy button Ngôn ngữ");
	}

	@And("User should see health facility menu")
	public void userShouldSeeHealthFacilityMenu() {
		Assert.assertTrue(homePage.isHealthFacilityVisibility(),"Không tìm thấy menu Cơ sở y tế");
	}

	@And("User should see health service menu")
	public void userShouldSeeHealthServiceMenu() {
		Assert.assertTrue(homePage.isHealthServiceVisibility(),"Không tìm thấy menu Dịch vụ y tế");
	}

	@And("User should see corporate health check menu")
	public void userShouldSeeCorporateHealthCheckMenu() {
		Assert.assertTrue(homePage.isCorporateHealthCheckVisibility(),"Không tìm thấy menu Khám sức khỏe doanh nghiệp");
	}

	@And("User should see health news menu")
	public void userShouldSeeHealthNewsMenu() {
		Assert.assertTrue(homePage.isHealthNewsVisibility(),"Không tìm thấy menu Tin tức");
	}

	@And("User should see helps menu")
	public void userShouldSeeHelpsMenu() {
		Assert.assertTrue(homePage.isHelpsMenuVisibility(),"Không tìm thấy menu Hướng dẫn");
	}

	@And("User should see contact for cooperation menu")
	public void userShouldSeeContactForCooperationMenu() {
		Assert.assertTrue(homePage.isContactForCooperateMenuVisibility(),"Không tìm thấy menu Liên hệ hợp tác");
	}

	@Then("User should see homepage banner")
	public void userShouldSeeHomepageBanner() {
		Assert.assertTrue(homePage.isHomeBannerDisplayed(), "Không tìm thấy banner homepage");
	}

	@And("User should close homepage banner")
	public void userShouldCloseHomepageBanner() {
		homePage.clickOnCloseBannerBtn();
	}

	@And("User should see homepage scroll band")
	public void userShouldSeeHomepageScrollBand() {
		Assert.assertTrue(homePage.isScrollBandDisplayed(), "Không tìm thấy banner cuộn");
	}

	@And("User should see universal search input")
	public void userShouldSeeUniversalSearchInput() {
		Assert.assertTrue(homePage.isUniversalSearchInputDisplayed(), "Không tìm thấy thanh universal search");
	}

	@And("User should see cooperated section")
	public void userShouldSeeCooperatedSection() {
		Assert.assertTrue(homePage.isCooperateSectionDisplayed(), "Không tìm thấy section Được tin tưởng hợp tác và đồng hành");
	}

	@And("User should see carousel banner section")
	public void userShouldSeeCarouselBannerSection() {
		Assert.assertTrue(homePage.isCarouselBannerDisplayed(), "Không tìm thấy section carousel banner đơn");
	}

	@And("User should see most like health facility section")
	public void userShouldSeeMostLikeHealthFacilitySection() {
		Assert.assertTrue(homePage.isMostLikeCSYTDisplayed(), "Không tìm thấy section Cơ sở y tế đặt khám được yêu thích");
	}

	@And("User should see telemed section")
	public void userShouldSeeTelemedSection() {
		Assert.assertTrue(homePage.isTelemedSectionDisplay(), "Không tìm thấy section Bác sĩ tư vấn khám bệnh qua video");
	}

	@And("User should see health package section")
	public void userShouldSeeHealthPackageSection() {
		Assert.assertTrue(homePage.isHealthPackageSectionDisplayed(), "Không tìm thấy section Chăm sóc sức khỏe toàn diện");
	}

	@And("User should see speciality section")
	public void userShouldSeeSpecialitySection() {
		Assert.assertTrue(homePage.isSpecialitySectionDisplayed(), "Không tìm thấy section Chuyên khoa");
	}

	@And("User should see download app section")
	public void userShouldSeeDownloadAppSection() {
		Assert.assertTrue(homePage.isDownloadAppSectionDisplayed(), "Không tìm thấy section Tải app");
	}

	@And("User should see review section")
	public void userShouldSeeReviewSection() {
		Assert.assertTrue(homePage.isReviewSectionDisplayed(), "Không tìm thấy section Cảm nhận từ khách hàng");
	}

	@And("User should see social media section")
	public void userShouldSeeSocialMediaSection() {
		Assert.assertTrue(homePage.isSocialReviewSectionDisplayed(), "Không tìm thấy section Truyền thông nói gì về Medpro");
	}

	@And("User should see statistic section")
	public void userShouldSeeStatisticSection() {
		Assert.assertTrue(homePage.isStatisticSectionDisplayed(), "Không tìm thấy section Thống kê");
	}

	@And("User should see medical news section")
	public void userShouldSeeMedicalNewsSection() {
		Assert.assertTrue(homePage.isMedicalNewsSectionDisplayed(), "Không tìm thấy section Tin tức y tế");
	}

	@And("User should see support section")
	public void userShouldSeeSupportSection() {
		Assert.assertTrue(homePage.isSupportSectionDisplayed(), "Không tìm thấy section Các hình thức hỗ trợ");
	}

	@And("User should see multi carousel banner section")
	public void userShouldSeeMultiCarouselBannerSection() {
		Assert.assertTrue(homePage.isMultiCarouselBannerSectionDisplayed(), "Không tìm thấy section carousel multi banner");
	}

	@And("User should click on feature {string}")
	public void userShouldClickOnFeature(String feature) throws InterruptedException {
		originalWindow = BaseTest.getDriver().getWindowHandle();
		while (!homePage.isFeatureVisibilityByName(feature)) {
			homePage.clickOnFtNextButton();
		}
		homePage.clickOnFeatureByName(feature);
		Thread.sleep(2000);
	}

	@Then("User should redirect to {string} with type {string}")
	public void userShouldRedirectToWithType(String url, String type) {
		if(type.equals("self")) {
			Assert.assertEquals(BaseTest.getDriver().getCurrentUrl(), url, "url không khớp");
		} else {
			Set<String> windowHandles = BaseTest.getDriver().getWindowHandles();
			for(String handle : windowHandles) {
				if(!handle.equals(originalWindow)) {
					BaseTest.getDriver().switchTo().window(handle);
				}
			}
			Assert.assertEquals(BaseTest.getDriver().getCurrentUrl(), url, "url không khớp");
		}
	}
	@And("User should click on header element {string}")
	public void userShouldClickOnHeaderElement(String headerElement) throws InterruptedException {
		originalWindow = BaseTest.getDriver().getWindowHandle();
		homePage.clickOn(BasePage.element.get(headerElement));
		Thread.sleep(2000);
	}

	@And("User should click on health facility logo {string}")
	public void userShouldClickOnHealthFacilityLogo(String arg0) {
		
	}

	@Then("User should see health facility name on health facility detail page version {string}")
	public void userShouldSeeHealthFacilityNameOnHealthFacilityDetailPageVersion(String arg0) {
	}
}
