package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import utilities.FileUploadUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;

public class Subcategorypage {
	WebDriver driver;
	public Subcategorypage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[4]/div/a") private WebElement moreinfo ;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']") private WebElement newbutton;
	@FindBy(xpath="//select[@id='cat_id']") private WebElement categoryselectdropdown;
	@FindBy(xpath="//input[@id='subcategory']") private WebElement subcategoryfield;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/edit?edit=1540&page_ad=1']") private WebElement updatecategorybutton;
	@FindBy(xpath="//input[@id='main_img']") private WebElement imageuploadbutton ;
	@FindBy(xpath="	//button[@type='submit']") private WebElement savebutton;
	@FindBy(xpath="//button[@name='update']") private WebElement updatebutton ;
	@FindBy(xpath="//h5[text()=' Alert!']") private WebElement alertmessage;
	
	public void enterUsernameOnUsernameField(String usernamepassing) {
		loginusername.sendKeys(usernamepassing);
	}
	public void enterPasswordOnPasswordField(String passwordpassing) {
		loginpassword.sendKeys(passwordpassing);
	}
	public void clickOnSigninButton() {
		loginbutton.click();
	}
	
	
	public void clickOnMoreinfobutton() {
		//moreinfo.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",moreinfo);
	}
	public void clickOnNewbutton() {
		newbutton.click();
		
	}
	public void clickonupdatecategorybutton()
	{
		//updatecategorybutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",updatecategorybutton);
	
	}
	public void selectaCategoryFromDropdown(String passingcategoryvalue) {
		//Pageutilities pageutility=new Pageutilities();
		//pageutility.selectByVisibleText(categoryfield, passingcategoryvalue);
		//pageutility.selectByIndex(categoryfield, 1);
		Select selectobj=new Select(categoryselectdropdown);
		selectobj.selectByIndex(7);

	}
	public void EnteraSubcategory(String passingsubcategoryvalue) {
		subcategoryfield.sendKeys(passingsubcategoryvalue);
	}
	public void fileUpload() throws AWTException {
		FileUploadUtilities objfileuploadutilities=new FileUploadUtilities();
		objfileuploadutilities.fileuploadusingSenkeys(imageuploadbutton,Constants.TOMATOIMAGE);

		//objfileuploadutilities.fileuploadusingRobotclass(imageuploadbutton, Constants.TOMATOIMAGE);
		//objfileuploadutilities.fileuploadusingRobotclass(imageuploadbutton, Constants.TOMATOIMAGE);
			
	}
	public void clickOnSavebutton() {
		savebutton.click();
	}
	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}
	
	
}


