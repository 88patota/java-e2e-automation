package util;

import io.cucumber.plugin.event.Node.ScenarioOutline;

import org.junit.After;
import org.junit.Before;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase extends TestWatcher {

	private static WebDriver driver;

	public TestBase() {
		super();
	}

	@Override
	protected void starting(Description description) {
	}

	@Before
	public void beforeScenario(ScenarioOutline scenario) {
	}

	@After
	public void afterScenario() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}

	protected void finished(Description description) {
		super.finished(description);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void abrirNavegador(String url) {
		ChromeOptions chromeOpts = new ChromeOptions();
		chromeOpts.addArguments("--window-site=1920,1080");
		Utils.setDriverByOS();

		driver = new ChromeDriver(chromeOpts);
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}

}
