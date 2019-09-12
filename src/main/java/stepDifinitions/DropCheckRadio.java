package stepDifinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class DropCheckRadio extends DriverFactory{
	
	@Given("^User opens webdriveruniversity DropDown, CheckBox, RadioButtons section$")
	public void user_opens_webdriveruniversity_DropDown_CheckBox_RadioButtons_section() throws Throwable {
		dropCheckRadio.getDropCheckRadioPage();
	}

	@When("^User select item from drop down menu$")
	public void user_select_item_from_drop_down_menu(DataTable data) throws Throwable {
		dropCheckRadio.selectItemFromList(data, 0, 0, "JAVA");
		dropCheckRadio.selectItemFromList(data, 0, 1, "JUnit");
		dropCheckRadio.selectItemFromList(data, 0, 2, "HTML");
	}

	@Then("^Item should be selected$")
	public void item_should_be_selected() throws Throwable {

	}


}
