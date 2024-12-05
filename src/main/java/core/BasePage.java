package core;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private static final int TIMEOUT = 5;
	private static final int POLLING = 100;

	protected WebDriver driver;
	private WebDriverWait wait;
	private WebDriverWait waitWithSpecificTimeout;
	
	public static String baseUrl = "https://medpro.vn";
	

	public boolean isElementVisibility(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (TimeoutException ex) {
			return false;
		}
	}

	public boolean isElementVisibilityBy(By by) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			return true;
		} catch (TimeoutException ex) {
			return false;
		}
	}

	public boolean isElementVisibility(WebElement element, int timeout) {
		// chờ với thời gian truyền vào (giay)
		waitWithSpecificTimeout = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			waitWithSpecificTimeout.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (TimeoutException ex) {
			return false;
		}
	}

	public void enterText(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}

	public String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT), Duration.ofMillis(POLLING));
		waitWithSpecificTimeout = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public WebDriverWait getDriverWait() {
		return wait;
	}
}
	
	