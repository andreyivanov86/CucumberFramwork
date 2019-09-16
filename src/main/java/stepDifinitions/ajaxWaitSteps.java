package stepDifinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ajaxWaitSteps extends DriverFactory{
	
	@Given("^User opens ajax loader page$")
	public void user_opens_ajax_loader_page() throws Throwable {
		ajaxWait.openAjaxWaitPage();
	}
	
	@When("^User waits until the button is available and clicks$")
	public void user_waits_until_the_button_is_available_and_clicks() throws Throwable {
		ajaxWait.waitUntilButtonIsClickableAndClick();
	}

	@Then("^Popum message is presented$")
	public void popum_message_is_presented() throws Throwable {
		ajaxWait.checkPopupMessage();
	}

	@And("^User clicks on Close button$")
	public void user_clicks_on_Close_button() throws Throwable {
		ajaxWait.closePopupMessage();
	}

}
