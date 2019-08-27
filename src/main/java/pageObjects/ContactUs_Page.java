package pageObjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;

public class ContactUs_Page extends BasePage {
	
	//elements locators
	public @FindBy(xpath = "//input[@name='first_name']") WebElement textfield_Firstname;
	public @FindBy(xpath = "//input[@name='last_name']") WebElement textfield_Lastname;
	public @FindBy(xpath = "//input[@name='email']") WebElement textfield_Email;
	public @FindBy(xpath = "//textarea[@name='message']") WebElement textfield_Message;
	public @FindBy(xpath = "//input[@value='SUBMIT']") WebElement button_Submit;
	//public @FindBy(xpath = ".//*[@id='contact_reply']/h1") WebElement thanks_message;
	
	
	public ContactUs_Page() throws IOException {
		super();
		
	}
	
	//Methods for the elements
	public ContactUs_Page getContacPage() throws IOException {
		getDriver().get("http://webdriveruniversity.com/Contact-Us/contactus.html");
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterFirstName(String firstName) throws Exception {
		sendKeysToWebElement(textfield_Firstname, firstName);
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterLastName(DataTable lastNamesTable, int row, int column) throws Exception {
		List<List<String>> data = lastNamesTable.raw();
		sendKeysToWebElement(textfield_Lastname, data.get(row).get(column)); 
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterEmail(String email) throws Exception {
		sendKeysToWebElement(textfield_Email, email);
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterMessage(DataTable commentsTable, int row, int column) throws Exception {
		List<List<String>> data = commentsTable.raw();
		sendKeysToWebElement(textfield_Message, data.get(row).get(column)); 
		return new ContactUs_Page();
	}
	
	public ContactUs_Page clickSubmitButton() throws Exception {
		waitAndClickElement(button_Submit);
		return new ContactUs_Page();
	}
	
	public ContactUs_Page confirmSuccesfulSubmission() throws IOException, InterruptedException {
		WebElement thanks_message = getDriver().findElement(By.xpath(".//*[@id='contact_reply']/h1"));
		WaitUntilWebElementIsVisible(thanks_message);
		Assert.assertEquals("thankyouforyourmessage!", thanks_message.getText().toLowerCase().replaceAll("\\s", ""));
		return new ContactUs_Page();
	}

}
