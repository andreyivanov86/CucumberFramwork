package stepDifinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class DropCheckRadio extends DriverFactory{
	
	//Drop Down menu
	@Given("^User opens webdriveruniversity DropDown, CheckBox, RadioButtons section$")
	public void user_opens_webdriveruniversity_DropDown_CheckBox_RadioButtons_section() throws Throwable {
		dropCheckRadio.getDropCheckRadioPage();
	}

	@And("^User select item from drop down menu$")
	public void user_select_item_from_drop_down_menu(DataTable data) throws Throwable {
		dropCheckRadio.selectItemFromList(data, 0, 0, "JAVA");
		dropCheckRadio.selectItemFromList(data, 0, 1, "JUnit");
		dropCheckRadio.selectItemFromList(data, 0, 2, "HTML");
	}
	//Check boxes
	@And("^User checks check boxes$")
	public void user_checks_check_boxes(DataTable data) throws Throwable {
		dropCheckRadio.checkCheckbox(data, 0, 0);
		dropCheckRadio.checkCheckbox(data, 0, 1);
		dropCheckRadio.checkCheckbox(data, 0, 2);
		dropCheckRadio.checkCheckbox(data, 0, 3);
	}

}
