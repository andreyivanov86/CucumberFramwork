package stepDifinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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
	
	@And("^user clicks on radio buttons$")
	public void user_clicks_on_radio_buttons(DataTable data) throws Throwable {
		dropCheckRadio.clickRadioButton(data, 0, 1);
		dropCheckRadio.clickRadioButton(data, 0, 2);
	}
	
	@And("^User clicks on Selected and disabled Radio buttons$")
	public void user_clicks_on_Selected_and_disabled_Radio_buttons(DataTable data) throws Throwable {
		dropCheckRadio.clickRadButInSelectedDisabled(data, 0, 2);
		dropCheckRadio.clickRadButInSelectedDisabled(data, 0, 1);
		dropCheckRadio.clickRadButInSelectedDisabled(data, 0, 0);
	}
	
	@And("^User selects enabled and not selected item from dropdown list$")
	public void user_selects_enabled_and_not_selected_item_from_dropdown_list(DataTable data) throws Throwable {
		dropCheckRadio.selectUnselectedAndEnabledItem(data, 0, 3, "Grape");
		dropCheckRadio.selectUnselectedAndEnabledItem(data, 0, 1, "Orange");
		dropCheckRadio.selectUnselectedAndEnabledItem(data, 0, 0, "Apple");
		dropCheckRadio.selectUnselectedAndEnabledItem(data, 0, 2, "Pear");
		
	}

}
