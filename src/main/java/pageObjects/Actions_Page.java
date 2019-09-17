package pageObjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Actions_Page extends BasePage{

	public Actions_Page() throws IOException {
		super();
	}
	
	public @FindBy(id = "draggable") WebElement dragMeElement;
	public @FindBy(id = "droppable") WebElement dropHereElement;
	public @FindBy(id = "double-click") WebElement doubleClickElement;
	
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
		String color_hex[];  
		color_hex = color.replace("rgba(", "").split(",");       
		String actual_hex = String.format("#%02x%02x%02x", Integer.parseInt(color_hex[0].trim()), Integer.parseInt(color_hex[1].trim()), Integer.parseInt(color_hex[2].trim()));  
		
		assertEquals("#93CB5A", actual_hex.toUpperCase());
		System.out.println("Color of button " + doubleClickElement + " turned green");
		return new Actions_Page();
	}
	

}
