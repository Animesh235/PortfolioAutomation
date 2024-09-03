package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.tutorialsninja.qa.utils.String;

public class utilities {
	
	Properties prop;
	
	public static Properties loadFile() {
		
		Properties prop = null;
		
		try {
			prop = new Properties();
			File propFile = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\Properties\\config.properties");
			FileReader fr = new FileReader(propFile);
			prop.load(fr);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	public static String captureScreenshot(WebDriver driver,String testName) {
		
		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
		
		try {
			FileHandler.copy(srcScreenshot,new File(destinationScreenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return destinationScreenshotPath;
	}

}
