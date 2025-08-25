package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import page.ChooseBookingServicePage;
import page.HospitalDetailPage;

public class ChooseBookingServiceStepDefinitions {
    private ChooseBookingServicePage chooseBookingServicePage;

    public ChooseBookingServiceStepDefinitions() {
        chooseBookingServicePage = new ChooseBookingServicePage(BaseTest.getDriver(), BaseTest.getAction());
    }

    @Then("User should see health facility name {string} on choose booking service page")
    public void userShouldSeeHealthFacilityNameOnChooseBookingServicePage(String hospitalName) {
        String expectHospitalName = chooseBookingServicePage.getBreadCrumbsHospitalName();
        Assert.assertEquals(hospitalName.trim(), expectHospitalName.trim(), "Tên cơ sở y tế không khớp");
    }
}
