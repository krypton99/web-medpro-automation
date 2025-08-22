package core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BaseTest {
	
	protected static WebDriver driver;
	
	protected static Actions action;
	
	public static void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments(
				"--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3");
		options.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(options);
		action = new Actions(driver);
	}
	
	public static void tearDown() {
		if(null != driver) {
			driver.close();
			driver.quit();
		}
	}
	

	public static WebDriver getDriver() {
		return driver;
	}
	
	public static Actions getAction() {
		return action;
	}
}
