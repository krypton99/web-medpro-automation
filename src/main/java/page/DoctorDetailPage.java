package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;

public class DoctorDetailPage extends BasePage {
    public DoctorDetailPage(WebDriver driver, Actions action) {
        super(driver, action);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='styles_groupInfo__P8Z2h']//h1")
    private WebElement doctorName;

    public String getDoctorName() {
        return getText(doctorName);
    }
}
