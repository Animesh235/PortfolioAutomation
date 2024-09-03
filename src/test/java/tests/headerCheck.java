package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import pageObjects.headerPageLocator;

public class headerCheck extends base {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = Browser();
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	@Test(priority = 2)
	public void headerOptionsClickEvent() {
		headerPageLocator header = new headerPageLocator(driver);
		header.clickAbout();
        Assert.assertTrue(driver.getCurrentUrl().contains("#home"), "URL does not contain #home after clicking About");

        header.clickEducation();
        Assert.assertTrue(driver.getCurrentUrl().contains("#education"), "URL does not contain #education after clicking Education");

        header.clickExperience();
        Assert.assertTrue(driver.getCurrentUrl().contains("#experience"), "URL does not contain #experience after clicking Experience");

        header.clickPortfolio();
        Assert.assertTrue(driver.getCurrentUrl().contains("#portfolio"), "URL does not contain #portfolio after clicking Portfolio");

        header.clickSkills();
        Assert.assertTrue(driver.getCurrentUrl().contains("#skills"), "URL does not contain #skills after clicking Skills");
	}
	
}
