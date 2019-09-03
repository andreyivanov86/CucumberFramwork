package stepDifinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ToDoListSteps extends DriverFactory {
	
	@Given("^User navigates to \"([^\"]*)\" webdriveruniversity todolist website$")
	public void user_navigates_to_webdriveruniversity_todolist_website(String url) throws Throwable {
		getDriver().get(url);
	}

	@And("^User enters item \"([^\"]*)\" name to the Add new todo field$")
	public void user_enters_item_name_to_the_Add_new_todo_field(String itemName) throws Throwable {
		todoList.enterItemName(itemName);
	}
	
	@When("^User press Enter$")
	public void user_press_Enter() throws Throwable {
		todoList.pressEnter();
	}

	@Then("^New Todo item \"([^\"]*)\" should be added to the list$")
	public void new_Todo_item_should_be_added_to_the_list(String newItem) throws Throwable {
		todoList.checkNewItem(newItem);
	}
}
