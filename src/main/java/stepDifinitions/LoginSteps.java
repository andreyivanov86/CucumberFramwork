package stepDifinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {

	
	@Given("^User navigates to \"([^\"]*)\" login page$")
	public void user_navigates_to_login_page(String url) throws IOException {
		loginPage.getLoginPage(url);
	}

	@And("^User type \"([^\"]*)\" username$")
	public void user_type_username(String username) throws Throwable {
		loginPage.sendUsername(username);
	}

	@And("^User type \"([^\"]*)\" password$")
	public void user_type_password(String password) throws Throwable {
		loginPage.sendPassword(password);
	}

	@When("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {
		loginPage.clickLoginButton();
	}

	@Then("^User should be presented with \"([^\"]*)\" message$")
	public void user_should_be_presented_with_message(String message) throws Throwable {
		loginPage.checkAlertMessage(message);
	}
}
