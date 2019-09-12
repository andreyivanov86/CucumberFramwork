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
	
	public DropCheckRadio_Page selectItemFromList(DataTable data, int row, int column, String item) throws Exception {
		List<List<String>> dropDownElements = data.raw();
		WebElement dropDownElement = driver.findElement(By.id(dropDownElements.get(row).get(column)));
		basePage.clickOnTextFromDropdownList(dropDownElement, item);
		Thread.sleep(1000);
		
		return new DropCheckRadio_Page();
	}
	
	public DropCheckRadio_Page checkSelectedItem(String item) throws Exception {
		
		return new DropCheckRadio_Page();
	}
	
	

}
