package pageObjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodoList_Page extends BasePage{
	
	public @FindBy(xpath = "//input[@placeholder='Add new todo']") WebElement add_new_todo;

	public TodoList_Page() throws IOException {
		super();
		
	}
	
	public TodoList_Page enterItemName(String itemName) throws Exception {
		basePage.sendKeysToWebElement(add_new_todo, itemName);
		return new TodoList_Page();
	}
	
	public TodoList_Page pressEnter() throws IOException {
		driver.findElement(By.xpath("//input[@placeholder='Add new todo']")).sendKeys(Keys.ENTER);
		return new TodoList_Page();
	}
	
	public TodoList_Page checkNewItem(String newItem) throws Exception {
		
//		WebElement listItem = driver.findElement(By.xpath("//li[contains(text(),'" + newItem + "')]"));
//		assertEquals(newItem, listItem.getText());
		
		List<WebElement> itemList = driver.findElements(By.xpath("//div[@id='container']//ul/li"));
		
		for (WebElement item : itemList) {
			if (item.getText()==newItem) {
				assertEquals(newItem, item.getText());
			}
		}
		return new TodoList_Page();
	}

}
