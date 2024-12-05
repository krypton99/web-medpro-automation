package stepdefinitions;

import java.net.MalformedURLException;

import core.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks extends BaseTest {
	@Before
	public void initializeTest() throws MalformedURLException {
		System.out.println("Khởi tạo driver...");
		beforeSuite();
	}

	@After
	public void afterHookFunction() {
		System.out.println("Tắt driver...");
		tearDown();
	}
}
