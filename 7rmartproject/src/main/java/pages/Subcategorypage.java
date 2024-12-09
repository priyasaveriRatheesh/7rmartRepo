package pages;

import utilities.PageUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subcategorypage {
	WebDriver driver;

	public Subcategorypage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement loginusername;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement loginpassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']")
	private WebElement newbutton;
	@FindBy(xpath = "//select[@id='cat_id']")
	private WebElement categoryselectdropdown;
	@FindBy(xpath = "//input[@id='subcategory']")
	private WebElement subcategoryfield;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement imageuploadbutton;
	@FindBy(xpath = "	//button[@type='submit']")
	private WebElement savebutton;
	@FindBy(xpath = "//button[@name='update']")
	private WebElement updatebutton;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alertmessage;

	public Subcategorypage clickOnNewbutton() {
		newbutton.click();
		return this;

	}

	public Subcategorypage selectValueOnCateforyFieldDropdown() {
		PageUtilities pageutility = new PageUtilities();
		pageutility.selectByIndex(categoryselectdropdown, 1);
		return this;
	}

	public Subcategorypage EnterSubcategory(String passingsubcategoryvalue) {
		subcategoryfield.sendKeys(passingsubcategoryvalue);
		return this;
	}

	public Subcategorypage clickOnSavebutton() {
		savebutton.click();
		return this;
	}

	public Subcategorypage clickonUpdateCategoryButton() {
		PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, updatebutton);

		return this;

	}

	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}

}
