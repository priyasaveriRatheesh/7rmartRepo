package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@class='img-circle']")
	private WebElement profileicon;
	@FindBy(css = "a.dropdown-item[href='https://groceryapp.uniqassosiates.com/admin/logout']")
	private WebElement logout;
	@FindBy(xpath = "//p[text()='Sign in to start your session']")
	private WebElement signinpagedisplay;

	@FindBy(xpath = "a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	private WebElement adminusermoreinfo;
	@FindBy(css = "a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-contact']")
	private WebElement contactmoreinfo;
	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div[10]/div/a")
	private WebElement footermoreinfo;
	@FindBy(css = "a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	private WebElement newsmoreinfo;
	@FindBy(css = "a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']")
	private WebElement productmoreinfobutton;

	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div[4]/div/a")
	private WebElement subcategorymoreinfo;

	public AdminUserPage clickOnMoreInfoAdminuserPage() {
		//PageUtilities pageutilities = new PageUtilities();
		//pageutilities.javaSriptClick(driver, adminusermoreinfo);
		 adminusermoreinfo.click();
		return new AdminUserPage(driver);

	}

	public ManageContactPage clickOnMoreInfoButtonContactPage() {
		PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, contactmoreinfo);
		return new ManageContactPage(driver);

	}

	public ManageFooterPage clickOnMoreInfoButtonFooter() {
		footermoreinfo.click();
		return new ManageFooterPage(driver);
	}

	public Managenewspage clickOnMoreInfoButtonNews() {
		// newsmoreinfo.click();
		PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, newsmoreinfo);

		return new Managenewspage(driver);

	}

	public ManageProductPage clickOnMoreInfoButtonproduct() {
		// productmoreinfobutton.click();//both are working
		PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, productmoreinfobutton);

		return new ManageProductPage(driver);
	}

	public Subcategorypage clickOnMoreInfoButtonSubcategory() {
		// subcategorymoreinfo.click();
		PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, subcategorymoreinfo);

		return new Subcategorypage(driver);
	}

	public void clickOnTheProfileIcon() {
		profileicon.click();
	}

	public void ClickOnTheLogOutButton() {
		logout.click();
	}

	public boolean isSigninButtonDisplayed() {
		return signinpagedisplay.isDisplayed();

	}
}
