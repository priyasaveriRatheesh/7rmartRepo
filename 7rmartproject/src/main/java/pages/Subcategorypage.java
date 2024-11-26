package pages;

import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
import utilities.FileUploadUtilities;
import utilities.Pageutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subcategorypage {
	WebDriver driver;
	public Subcategorypage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']") private WebElement moreinfobutton ;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']") private WebElement newbutton;
	@FindBy(xpath="//select[@id='cat_id']") private WebElement categoryfield;
	@FindBy(xpath="//input[@id='subcategory']") private WebElement subcategoryfield;
	@FindBy(xpath="//input[@id='main_img']") private WebElement imageuploadbutton ;
	@FindBy(xpath="	//button[@type='submit']") private WebElement savebutton;
	@FindBy(xpath="//h5[text()=' Alert!']") private WebElement alertmessage;
	
	public void enterUsernameOnUsernameField(String usernamepassing) {
		loginusername.sendKeys(usernamepassing);
	}
	public void enterPasswordOnPasswordField(String passwordpassing) {
		loginpassword.sendKeys(passwordpassing);
	}
	public void clickOnSigninButton() {
		signinbutton.click();
	}
	public void clickOnMoreinfobutton() {
		//moreinfobutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",moreinfobutton);
	}
	public void clickOnNewbutton() {
		newbutton.click();
	}
	public void selectValueOnCateforyFieldDropdown(String passingcategoryvalue) {
		Pageutilities pageutility=new Pageutilities();
		pageutility.selectByVisibleText(categoryfield, passingcategoryvalue);
	}
	public void selectValueOnSubcateforyFieldDropdown(String passingsubcategoryvalue) {
		subcategoryfield.sendKeys(passingsubcategoryvalue);
	}
	public void fileUpload() throws AWTException {
		FileUploadUtilities objfileuploadutilities=new FileUploadUtilities();
	//	objfileuploadutilities.FileuploadUsingRobotclass(imageuploadbutton, Constants);
	}
	public void clickOnSavebutton() {
		savebutton.click();
	}
	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}
	
	
}


