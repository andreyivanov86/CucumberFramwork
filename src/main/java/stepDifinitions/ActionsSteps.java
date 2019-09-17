package stepDifinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ActionsSteps extends DriverFactory{
	
	@Given("^User opens Actions page$")
	public void user_opens_Actions_page() throws Throwable {
		actions.openActionsPage("http://webdriveruniversity.com/Actions/index.html#");
	}

	@When("^User clicks on DRAG ME item and dropping it on the DROP HERE item$")
	public void user_clicks_on_DRAG_ME_item_and_dropping_it_on_the_DROP_HERE_item() throws Throwable {
		actions.drugAndDrop();
	}

	@Then("^DROP HERE should change to DROPPED$")
	public void drop_HERE_should_change_to_DROPPED() throws Throwable {
		actions.checkIfDropped();
	}
	
	@When("^User clicks on DOUBLE CLICK ME Button$")
	public void user_clicks_on_DOUBLE_CLICK_ME_Button() throws Throwable {
		actions.doubleClick();
	}

	@Then("^The color should turn green$")
	public void the_color_should_turn_green() throws Throwable {
		actions.checkIfDoubleClicked();
	}
}
