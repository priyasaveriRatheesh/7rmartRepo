package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {
	WebDriver driver;

	public ManageFooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")
	private WebElement actionicon;
	@FindBy(xpath = "//textarea[@id='content']")
	private WebElement addressfield;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailfield;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phonenumbervalue;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alert;

	public ManageFooterPage clickOnActionButton() {
		actionicon.click();
		return this;
	}

	public ManageFooterPage enterAddressOnAddressField(String addresspassing) {
		addressfield.clear();

		addressfield.sendKeys(addresspassing);
		return this;
	}

	public ManageFooterPage enterEmailOnEmailField(String emailpassing) {
		emailfield.clear();
		emailfield.sendKeys(emailpassing);
		return this;
	}

	public ManageFooterPage enterThePhoneNumber(String phnnumberpassing) {
		phonenumbervalue.clear();
		phonenumbervalue.sendKeys(phnnumberpassing);
		return this;
	}

	public ManageFooterPage clickonUpdateIcon() {
		updatebutton.click();
		return this;
	}

	public boolean isUpdateButtonIsDisplayed() {
		return updatebutton.isDisplayed();

	}

	public boolean isAlertdisplayed() {
		return alert.isDisplayed();
	}
}