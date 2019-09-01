package pageObjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BasePage {
	
	public @FindBy(id = "text") WebElement username_field;
	public @FindBy(id = "password") WebElement password_field;
	public @FindBy(xpath = "//button[@id='login-button']") WebElement login_button;
	
	public Login_Page() throws IOException {
		super();
	}
	
	public Login_Page getLoginPage(String url) throws IOException {
		getDriver().get(url);
		
		return new Login_Page();
	}
	
	public Login_Page sendUsername(String username) throws Exception {
		basePage.sendKeysToWebElement(username_field, username);
		return new Login_Page();
	}
	
	public Login_Page sendPassword(String password) throws Exception {
		basePage.sendKeysToWebElement(password_field, password);
		return new Login_Page();
	}

	public Login_Page clickLoginButton() throws Exception{
		try {
			driver.findElement(By.id("login-button")).click();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}		
		return new Login_Page();
	}
	
	public Login_Page checkAlertMessage(String message) throws IOException {
			Alert alert = driver.switchTo().alert();
			assertEquals(alert.getText().toString().toLowerCase().replaceAll("\\s", ""), message.toLowerCase().replaceAll("\\s", ""));
			alert.accept();

		return new Login_Page();
	}
}
