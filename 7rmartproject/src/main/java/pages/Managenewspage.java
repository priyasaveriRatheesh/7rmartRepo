package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managenewspage {
	WebDriver driver;

	public Managenewspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement loginusername;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement loginpassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/delete?del=2072&page_ad=1']")
	private WebElement deleteicon;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")
	private WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']")
	private WebElement newsfield;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alert;

	public Managenewspage clickOnDeleteButton() {
		deleteicon.click();
		driver.switchTo().alert().accept();
		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();

	}

	public Managenewspage clickOnNewButton() {
		newbutton.click();
		return this;
	}

	public Managenewspage enterTheNews(String news) {
		newsfield.sendKeys(news);
		return this;
	}

	public Managenewspage clickOnSaveButton() {
		savebutton.click();
		return this;
	}

	public boolean isAlertMessageDisplayed() {
		return alert.isDisplayed();
	}
}
