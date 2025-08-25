package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import page.HomePage;
import page.HospitalDetailPage;

public class HospitalDetailStepDefinitions {
    private HospitalDetailPage hospitalDetailPage;

    public HospitalDetailStepDefinitions() {
        hospitalDetailPage = new HospitalDetailPage(BaseTest.getDriver(), BaseTest.getAction());
    }

    @Then("User should see health facility name {string} on health facility detail page version {string}")
    public void userShouldSeeHealthFacilityNameOnHealthFacilityDetailPageVersion(String hospitalName, String version) {
        String expectHospitalName = hospitalDetailPage.getBreadCrumbsHospitalName();
        Assert.assertEquals(hospitalName.trim(), expectHospitalName.trim(), "Tên cơ sở y tế không khớp");
    }
}
