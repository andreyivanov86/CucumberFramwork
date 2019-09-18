package stepDifinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
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
	
	@When("^User hovers over element$")
	public void user_hovers_over_element(DataTable data) throws Throwable {
	    actions.hoverOverElement(data, 0, 0);

	}
	
	@And("^User clicks on link that appeared$")
	public void user_clicks_on_link_that_appeared(DataTable data) throws Throwable {
		actions.clickLink(data, 0, 0);

	}

	@Then("^Popup message should appear$")
	public void popup_message_should_appear() throws Throwable {
		basePage.closeAlertPopupBox();
	}
	
	@When("^User clicks and holds button$")
	public void user_clicks_and_holds_button() throws Throwable {
		actions.pressAndHold();
	}

	@Then("^Color of the button turns green$")
	public void color_of_the_button_turns_green() throws Throwable {
		actions.checkIfBeingHold();
	}

	@When("^User releases hold$")
	public void user_releases_hold() throws Throwable {
		actions.releasePressAndHold();
	}

	@Then("^Button turns red$")
	public void button_turns_red() throws Throwable {
		actions.checkIfReleased();
	}

}
