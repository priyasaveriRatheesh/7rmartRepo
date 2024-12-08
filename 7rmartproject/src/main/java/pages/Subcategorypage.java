package pages;

import org.openqa.selenium.JavascriptExecutor;
import utilities.PageUtilities;
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
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	
	//@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[4]/div/a") private WebElement moreinfo ;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']") private WebElement newbutton;

	@FindBy(xpath="//select[@id='cat_id']") private WebElement categoryselectdropdown;
	@FindBy(xpath="//input[@id='subcategory']") private WebElement subcategoryfield;
	@FindBy(xpath="//input[@id='main_img']") private WebElement imageuploadbutton ;
	@FindBy(xpath="	//button[@type='submit']") private WebElement savebutton;
	@FindBy(xpath="//button[@name='update']") private WebElement updatebutton ;
	@FindBy(xpath="//h5[text()=' Alert!']") private WebElement alertmessage;
	
	/*public void enterUsernameOnUsernameField(String usernamepassing) {
		loginusername.sendKeys(usernamepassing);
	}
	public void enterPasswordOnPasswordField(String passwordpassing) {
		loginpassword.sendKeys(passwordpassing);
	}
	public void clickOnSigninButton() {
		loginbutton.click();
	}*/
	
	
	/*public void clickOnMoreinfobutton() {
		//moreinfo.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",moreinfo);
	}*/
	public Subcategorypage clickOnNewbutton() {
		newbutton.click();
		return this;
		
	}
	public Subcategorypage selectValueOnCateforyFieldDropdown() {
		PageUtilities pageutility=new PageUtilities();
		pageutility.selectByIndex(categoryselectdropdown, 1);
		return this;
		}
	
		public Subcategorypage EnteraSubcategory(String passingsubcategoryvalue)
		{
		subcategoryfield.sendKeys(passingsubcategoryvalue);
			return this;
	}
	/*public void imageUpload() throws AWTException {
		Waitutilities obj=new Waitutilities();
		//obj.waitForElementToBeClickable(driver, imageuploadbutton);
		//obj.waitForElementIsSelectable(driver, imageuploadbutton);
		//obj.waitForElement(driver, imageuploadbutton);
		FileUploadUtilities objfileuploadutilities=new FileUploadUtilities();
		//objfileuploadutilities.fileuploadusingSenkeys(imageuploadbutton,Constants.TOMATOIMAGE);
		objfileuploadutilities.fileuploadusingRobotclass(imageuploadbutton,Constants.TOMATOIMAGE );
			}*/
	public Subcategorypage clickOnSavebutton() {
		savebutton.click();
		return this;
	}
	public Subcategorypage clickonupdatecategorybutton()
	{
		//updatecategorybutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",updatebutton);
		return this;
	
	}
	
	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}
	
	
}
	