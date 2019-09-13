package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;

public class DropCheckRadio_Page extends BasePage{

	public DropCheckRadio_Page() throws IOException {
		super();
	}
	
	public @FindBy(id = "dropdowm-menu-1") WebElement dropdowm_menu_1;
	
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
	
	// Checkboxes methods
	public DropCheckRadio_Page checkCheckbox(DataTable data, int row, int col) throws Exception {
		List<List<String>> checkboxes = data.raw();
		WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(),'" + checkboxes.get(row).get(col) +"')]"));		
			if (!checkbox.isSelected()) {
				checkbox.click();
				System.out.println("Checkbox " + checkboxes.get(row).get(col) + " successfuly clicked.");
			} else if (checkbox.isSelected()) {
				System.out.println("Checkbox " + checkboxes.get(row).get(col) + " is already selected.");
			}
		
		return new DropCheckRadio_Page();
	}

}
