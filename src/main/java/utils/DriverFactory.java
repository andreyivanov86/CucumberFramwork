package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Accordition_Page;
import pageObjects.AjaxWait_Page;
import pageObjects.BasePage;
import pageObjects.ContactUs_Page;
import pageObjects.DropCheckRadio_Page;
import pageObjects.Login_Page;
import pageObjects.Products_Page;
import pageObjects.TodoList_Page;

public class DriverFactory {
	
	//Declaring Subpage variables
	public static WebDriver driver;
	public static BasePage basePage;
	public static ContactUs_Page contactusPage;
	public static Products_Page productsPage;
	public static Login_Page loginPage;
	public static TodoList_Page todoList;
	public static Accordition_Page accorditionPage;
	public static DropCheckRadio_Page dropCheckRadio;
	public static AjaxWait_Page ajaxWait;

	public WebDriver getDriver() {
		
		try {	
	
			//read Config
//			ReadConfigFile file = new ReadConfigFile();
//			String browserName = file.getBrowser();
			Properties properties = new Properties();
			FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
			properties.load(fileInput);
			String browserName = properties.getProperty("browser");
			
			switch(browserName) {
			
				case "firefox":
					
					if (driver == null) {
						//setup
						System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
						DesiredCapabilities capabilities = DesiredCapabilities.firefox();
							capabilities.setCapability("marionette", true);
							driver = new FirefoxDriver();
					}
					break;
				
				case "chrome":
				
					if (driver == null) {
						//setup
						System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
						//Chrome options
						driver = new ChromeDriver();
						
						
					}
					break;
			}
		}
		catch (Exception e) {
			System.out.println("Exception. Unable to load browser: " + e.getMessage());
		}
		finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			//Subpage initiation
			contactusPage = PageFactory.initElements(driver, ContactUs_Page.class);
			productsPage = PageFactory.initElements(driver, Products_Page.class);
			basePage = PageFactory.initElements(driver, BasePage.class);
			loginPage = PageFactory.initElements(driver, Login_Page.class);
			todoList = PageFactory.initElements(driver, TodoList_Page.class);
			accorditionPage = PageFactory.initElements(driver, Accordition_Page.class);
			dropCheckRadio = PageFactory.initElements(driver, DropCheckRadio_Page.class);
			ajaxWait = PageFactory.initElements(driver, AjaxWait_Page.class);
			
		}
		return driver;
	
	}

}
