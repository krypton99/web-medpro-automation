package page;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.BasePage;
import core.Constants;

public class HealthFacilityRegisterPage extends BasePage {

	public HealthFacilityRegisterPage(WebDriver driver, Actions action) {
		super(driver, action);
		formData = new ArrayList<String>();
	}
	
	private List<String> formData;
	
	@FindBy(how = How.ID, using = "fullName")
	private WebElement fullNameInput;
	
	@FindBy(how = How.ID, using = "clinicName")
	private WebElement clinicNameInput;
	
	@FindBy(how = How.ID, using = "phone")
	private WebElement phoneInput;
	
	@FindBy(how = How.ID, using = "subject")
	private WebElement subjectInput;
	
	@FindBy(how = How.ID, using = "email")
	private WebElement emailInput;
	
	@FindBy(how = How.ID, using = "degree")
	private WebElement degreeInput;
	
	@FindBy(how = How.ID, using = "city")
	private WebElement cityInput;
	
	@FindBy(how = How.ID, using = "district")
	private WebElement districtInput;
	
	@FindBy(how = How.ID, using = "ward")
	private WebElement wardInput;
	
	@FindBy(how = How.ID, using = "address")
	private WebElement addressInput;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(how = How.XPATH, using = "//button[@type='reset']")
	private WebElement resetBtn;
	
	@FindBy(how = How.ID, using = "clinicIntroduce")
	private WebElement clinicIntroduce;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Ảnh đại diện')]/following::input[1]")
	private WebElement avatar;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Hình ảnh cơ sở y tế')]/following::input[1]")
	private WebElement healthFacilityImg;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Bằng khen/Bằng cấp')]/following::input[1]")
	private WebElement degreeImg;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Giấy phép đăng ký kinh doanh')]/following::input[1]")
	private WebElement licenseImg;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/' and @rel='nofollow']")
	private WebElement medproFooter;
	
	
	private String searchOption = "//div[contains(@title,'%s')]";
	
	public void enterFullName(String fullName) {
		enterText(fullNameInput, fullName);
	}
	
	public void enterClinicName(String clinicName) {
		enterText(clinicNameInput, clinicName);
	}
	
	public void enterPhone(String phone) {
		enterText(phoneInput, phone);
	}
	
	public void enterEmail(String email) {
		enterText(emailInput, email);
	}
	
	public void enterSubject(String subject) {
		enterText(subjectInput, subject);
	}
	
	public void enterDegree(String degree) {
		enterText(degreeInput, degree);
	}
	
	public void enterAddress(String address) {
		enterText(addressInput, address);
	}
	
	public void enterClinicIntroduce(String intro) {
		enterText(clinicIntroduce, intro);
	}
	
	public void selectCity(String city) {
		enterText(cityInput, city);
		clickOnBy(By.xpath(String.format(searchOption,city)));
	}
	
	public void selectDistrict(String district) {
		enterText(districtInput, district);
		clickOnBy(By.xpath(String.format(searchOption,district)));
	}

	public void selectWard(String ward) {
		enterText(wardInput, ward);
		clickOnBy(By.xpath(String.format(searchOption,ward)));
	}
	
	public void navigateToHealthFacilityRegisterPage() {
		get(baseUrl + Constants.SUB_PATH_HEALTH_FACILITY_REGISTER_PAGE);
	}
	
	public void uploadAvatarImg() {
//		String filePath = Paths.get(Constants.TEST_DATA_PATH + "avatar.png").toAbsolutePath().toString();
//		System.out.println("Upload image from: " + filePath);
//		avatar.sendKeys(filePath);
	}
	
	public void uploadHealthFacilityImg() {
//		String[] fileNames = {"nhietdoi1.jpg","nhietdoi2.jpg","nhietdoi3.jpg"};
//		String filePath;
//		for(String fileName : fileNames) {
//			filePath = Paths.get(Constants.TEST_DATA_PATH + fileName).toAbsolutePath().toString();
//			System.out.println("Upload image from: " + filePath);
//			healthFacilityImg.sendKeys(filePath);
//		}
	}
	
	public void uploadDegreeImg() {
//		String[] fileNames = {"data1.png","data2.png","data3.png","data4.png","data5.png"};
//		String filePath;
//		for(String fileName : fileNames) {
//			filePath = Paths.get(Constants.TEST_DATA_PATH + fileName).toAbsolutePath().toString();
//			System.out.println("Upload image from: " + filePath);
//			degreeImg.sendKeys(filePath);
//		}
	}
	
	public void uploadLicenseImg() {
//		String[] fileNames = {"data1.png","data2.png","data3.png","data4.png","data5.png"};
//		String filePath;
//		for(String fileName : fileNames) {
//			filePath = Paths.get(Constants.TEST_DATA_PATH + fileName).toAbsolutePath().toString();
//			System.out.println("Upload image from: " + filePath);
//			licenseImg.sendKeys(filePath);
//		}
	}
	
	public void clickOnSubmitBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		clickOn(submitBtn);
	}
	
	public void setFormData(Object[] data) throws IOException {
		for(Object d : data) {
			formData.add((String) d);
		}
		customer_enter(formData.get(2), formData.get(3), formData.get(4), formData.get(5), formData.get(6), formData.get(7), formData.get(8), formData.get(9), formData.get(10), formData.get(11), formData.get(12));
	}
	
	public void customer_enter(String fullName, String clinic, String phone, String subject, String email, String degree, String city, String district, String ward, String address, String intro) throws IOException {
	    enterFullName(fullName);
	    enterClinicName(clinic);
	    enterPhone(phone);
	    enterSubject(subject);
	    enterEmail(email);
	    enterDegree(degree);
	    selectCity(city);
	    selectDistrict(district);
	    selectWard(ward);
	    enterAddress(address);
	    enterClinicIntroduce(intro);
	    uploadAvatarImg();
	    uploadHealthFacilityImg();
	    uploadDegreeImg();
	    uploadLicenseImg();
	}
	
	public void clickOnResetBtn() {
		clickOn(resetBtn);
	}
}
