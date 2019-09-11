package pageObjects;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accordition_Page extends BasePage{
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	By pageLoaded = By.xpath("//p[@id='hidden-text' and contains(text(), 'LOADING COMPLETE.')]");
	public @FindBy(xpath = "//p[@id='hidden-text' and contains(text(), 'LOADING COMPLETE.')]") WebElement loadedPage;
//	public @FindBy(xpath = "//p[@id='timeout' and contains(text(), '')]") WebElement loadedPage;
	
	public Accordition_Page() throws IOException {
		super();
	}
	
	public Accordition_Page waitPageLoaded() throws IOException {
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(pageLoaded));
			assertEquals("LOADING COMPLETE.", loadedPage.getText());
			
		} catch (Exception e) {
			System.out.println("Unable to located element: " + e.getMessage());
		}
		
		return new Accordition_Page();
	}
	
	public Accordition_Page clickOnElement(String id) throws IOException{
		
		try {
			driver.findElement(By.id(id)).click();
		} catch (Exception e) {
			System.out.println("Unable to click element : " + e.getMessage());
		}
		
		return new Accordition_Page();
	}
	
	public Accordition_Page checkTextIsVisible(String id) throws IOException {
		
		try {
			assertTrue(driver.findElement(By.id(id)).isDisplayed());
		} catch (Exception e) {
			System.out.println("Element is not visible : " + e.getMessage());
		}
		
		return new Accordition_Page();
	}
}
