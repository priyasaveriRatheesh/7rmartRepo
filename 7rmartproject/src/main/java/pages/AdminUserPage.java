package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;
import utilities.Waitutilities;

public class AdminUserPage {
	WebDriver driver;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=11005&page_ad=1']")
	private WebElement updateicon;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernameupdate;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordupdate;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement usertypupdate;
	@FindBy(xpath = "//button[@name='Update']")
	private WebElement updatebutton;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alert;

	public AdminUserPage clickOnUpdateIcon() {
		Waitutilities obj = new Waitutilities();
		obj.waitForElementToBeClickable(driver, updateicon);

		PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, updateicon);
		return this;

	}

	public AdminUserPage enterUpdatedUsername(String updatedusernamepassing) {
		usernameupdate.clear();
		usernameupdate.sendKeys(updatedusernamepassing);
		return this;
	}

	public AdminUserPage updatedPassword(String updatedpasswordpassing) {
		passwordupdate.clear();
		passwordupdate.sendKeys(updatedpasswordpassing);
		return this;
	}

	public AdminUserPage clickOnUpdateDetailsButton() {
		updatebutton.click();
		return this;
	}

	public boolean isAlertDisplayed() {

		return alert.isDisplayed();
	}
}