package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import page.HealthPackageDetailPage;
import page.HospitalDetailPage;

public class HealthPackageDetailStepDefinitions {
    private HealthPackageDetailPage healthPackageDetailPage;

    public HealthPackageDetailStepDefinitions() {
        healthPackageDetailPage = new HealthPackageDetailPage(BaseTest.getDriver(), BaseTest.getAction());
    }

    @Then("User should see health package name {string} on health package detail page")
    public void userShouldSeeHealthPackageNameOnHealthPackageDetailPage(String packageName) {
        Assert.assertEquals(healthPackageDetailPage.getHealthPackageName().trim(), packageName.trim());
    }
}
