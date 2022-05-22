package StepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import PageObject.FormPageObject;
import Resources.Base;
import io.cucumber.java.en.*;

public class StepDefinition extends Base{

	public RemoteWebDriver driver;
	
	public FormPageObject fpo;
	
	@Given("navigate to site url")
	public void navigate_to_site_url() throws IOException {
	
		driver = initializeDriver();
	
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
	}
	
    @And("enter {string} into fullname field")
    public void enter_fullname_into_fullname_field(String fullname) {
    	
    	fpo = new FormPageObject(driver);
    	
    	fpo.getFullnameField().clear();
    	fpo.getFullnameField().sendKeys(fullname);
    	
    }
    
    @And("enter {string} into email field")
    public void enter_email_into_email_field(String email) {
    
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	fpo.getEmailField().clear();
    	fpo.getEmailField().sendKeys(email);
    }
    
    @And("enter {string} into currentAddress field")
    public void enter_currentAddress_into_currentAddress_field(String currentAddr) {
    
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	fpo.getCurrentAddressField().clear();
    	fpo.getCurrentAddressField().sendKeys(currentAddr);
    }
    
    @And("enter {string} into permanentAddress fied")
    public void enter_permanentAddress_into_permanentAddress_field(String permanentAddr) {
    
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	fpo.getPermanentAddressField().clear();
    	fpo.getPermanentAddressField().sendKeys(permanentAddr);
    }
    
    @Then("click on submit")
    public void click_on_submit() {
    	fpo.getSubmitButton().sendKeys(Keys.ENTER);
    	driver.quit();
    }	
}
