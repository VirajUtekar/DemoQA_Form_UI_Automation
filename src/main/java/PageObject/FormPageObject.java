package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FormPageObject {

	public RemoteWebDriver driver;
	
	
	// Web-Element Address 
	
	private By fullNameField = By.cssSelector("div#app > div > div > div:nth-Child(2) > div:nth-Child(2) > div:nth-Child(2) > form > div:nth-Child(1) > div:nth-Child(2) > input");
	
	private By emailField = By.cssSelector("div#app > div > div > div:nth-Child(2) > div:nth-Child(2) > div:nth-Child(2) > form > div:nth-Child(2) > div:nth-Child(2) > input");
	
	private By currentAddr = By.cssSelector("div#app > div > div > div:nth-Child(2) > div:nth-Child(2) > div:nth-Child(2) > form > div:nth-Child(3) > div:nth-Child(2) > textarea");
	
	private By permanentAddr = By.cssSelector("div#app > div > div > div:nth-Child(2) > div:nth-Child(2) > div:nth-Child(2) > form > div:nth-Child(4) > div:nth-Child(2) > textarea");
	
	private By submit = By.cssSelector("div#app > div > div > div:nth-Child(2) > div:nth-Child(2) > div:nth-Child(2) > form > div:nth-Child(5) > div > button#submit");
	
	
	public FormPageObject(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getFullnameField() {
		return driver.findElement(fullNameField);
	}
	
	public WebElement getEmailField() {
		return driver.findElement(emailField);
	}
	
	public WebElement getCurrentAddressField() {
		return driver.findElement(currentAddr);
	}
	
	public WebElement getPermanentAddressField() {
		return driver.findElement(permanentAddr);
	}
	
	public WebElement getSubmitButton() {
		return driver.findElement(submit);
	}

}
