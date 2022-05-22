package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {

	public RemoteWebDriver driver;
	
	public Properties prop;
	
	public RemoteWebDriver initializeDriver() throws IOException {
		
		String file = System.getProperty("user.dir")+"/src/main/java/Resources/data.properties";
		
		FileInputStream fis = new FileInputStream(file);
		
		prop = new Properties();
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName(prop.getProperty("platformName"));
			browserOptions.setBrowserVersion(prop.getProperty("version"));
			Map<String, Object> sauceOptions = new HashMap<>();
			browserOptions.setCapability("sauce:options", sauceOptions);

			URL url = new URL("https://oauth-utekar1304viraj-1ccae:c09b58c3-3801-4842-a198-87e319867f42@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		    driver = new RemoteWebDriver(url, browserOptions);
			
		}
		else
		{
		   System.out.println("no chrome driver found");	
		}		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
}
