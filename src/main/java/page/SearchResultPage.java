package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver, Actions action) {
        super(driver, action);
    }
    @FindBy(how = How.XPATH, using = "//div[@class='styles_inputItem__xbR9Q']//input")
    private WebElement searchInput;
    @FindBy(how = How.XPATH, using = "//ul[@class='styles_tag__UU5QB']//button[contains(@class,'styles_active__t3XmU')]/h2")
    private WebElement searchTabSelector;

    public String getSearchKey() {
        return getAttribute(searchInput,"value");
    }

    public String getSearchTabText() {
        return getText(searchTabSelector);
    }
}
