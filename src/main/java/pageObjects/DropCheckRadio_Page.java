package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;

public class DropCheckRadio_Page extends BasePage{

	public DropCheckRadio_Page() throws IOException {
		super();
	}
	
	public DropCheckRadio_Page getDropCheckRadioPage() throws Exception {
		getDriver().get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		return new DropCheckRadio_Page();
	}
	// DropDown Menu methods
	public DropCheckRadio_Page selectItemFromList(DataTable data, int row, int column, String item) throws Exception {
		List<List<String>> dropDownElements = data.raw();
		WebElement dropDownElement = driver.findElement(By.id(dropDownElements.get(row).get(column)));		
		
		basePage.clickOnTextFromDropdownList(dropDownElement, item);
		
		return new DropCheckRadio_Page();
	}
	
	public DropCheckRadio_Page selectUnselectedAndEnabledItem(DataTable data, int row, int column, String item) throws Exception {
		List<List<String>> dropDownItems = data.raw();
		String elementValue = dropDownItems.get(row).get(column);
		WebElement dropDownListElement = driver.findElement(By.id("fruit-selects"));
		WebElement dropDownItem = driver.findElement(By.xpath("//select[@id='fruit-selects']//option[@value='"+ elementValue +"']"));
		
		System.out.println(elementValue + " Is enabled: " + dropDownItem.isEnabled() + " Is selected: " + (dropDownItem.getAttribute("selected") != null));
		
		try {
			if (dropDownItem.isEnabled() && dropDownItem.getAttribute("selected") == null) {
				basePage.clickOnTextFromDropdownList(dropDownListElement, item);
			} else if (!dropDownItem.isEnabled()) {
				System.out.println("List item " + dropDownItem + " is disabled");
			} else if (dropDownItem.getAttribute("selected") != null) {
				System.out.println("List item " + dropDownItem + " is checked");
			}
		} catch (Exception e) {
			
		}
		
		return new DropCheckRadio_Page();
	}
	
	// Checkboxes methods
	public DropCheckRadio_Page checkCheckbox(DataTable data, int row, int col) throws Exception {
		List<List<String>> checkboxes = data.raw();
		String checkbox = checkboxes.get(row).get(col);
		WebElement checkboxElement = driver.findElement(By.xpath("//label[contains(text(),'" + checkboxes.get(row).get(col) +"')]"));		
		
		System.out.println(checkbox + " Is enabled: " + checkboxElement.isEnabled() + " Is checked: " + checkboxElement.getAttribute("checked"));
		
		
		if (checkboxElement.getAttribute("checked") == null) {
			checkboxElement.click();
				System.out.println("Checkbox " + checkbox + " successfuly clicked.");
		} else if (checkboxElement.getAttribute("checked") != null) {
				System.out.println("Checkbox " + checkbox + " is already checked.");
		}
		
		return new DropCheckRadio_Page();
	}
	
	//Click on radio button methods
	public DropCheckRadio_Page clickRadioButton (DataTable data, int row, int col) throws Exception {
		List<List<String>> radioButtons = data.raw();
		String radioButton = radioButtons.get(row).get(col);
		WebElement radioButtonElement = driver.findElement(By.xpath("//form[@id='radio-buttons']//input[@value='" + radioButton + "']"));			
		
		try {
			if (radioButtonElement.isEnabled()) {
				radioButtonElement.click();
			} else {
				System.out.println("Radio button is disabled");
			}
			
		} catch (Exception e) {
			System.out.println("Unable to click radio button " + e.getMessage());
		}	
		
		return new DropCheckRadio_Page();
	}
	
	public DropCheckRadio_Page clickRadButInSelectedDisabled (DataTable data, int row, int col) throws Exception {
		List<List<String>> radioButtons = data.raw();
		String radioButton = radioButtons.get(row).get(col);
		WebElement radioButtonElement = driver.findElement(By.xpath("//form[@id='radio-buttons-selected-disabled']//input[@value='" + radioButton + "']"));
		
		try {
			if (radioButtonElement.isEnabled() && (radioButtonElement.getAttribute("checked") == null)) {
				System.out.println("Radio button " + radioButton + " is enabled and not checked. Checked now.");
				radioButtonElement.click();
			} else if (!radioButtonElement.isEnabled()){
				System.out.println("Radio button " + radioButton + " is disabled. Unable to check.");
			} else if (radioButtonElement.getAttribute("checked") != null) {
				System.out.println("Radio button " + radioButton + " is checked.");
			} 
			
		} catch (Exception e) {
			System.out.println("Unable to click radio button " + e.getMessage());
		}	
		
		return new DropCheckRadio_Page();
	}
}
