package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// class pagefactory and metod initelements and parameters
		// page factory is using to inizilaze elements to driver
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement loginusername;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement loginpassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	private WebElement dashboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement alert;

	public Loginpage enterUsernameOnUserNameField(String usernamevaluepassing) {
		loginusername.sendKeys(usernamevaluepassing);
		return this;
	}

	public Loginpage enterPasswordOnpasswordField(String passwordvaluepassing) {
		loginpassword.sendKeys(passwordvaluepassing);
		return this;
	}

	public HomePage clickOnLoginbutton() {
		loginbutton.click();
		return new HomePage(driver);
	}

	public boolean isHomePageDisplayed() {
		return dashboard.isDisplayed();
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}