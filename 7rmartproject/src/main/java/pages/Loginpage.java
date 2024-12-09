package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage // page class also called element repo(have methods and elements)in src main
{
	WebDriver driver;

	public Loginpage(WebDriver driver)// parametrised constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);// class pagefactory and metod initelements and parameters
		// page factory is using to inizilaze elements to driver
	}
	// WebElement
	// username=driver.findElement(By.xpath("//input[@name='username']"));
	// WebElement
	// password=driver.findElement(By.xpath("//input[@name='password']"));
	// WebElement
	// signinbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	// WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));

	@FindBy(xpath = "//input[@name='username']")
	private WebElement loginusername;// pagefactory use cheytal findby annotaions use aakkm
	@FindBy(xpath = "//input[@name='password']")
	private WebElement loginpassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	private WebElement dashboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement alert;

	public Loginpage enterUsernameOnUserNameField(String usernamevaluepassing)// avdunn pass cheyunnat store akunnat
																				// usernamevaluepassing
	{
		// webelement name is username
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