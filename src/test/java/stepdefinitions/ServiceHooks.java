package stepdefinitions;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BasePage;
import core.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class ServiceHooks extends BaseTest {
	@Before
	public void initializeTest() throws MalformedURLException {
		System.out.println("Khởi tạo driver...");
		beforeSuite();
	}
	
	@Given("Set environment {string}")
	public void set_environment(String env) throws InterruptedException {
	    BasePage.setEnv(env);
	    driver.navigate().to(BasePage.baseUrl);
	    if(!env.equals("prod")) {
//	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//	    	driver.switchTo().alert();
//	    	alert.sendKeys("medpro");
//	    	alert.sendKeys("\t");
//	    	alert.sendKeys("fullspeed");
//	    	alert.accept();
	    	
	    	Thread.sleep(10000);
	    }
	}
	
	@Given("Set browser to {string}")
	public void set_browser_to(String config) {
	    switch(config) {
	    	case "fullscreen":
	    		driver.manage().window().maximize();
	    		break;
	    	default:
	    		driver.manage().window().fullscreen();
	    }
	}

	@After
	public void afterHookFunction() {
		System.out.println("Tắt driver...");
		tearDown();
	}
}
