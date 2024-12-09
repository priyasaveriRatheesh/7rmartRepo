package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {
	WebDriver driver;

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement loginusername;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement loginpassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;

	// @FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-contact']")
	// private WebElement moreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")
	private WebElement actionicon;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phnnumber;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath = "//textarea[@placeholder='Enter Delivery Time']")
	private WebElement deliverytime;
	@FindBy(xpath = "//input[@id='del_limit']")
	private WebElement deliverycharge;
	@FindBy(xpath = "//button[@name='Update']")
	private WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alert;

	/*
	 * public void enterUsernameOnUserNameField(String usernamevaluepassing) {
	 * loginusername.sendKeys(usernamevaluepassing);
	 * 
	 * } public void enterPasswordOnpasswordField(String passwordvaluepassing) {
	 * loginpassword.sendKeys(passwordvaluepassing);
	 * 
	 * } public void clickOnLoginbutton() { loginbutton.click();
	 * 
	 * }
	 */

	/*
	 * public void clickonmoreinfobutton() { JavascriptExecutor js =
	 * (JavascriptExecutor) driver;
	 * js.executeScript("arguments[0].click();",moreinfo); //moreinfo.click(); }
	 */
	public ManageContactPage clickOnActionButton() {
		actionicon.click();
		return this;
	}

	public ManageContactPage enterTheValueInPhoneNumberField(String phnnumpassing) {
		phnnumber.clear();
		phnnumber.sendKeys(phnnumpassing);
		return this;
	}

	public ManageContactPage enterTheValueInEmailField(String emailpassing) {
		email.clear();
		email.sendKeys(emailpassing);
		return this;
	}

	public ManageContactPage enterTheAddress(String adresspassing) {
		address.clear();
		address.sendKeys(adresspassing);
		return this;
	}

	public ManageContactPage enterTheDeliveryTime(String deleverytimepassing) {
		deliverytime.clear();
		deliverytime.sendKeys(deleverytimepassing);
		return this;
	}

	public ManageContactPage enterTheDeliveryCharge(String deliverychargepassing) {
		deliverycharge.clear();
		deliverycharge.sendKeys(deliverychargepassing);
		return this;
	}

	public boolean isupdateButtonIsDisplayed() {
		return updatebutton.isDisplayed();
	}

	public ManageContactPage clickOnUpdateButton() {
		// updatebutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", updatebutton);
		/*PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, updatebutton);*/
		
		// return updatebutton.isDisplayed();
		return this;

	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}