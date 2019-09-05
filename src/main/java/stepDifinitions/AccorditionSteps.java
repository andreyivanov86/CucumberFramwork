package stepDifinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

	@Then("^User clicks on each button to show hidden text$")
	public void user_clicks_on_each_button_to_show_hidden_text(DataTable buttons) throws Throwable {
	   
	}

	@Then("^User clicks on each button to hide text$")
	public void user_clicks_on_each_button_to_hide_text(DataTable divs) throws Throwable {
	
	}
	
}
