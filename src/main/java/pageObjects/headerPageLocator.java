package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class headerPageLocator {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='about']")
    WebElement about;

    @FindBy(xpath="//a[text()='education']")
    WebElement education;

    @FindBy(xpath="//a[text()='experience']")
    WebElement experience;

    @FindBy(xpath="//a[text()='portfolio']")
    WebElement portfolio;

    @FindBy(xpath="//a[text()='skills']")
    WebElement skills;

    public headerPageLocator(WebDriver driver) {
        this.driver = driver;
        // Initialize WebElements with PageFactory
        PageFactory.initElements(driver, this);
    }
    
    public void clickAbout() {
        about.click();
    }

    public void clickEducation() {
        education.click();
    }

    public void clickExperience() {
        experience.click();
    }

    public void clickPortfolio() {
        portfolio.click();
    }

    public void clickSkills() {
        skills.click();
    }	

}
