package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {
	WebDriver driver;
	public ManageFooterPage(WebDriver driver)
	{
    this.driver=driver;
    PageFactory.initElements(driver,this);}
	/*@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;*/
	
	//@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[10]/div/a") private WebElement moreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']") private WebElement actionicon;
	@FindBy(xpath="//textarea[@id='content']") private WebElement addressfield;
	@FindBy(xpath="//input[@id='email']") private WebElement emailfield;
	@FindBy(xpath="//input[@id='phone']") private WebElement phonenumbervalue;
	@FindBy(xpath="//button[@type='submit']") private WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement alert;

	
	/*public void enterUsernameOnUserNameField(String usernamevaluepassing)
	{
		loginusername.sendKeys(usernamevaluepassing);

	}
	public void enterPasswordOnpasswordField(String passwordvaluepassing)
	{
		loginpassword.sendKeys(passwordvaluepassing);

	}
	public void clickOnLoginbutton()
	{
		loginbutton.click();

		}
*/

	/*public void clickonmoreinfobutton()
	{
		moreinfo.click();
	}*/
public ManageFooterPage clickonactionbutton()
{
	actionicon.click();
	return this;
}
public ManageFooterPage enteraddressOnAddressfield(String addresspassing)
{
	addressfield.clear();

	addressfield.sendKeys(addresspassing);
	return this;
}
public ManageFooterPage enterEmailOnEmailField(String emailpassing)
{
	emailfield.clear();
	emailfield.sendKeys(emailpassing);
	return this;
}
public ManageFooterPage enterThePhoneNumber(String phnnumberpassing)
{
	phonenumbervalue.clear();
	phonenumbervalue.sendKeys(phnnumberpassing);
	return this;
}
public ManageFooterPage clickonupdateIcon()
{
	updatebutton.click();
	return this;
}
public boolean isupdatebuttonIsDisplayed()
{
	return updatebutton.isDisplayed();
	
}
public boolean isalertdisplayed()
{
	return alert.isDisplayed();
}
}