package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;

public class HealthPackageDetailPage extends BasePage {
    public HealthPackageDetailPage(WebDriver driver, Actions action) {
        super(driver, action);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='styles_examinationHeader__U8V0e']//h1")
    private WebElement healthPackageName;

    public String getHealthPackageName() {
        return getText(healthPackageName);
    }
}
