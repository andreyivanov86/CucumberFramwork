package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;

public class Actions_Page extends BasePage{

	public Actions_Page() throws IOException {
		super();
	}
	
	public @FindBy(id = "draggable") WebElement dragMeElement;
	public @FindBy(id = "droppable") WebElement dropHereElement;
	public @FindBy(id = "double-click") WebElement doubleClickElement;
	public @FindBy(xpath = "//div[@class='dropdown hover']//a[@class='list-alert'][contains(text(),'Link 1')]") WebElement link;
	public @FindBy(id = "click-box") WebElement clickBoxElement;
	
	public Actions_Page openActionsPage(String url) throws Exception {
		getDriver().get(url);
		return new Actions_Page();
	}
	
	public Actions_Page drugAndDrop() throws Exception {
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.dragAndDrop(dragMeElement, dropHereElement).build();
		try {
			dragAndDrop.perform();
			System.out.println("Successfuly performed drug and drop action for elements: " + dragMeElement + " and " + dropHereElement);
		} catch (Exception e) {
			System.out.println("Unable to perform action for: " + dragMeElement + dropHereElement + " elements with Exception: " + e.getMessage());
		}
		return new Actions_Page();
	}
	
	public Actions_Page checkIfDropped() throws Exception {
		assertEquals("Dropped!", dropHereElement.getText());
		return new Actions_Page();
	}
	
	public Actions_Page doubleClick() throws Exception {
		Actions builder = new Actions(driver);
		Action doubleClick = builder.doubleClick(doubleClickElement).build();
		try {
			doubleClick.perform();
			System.out.println("Successfuly performed double click for element: " + doubleClickElement);
		} catch (Exception e) {
			System.out.println("Unable to perform action for: " + doubleClickElement + " elements with Exception: " + e.getMessage());
		}
		return new Actions_Page();
	}
	
	public Actions_Page checkIfDoubleClicked() throws Exception {
		
		String color = doubleClickElement.getCssValue("background-color");	
		
		assertEquals("#93CB5A", basePage.fromRGBtoHEX(color).toUpperCase());
		System.out.println("Color of button " + doubleClickElement + " turned green");
		return new Actions_Page();
	}
	
	public Actions_Page hoverOverElement(DataTable data, int row, int col) throws Exception {
		List<List<String>> elementsNames = data.raw();
		WebElement hoverOverMeElement = driver.findElement(By.xpath("//button[contains(text(),'" + elementsNames.get(row).get(col) + "')]"));
		Actions builder = new Actions(driver);
		Action hoverOverAction = builder.moveToElement(hoverOverMeElement).build();		
		
		try {
			hoverOverAction.perform();
			System.out.println("Successfuly hovered over the elements: " + hoverOverMeElement + " and ");
		} catch (Exception e) {
			System.out.println("Unable to perform action for: " + hoverOverMeElement + " elements with Exception: " + e.getMessage());
		}
		
		return new Actions_Page();
	}
	
	public Actions_Page clickLink(DataTable data, int row, int col) throws Exception {
		List<List<String>> links = data.raw();
		WebElement linkElement = driver.findElement(By.xpath("//div[@style='" + links.get(row).get(col) + "']//div//a[1]"));
		basePage.waitAndClickElement(linkElement);
		return new Actions_Page();
	}
	
	public Actions_Page pressAndHold() throws Exception {
		Actions builder = new Actions(driver);
		Action clickAndHold = builder.clickAndHold(clickBoxElement).build();
		try {
			clickAndHold.perform();
			System.out.println("Successfuly performed click and hold for element: " + clickBoxElement);
		} catch (Exception e) {
			System.out.println("Unable to perform action for: " + clickBoxElement + " elements with Exception: " + e.getMessage());
		}
		return new Actions_Page();
	} 
	
	public Actions_Page checkIfBeingHold() throws Exception {
		assertEquals(clickBoxElement.getCssValue("background").substring(0, 14), "rgb(0, 255, 0)");
		
		return new Actions_Page();
	}
	
	public Actions_Page releasePressAndHold() throws Exception {
		Actions builder = new Actions(driver);
		Action releaseClickAndHold = builder.release(clickBoxElement).build();
		try {
			Thread.sleep(1000);
			releaseClickAndHold.perform();
			System.out.println("Successfuly released click and hold for element: " + clickBoxElement);
		} catch (Exception e) {
			System.out.println("Unable to perform action for: " + clickBoxElement + " elements with Exception: " + e.getMessage());
		}
		return new Actions_Page();
	} 
	
	public Actions_Page checkIfReleased() throws Exception {
		assertEquals("rgb(255, 99, 71)", clickBoxElement.getCssValue("background").substring(0, 16));		
		return new Actions_Page();
	}
	
}
