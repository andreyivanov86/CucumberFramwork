package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropCheckRadio_Page extends BasePage{

	public DropCheckRadio_Page() throws IOException {
		super();
	}
	
	public @FindBy(id = "dropdowm-menu-1") WebElement dropdown_1;
	
	public DropCheckRadio_Page getDropCheckRadioPage() throws Exception {
		getDriver().get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		return new DropCheckRadio_Page();
	}
	
	public DropCheckRadio_Page clickOnDropDownMenu(String element) throws Exception {
		basePage.waitAndClickElement(driver.findElement(By.id(element)));
		return new DropCheckRadio_Page();
	}
	
	public DropCheckRadio_Page selectItemFromList(String item) throws Exception {
		basePage.clickOnTextFromDropdownList(dropdown_1, item);
		return new DropCheckRadio_Page();
	}

}
