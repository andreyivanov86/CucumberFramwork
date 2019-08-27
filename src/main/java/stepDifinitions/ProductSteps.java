package stepDifinitions;

import java.io.IOException;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class ProductSteps extends DriverFactory{
	
	@Given("^User navigates to \"([^\"]*)\" website$")
	public void user_navigates_to_website(String url){
		getDriver().get(url);
	}

	@Then("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String buttonLocator) throws InterruptedException{
		basePage.WaitUntilWebElementIsVisibleUsingByLocator(By.cssSelector(buttonLocator));
		getDriver().findElement(By.cssSelector(buttonLocator)).click();
	}

	@Then("^User should be presented with promo alert$")
	public void user_should_be_presented_with_promo_alert() throws InterruptedException, IOException {
		productsPage.printVoucherCode();
		productsPage.clickOnProceedPopup();
		
	}
}
