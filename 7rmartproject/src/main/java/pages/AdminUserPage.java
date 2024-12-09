package pages;

import org.openqa.selenium.JavascriptExecutor;
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

	/*
	 * @FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	 * 
	 * @FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	 * 
	 * @FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	 */
	// @FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div[1]/div/a")private
	// WebElement moreinfo;
	// @FindBy(xpath="/html/body/div/div[1]/section/div[2]/div/div[3]/div[2]/table/tbody/tr[17]/td[5]/a[2]")private
	// WebElement updateicon;
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

	/*
	 * public void enterUsernameOnUserNameField(String usernamevaluepassing) {
	 * loginusername.sendKeys(usernamevaluepassing); } public void
	 * enterPasswordOnpasswordField(String passwordvaluepassing) {
	 * loginpassword.sendKeys(passwordvaluepassing); } public void
	 * clickOnLoginbutton() { loginbutton.click(); }
	 */// no need?

	/*
	 * public void clickonmoreinfo() { // moreinfo.click(); JavascriptExecutor
	 * js=(JavascriptExecutor)driver;
	 * js.executeScript("arguments[0].click();",moreinfo);
	 * 
	 * }
	 */
	public AdminUserPage clickOnUpdateIcon() {
		Waitutilities obj = new Waitutilities();
		obj.waitForElementToBeClickable(driver, updateicon);

		// updateicon.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", updateicon);
		/*PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, updateicon);*/
			return this;// return this page

	}

	public AdminUserPage enterUpdatedUsername(String updatedusernamepassing) {
		usernameupdate.clear();// to clear the field
		usernameupdate.sendKeys(updatedusernamepassing);
		return this;
	}

	public AdminUserPage updatedPassword(String updatedpasswordpassing) {
		passwordupdate.clear();
		passwordupdate.sendKeys(updatedpasswordpassing);
		return this;
	}

	/*
	 * public AdminUserPage selectupdatedusertype() { //Select select=new
	 * Select(usertypeupdate); //select.selectByValue(passingusertypevalue);
	 * PageUtilities pageutility=new PageUtilities();
	 * pageutility.selectByIndex(usertypupdate, 1); return this;
	 * 
	 * }
	 */
	public AdminUserPage clickOnUpdateDetailsButton() {
		updatebutton.click();
		return this;
	}

	public boolean isAlertDisplayed() {

		return alert.isDisplayed();
	}
}