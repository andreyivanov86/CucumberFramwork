package stepDifinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AccorditionSteps extends DriverFactory{
	
	@Given("^User open webdriverunivercity Accordition page$")
	public void user_open_webdriverunivercity_Accordition_page() throws Throwable {
	  driver.get("http://webdriveruniversity.com/Accordion/index.html");
	}

	@And("^User waits for Loading Complete message$")
	public void user_waits_for_Loading_Complete_message() throws Throwable {
		accorditionPage.waitPageLoaded();
	}

	@When("^User clicks on each button to show hidden text$")
	public void user_clicks_on_each_button_to_show_hidden_text(DataTable data) throws Throwable {
		List<List<String>> buttons = data.raw();
		accorditionPage.clickOnElement(buttons.get(0).get(0));
		accorditionPage.clickOnElement(buttons.get(0).get(1));
		accorditionPage.clickOnElement(buttons.get(0).get(2));
		accorditionPage.clickOnElement(buttons.get(0).get(3));
		Thread.sleep(1000);
	}

	@Then("^Check if hidden text is visible$")
	public void check_if_hidden_text_is_visible(DataTable data) throws Throwable {
		List<List<String>> textId = data.raw();
		accorditionPage.checkTextIsVisible(textId.get(0).get(0));
		accorditionPage.checkTextIsVisible(textId.get(0).get(1));
		accorditionPage.checkTextIsVisible(textId.get(0).get(2));
		accorditionPage.checkTextIsVisible(textId.get(0).get(3));
	}
	
}
