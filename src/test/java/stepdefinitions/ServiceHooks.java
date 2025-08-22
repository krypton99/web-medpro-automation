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
import core.Constants;
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
	    
	    if(!env.equals("prod")) {
	    	driver.get(Constants.BASE + Constants.ID + ":" + Constants.PW + "@" + BasePage.baseUrl);
	    } else {
	    	driver.get(Constants.BASE + BasePage.baseUrl);
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
