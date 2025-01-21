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
	private static final int TIMEOUT = 20;
	private static final int POLLING = 100;

	protected WebDriver driver;
	private WebDriverWait wait;
	private WebDriverWait waitWithSpecificTimeout;
	
	protected Actions action;
	
	public static String baseUrl;
	
	@FindBy(how = How.XPATH, using = "//img[@title='Logo Medpro']")
	private WebElement navlogoMedpro;
	
	@FindBy(how = How.XPATH, using = "//a[@href='https://www.tiktok.com/@medprovn/']")
	private WebElement navTiktok;
	
	@FindBy(how = How.XPATH, using = "//a[@href='https://www.facebook.com/www.medpro.vn']")
	private WebElement navFacebook;
	
	@FindBy(how = How.XPATH, using = "//a[@href='https://zalo.me/4018184502979486994']")
	private WebElement navZalo;
	
	@FindBy(how = How.XPATH, using = "//a[@href='https://www.youtube.com/@medpro-datkhamnhanh']")
	private WebElement navYoutube;
	
	@FindBy(how = How.ID, using = "dropNoti")
	private WebElement navBell;
	
	@FindBy(how = How.CLASS_NAME, using = "styles_download__3Ze_q")
	private WebElement navDownloadApp;
	
	@FindBy(how = How.ID, using = "dropInfo")
	private WebElement navProfile;
	
	@FindBy(how = How.CLASS_NAME, using = "styles_btnLanguage__8ISvU")
	private WebElement navLanguage;
	
	@FindBy(how = How.CLASS_NAME, using = "styles_titleSupport__ndGfi")
	private WebElement navCallCSKH;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/co-so-y-te']")
	private WebElement navCSYT;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/dich-vu-y-te']")
	private WebElement navDVYT;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/kham-suc-khoe-doanh-nghiep']")
	private WebElement navKSKDN;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/tin-tuc']")
	private WebElement navNews;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/huong-dan/cai-dat-ung-dung']")
	private WebElement navGuide;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/hop-tac-cung-medpro']")
	private WebElement navSupport;
	
	@FindBy(how = How.XPATH, using = "//span[@class='ant-input-affix-wrapper']//input")
	private WebElement navSearch;
	
	//Sub menu Cơ sở y tế
	
	@FindBy(how = How.XPATH, using = "//a[@href='/co-so-y-te']/..//li[contains(text(),'Bệnh viện công')]")
	private WebElement subMenuCSYT_Benhviencong;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/co-so-y-te']/..//li[contains(text(),'Bệnh viện tư')]")
	private WebElement subMenuCSYT_Benhvientu;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/co-so-y-te']/..//li[contains(text(),'Phòng khám')]")
	private WebElement subMenuCSYT_Phongkham;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/co-so-y-te']/..//li[contains(text(),'Phòng mạch')]")
	private WebElement subMenuCSYT_Phongmach;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/co-so-y-te']/..//li[contains(text(),'Y tế tại nhà')]")
	private WebElement subMenuCSYT_Ytetainha;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/co-so-y-te']/..//li[contains(text(),'Xét nghiệm')]")
	private WebElement subMenuCSYT_Xetnghiem;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/co-so-y-te']/..//li[contains(text(),'Tiêm chủng')]")
	private WebElement subMenuCSYT_Tiemchung;
	
	//Sub menu Dịch vụ y tế
	
	@FindBy(how = How.XPATH, using = "//a[@href='/dich-vu-y-te']/..//li[contains(text(),'Đặt khám tại cơ sở')]")
	private WebElement subMenuDVYT_Datkhamcoso;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/dich-vu-y-te']/..//li[contains(text(),'Đặt khám theo bác sĩ')]")
	private WebElement subMenuDVYT_Datkhambacsi;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/dich-vu-y-te']/..//li[contains(text(),'Phòng khám')]")
	private WebElement subMenuDVYT_Phongkham;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/dich-vu-y-te']/..//li[contains(text(),'Gọi video với bác sĩ')]//..")
	private WebElement subMenuDVYT_Tuvantuxa;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/dich-vu-y-te']/..//li[contains(text(),'Đặt lịch xét nghiệm')]")
	private WebElement subMenuDVYT_Datlichxetnghiem;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/dich-vu-y-te']/..//li[contains(text(),'Gói khám sức khỏe')]")
	private WebElement subMenuDVYT_Goikham;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/dich-vu-y-te']/..//li[contains(text(),'Đặt lịch tiêm chủng')]")
	private WebElement subMenuDVYT_Tiemchung;
	
	//Sub menu Tin tức
	
	@FindBy(how = How.XPATH, using = "//a[@href='/tin-tuc']/..//li[contains(text(),'Tin dịch vụ')]")
	private WebElement subMenuTintuc_Tindichvu;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/tin-tuc']/..//li[contains(text(),'Tin y tế')]")
	private WebElement subMenuTintuc_Tinyte;
		
	@FindBy(how = How.XPATH, using = "//a[@href='/tin-tuc']/..//li[contains(text(),'Y học thường thức')]")
	private WebElement subMenuTintuc_Yhocthuongthuc;

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
	
	public void clickOn(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	public BasePage(WebDriver driver, Actions action) {
		this.driver = driver;
		this.action = action;
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT), Duration.ofMillis(POLLING));
		waitWithSpecificTimeout = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGoiVideoVoiBacSi() {
		moveToElement(navDVYT);
		clickOn(subMenuDVYT_Tuvantuxa);
	}
	
	public void moveToElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).perform();
	}
	
	public static void setEnv(String env) {
		switch (env) {
			case "prod":
				baseUrl = Constants.BASE_URL_PROD;
				break;
			case "beta":
				baseUrl = Constants.BASE_URL_BETA;
				break;
			case "testing":
				baseUrl = Constants.BASE_URL_TESTING;
				break;
			case "staging":
				baseUrl = Constants.BASE_URL_STAGING;
				break;
			default: 
				baseUrl = Constants.BASE_URL_PROD;
				break;
		}
	}
	
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public WebDriverWait getDriverWait() {
		return wait;
	}
}
	
	