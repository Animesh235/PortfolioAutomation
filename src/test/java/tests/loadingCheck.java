package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;

public class loadingCheck extends base{

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = Browser();
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void urlLoading() {
		String name = driver.getTitle();
		String expected = "Animesh Panda";
		assertEquals(expected , name);
	}
}
