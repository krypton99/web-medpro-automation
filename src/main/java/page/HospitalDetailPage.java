package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class HospitalDetailPage extends BasePage {
    public HospitalDetailPage(WebDriver driver, Actions action) {
        super(driver, action);
    }
    @FindBy(how = How.XPATH, using = "//span[@class='styles_text__KPG_r']")
    private WebElement breadcrumbsHospitalName;

    public String getBreadCrumbsHospitalName() {
        return getText(breadcrumbsHospitalName);
    }
}
