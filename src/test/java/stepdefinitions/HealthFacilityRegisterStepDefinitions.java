package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
import org.testng.annotations.DataProvider;

import core.BasePage;
import core.BaseTest;
import core.Constants;
import core.ExcelUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.HealthFacilityRegisterPage;

public class HealthFacilityRegisterStepDefinitions {
	private HealthFacilityRegisterPage healthFacilityRegisterPage;
	
	public HealthFacilityRegisterStepDefinitions() {
		healthFacilityRegisterPage = new HealthFacilityRegisterPage(BaseTest.getDriver(), BaseTest.getAction());
	}
	
	@Given("User open Health Facility Register Page")
	public void user_open_health_facility_register_page() {
	   healthFacilityRegisterPage.navigateToHealthFacilityRegisterPage();
	}
	
	
//	@Then("Customer find {string} to receive data")
//	public void customer_find_to_receive_data(String fileName) throws IOException {
//		Object[][] data = ExcelUtils.getTableArray(Constants.TEST_DATA_PATH + fileName, false,"");
//		healthFacilityRegisterPage.setFormData(data);
//	}
	
	@Then("Customer open {string} and get data from row {string}")
	public void customer_open_and_get_data_from_row(String fileName, String row) throws IOException {
		Object[] data = ExcelUtils.getTableRow(Constants.TEST_DATA_PATH + fileName,"", Integer.parseInt(row));
		healthFacilityRegisterPage.setFormData(data);
	}
	
//	@Then("Customer enter {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
//	public void customer_enter(String fullName, String clinic, String phone, String subject, String email, String degree, String city, String district, String ward, String address, String intro) throws IOException {
//	    healthFacilityRegisterPage.enterFullName(fullName);
//	    healthFacilityRegisterPage.enterClinicName(clinic);
//	    healthFacilityRegisterPage.enterPhone(phone);
//	    healthFacilityRegisterPage.enterSubject(subject);
//	    healthFacilityRegisterPage.enterEmail(email);
//	    healthFacilityRegisterPage.enterDegree(degree);
//	    healthFacilityRegisterPage.selectCity(city);
//	    healthFacilityRegisterPage.selectDistrict(district);
//	    healthFacilityRegisterPage.selectWard(ward);
//	    healthFacilityRegisterPage.enterAddress(address);
//	    healthFacilityRegisterPage.enterClinicIntroduce(intro);
//	    healthFacilityRegisterPage.uploadAvatarImg();
//	    healthFacilityRegisterPage.uploadHealthFacilityImg();
//	    healthFacilityRegisterPage.uploadDegreeImg();
//	    healthFacilityRegisterPage.uploadLicenseImg();
//	    String[][] test = ExcelUtils.getTableArray(Constants.TEST_DATA_PATH + "data.xlsx", false, "");
//	    for(int i = 0; i < test.length; i++) {
//	    	System.out.println("Row " + i + ": ");
//	    	for(int j = 0; j < test[i].length;j++) {
//	    		System.out.print(test[i][j] + "\t");
//	    	}
//	    }
//	}
	
	@Then("Customer click register button")
	public void customer_click_register_button() throws InterruptedException{
		//healthFacilityRegisterPage.clickOnSubmitBtn();
	    Thread.sleep(10000);
	}


}
