package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import page.DoctorDetailPage;
import page.HealthFacilityRegisterPage;

public class DoctorDetailStepDefinitions {
    private DoctorDetailPage doctorDetailPage;

    public DoctorDetailStepDefinitions() {
        doctorDetailPage = new DoctorDetailPage(BaseTest.getDriver(), BaseTest.getAction());
    }

    @Then("User should see doctor name {string} on doctor detail page")
    public void userShouldSeeDoctorNameOnDoctorDetailPage(String doctorName) {
        Assert.assertTrue(doctorDetailPage.getDoctorName().contains(doctorName.trim()));
    }
}
