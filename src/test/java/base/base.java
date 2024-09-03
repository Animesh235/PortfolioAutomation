package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utils.utilities;

public class base {
	
	WebDriver driver;
	Properties prop;
	ChromeOptions options;
	
	public WebDriver Browser() {
		
		options = new ChromeOptions();
		options.addArguments("-headless");
		driver = new ChromeDriver(options);

		prop = utilities.loadFile();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.get(prop.getProperty("url"));
		
		return driver;		
	}
	
}