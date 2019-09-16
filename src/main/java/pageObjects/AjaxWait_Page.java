package pageObjects;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AjaxWait_Page extends BasePage{

	public AjaxWait_Page() throws IOException {
		super();
		
	}
	
	public @FindBy (xpath = "//p[contains(text(),'CLICK ME!')]") WebElement buttonClickMeXpath;
	public @FindBy (id = "//span[@id='button1']") WebElement buttonClickMeId;
	public @FindBy (xpath = "//div[@id='myModalClick']//h4[@class='modal-title']") WebElement popupMesage;
	public @FindBy (xpath = "//div[@id='myModalClick']//button[contains(text(), 'Close')]") WebElement popupClose;
	
	public AjaxWait_Page openAjaxWaitPage() throws Exception {
		getDriver().get("http://webdriveruniversity.com/Ajax-Loader/index.html");
		return new AjaxWait_Page();
	}
	
	public AjaxWait_Page waitUntilButtonIsAvailable() throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOf(buttonClickMeXpath));
			System.out.println("Element " + buttonClickMeXpath + " is available");
			assertTrue(buttonClickMeXpath.isDisplayed());
		} catch (Exception e) {
			System.out.println("Element " + buttonClickMeXpath + "is not available. Exception: " + e.getMessage());
		}
		return new AjaxWait_Page();
	}
	
	public AjaxWait_Page waitUntilButtonIsClickableAndClick() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(buttonClickMeXpath));
			System.out.println("Element " + buttonClickMeXpath + " is clickable");
			buttonClickMeXpath.click();
		} catch (Exception e) {
			System.out.println("Element " + buttonClickMeXpath + "is not available. Exception: " + e.getMessage());
		}
		return new AjaxWait_Page();
	}
	
	public AjaxWait_Page checkPopupMessage () throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOf(popupMesage));
			System.out.println("Element " + popupMesage + " is visible");
			assertTrue(popupMesage.isDisplayed());			
		} catch (Exception e) {
			System.out.println("Element " + popupMesage + "is not available. Exception: " + e.getMessage());
		}
		return new AjaxWait_Page();
	}
	
	public AjaxWait_Page closePopupMessage () throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(popupClose));
			System.out.println("Element " + popupClose + " is visible");
			popupClose.click();			
		} catch (Exception e) {
			System.out.println("Element " + popupClose + "is not available. Exception: " + e.getMessage());
		}
		return new AjaxWait_Page();
	}
	
	

}
