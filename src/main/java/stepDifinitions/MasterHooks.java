package stepDifinitions;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {
	
	@Before 
	public void setup() {
		driver = getDriver();
		
	}
	
	@After
	public void tearDownAndScreenShotOnFailure(Scenario scenario) {
		
		try {
			//Take screenshot of failed scanario
			if (driver != null && scenario.isFailed()) {
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
				driver.manage().deleteAllCookies();
				driver.close();
				driver.quit();
				driver = null;
			}
			//Check if driver is null. If so tear down and make driver null
			if (driver != null) {
				driver.manage().deleteAllCookies();
//				driver.close();
				driver.quit();
				driver = null;
			}
		}
		catch(Exception e) {
			System.out.println("Methods failed. tearDownAndScreenShotOnFailure, Exception: " + e.getMessage());
		}
		
		
	}
}
