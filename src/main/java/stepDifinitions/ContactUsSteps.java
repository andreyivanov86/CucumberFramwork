 package stepDifinitions;

import java.io.IOException;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactUsSteps extends DriverFactory {
		
	@Given("^User access webdriveruniversity Contact us form$")
	public void user_access_webdriveruniversity_Contact_us_form() throws IOException{
		contactusPage.getContacPage();
	}

	@When("^User enters valid user name$")
	public void user_enters_valid_user_name() throws Exception{
		contactusPage.enterFirstName("Andrey");
	}

	@And("^User enters valid last name$")
	public void user_enters_valid_last_name(DataTable lastNamesTable) throws Exception{
		contactusPage.enterLastName(lastNamesTable, 0, 0);
	}

	@And("^User enters valid email address$")
	public void user_enters_valid_email_address() throws Exception{
		contactusPage.enterEmail("andrey@gmail.com");
	}

	@And("^User enters comments$")
	public void user_enters_comments(DataTable commentsTable) throws Exception{
		contactusPage.enterMessage(commentsTable, 0, 0);
	}

	@When("^User clicks on Sumbit button$")
	public void user_clicks_on_Sumbit_button() throws Exception{
		contactusPage.clickSubmitButton();
	}

	@Then("^the information should successfully be submited$")
	public void the_information_should_successfully_be_submited() throws InterruptedException, IOException{
		contactusPage.confirmSuccesfulSubmission();
	}

}
