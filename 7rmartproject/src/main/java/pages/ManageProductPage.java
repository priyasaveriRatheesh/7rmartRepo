package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;
import utilities.Waitutilities;

public class ManageProductPage {
	WebDriver driver;

	public ManageProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']")
	private WebElement newicon;
	@FindBy(xpath = "//input[@id='title']")
	private WebElement title;
	@FindBy(xpath = "//input[@id='purpose1']")
	private WebElement pricetyperadiobutton;
	@FindBy(xpath = "//*[@id=\"p_minimum\"]")
	private WebElement piecetype;
	@FindBy(xpath = "//input[@id='p_price']")
	private WebElement price;
	@FindBy(xpath = "//input[@id='p_stock']")
	private WebElement stock;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebutton;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alertmessage;

	public ManageProductPage clickOnNewIcon() {
		newicon.click();
		return this;
	}

	public ManageProductPage enterValueOnTitleField(String titlepassing) {
		title.sendKeys(titlepassing);
		return this;
	}

	public ManageProductPage ClickOnPriceTypeRadioButton() {
		PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, pricetyperadiobutton);
		return this;

	}

	public ManageProductPage minimumPieceDropdown(int piecepassing) {
		PageUtilities Pageutilitiesobj = new PageUtilities();
		Pageutilitiesobj.selectByIndex(piecetype, 1);
		return this;
	}

	public ManageProductPage enterPrice(String pricepasssing) {
		price.sendKeys(pricepasssing);
		return this;
	}

	public ManageProductPage enterStock(String stockpasssing) {
		stock.sendKeys(stockpasssing);
		return this;
	}

	public ManageProductPage clickOnSaveButton() {
		Waitutilities waitutiliies = new Waitutilities();
		waitutiliies.waitForElementToBeClickable(driver, savebutton);

		PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, savebutton);

		return this;

	}

	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}

}
