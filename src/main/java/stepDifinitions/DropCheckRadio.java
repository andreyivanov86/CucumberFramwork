package stepDifinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class DropCheckRadio extends DriverFactory{
	
	@Given("^User opens webdriveruniversity DropDown, CheckBox, RadioButtons section$")
	public void user_opens_webdriveruniversity_DropDown_CheckBox_RadioButtons_section() throws Throwable {
		dropCheckRadio.getDropCheckRadioPage();
	}

	@Given("^User clicks on the \"([^\"]*)\" DropDown menu$")
	public void user_clicks_on_the_DropDown_menu(String dropDown_id) throws Throwable {
		dropCheckRadio.clickOnDropDownMenu(dropDown_id);
	}

	@When("^User clicks on \"([^\"]*)\" item$")
	public void user_clicks_on_item(String menu_item) throws Throwable {
		dropCheckRadio.selectItemFromList(menu_item);
	}
	
	@Then("^Item should be selected$")
	public void item_should_be_selected() throws Throwable {
	   
	}

}
