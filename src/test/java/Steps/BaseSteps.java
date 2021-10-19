package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseSteps {
	WebDriver driver;
	
	public BaseSteps() {
		setUp();
	}

	public void setUp() {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\webdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
