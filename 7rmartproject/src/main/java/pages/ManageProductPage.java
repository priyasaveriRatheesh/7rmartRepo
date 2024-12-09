package pages;

import org.openqa.selenium.JavascriptExecutor;
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
	/*
	 * @FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	 * 
	 * @FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	 * 
	 * @FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	 */

	// @FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']")
	// private WebElement moreinfobutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']")
	private WebElement newicon;
	@FindBy(xpath = "//input[@id='title']")
	private WebElement title;
//	@FindBy(xpath="//input[@value='Nonveg']") private WebElement producttyperadiobutton;
	// @FindBy(xpath="//input[@placeholder='Enter the Tag']") private WebElement
	// tag;
	// @FindBy(xpath="//select[@id='grp_id']") private WebElement group;
	@FindBy(xpath = "//input[@id='purpose1']")
	private WebElement pricetyperadiobutton;
	@FindBy(xpath = "//*[@id=\"p_minimum\"]")
	private WebElement piecetype;
	// @FindBy(xpath="//input[@name='p_max']") private WebElement max;
	@FindBy(xpath = "//input[@id='p_price']")
	private WebElement price;
	// @FindBy(xpath="//input[@id='p_mrp']") private WebElement mrp;
	@FindBy(xpath = "//input[@id='p_stock']")
	private WebElement stock;
	// @FindBy(xpath="//input[@id='p_pp']") private WebElement purchase ;
	// @FindBy(xpath="//*[@id=\"form\"]/div/div[9]/div/div/div/div[3]/div[2]")
	// private WebElement description ;
	// @FindBy(xpath="(//input[@name='stock'])[2]") private WebElement
	// stockradioButton ;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebutton;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alertmessage;

	/*
	 * public void enterUsernameOnUsernameField(String usernamepassing) {
	 * loginusername.sendKeys(usernamepassing); } public void
	 * enterPasswordOnPasswordField(String passwordpassing) {
	 * loginpassword.sendKeys(passwordpassing); } public void clickOnLoginButton() {
	 * loginbutton.click(); }
	 */
	/*
	 * public void clickOnMoreinfoButton() { moreinfobutton.click();//both are
	 * working //JavascriptExecutor js = (JavascriptExecutor) driver;
	 * //js.executeScript("arguments[0].click();",moreinfobutton); }
	 */
	public ManageProductPage clickOnNewIcon() {
		newicon.click();
		return this;
	}

	public ManageProductPage enterValueOnTitleField(String titlepassing) {
		title.sendKeys(titlepassing);
		return this;
	}

	/*
	 * public ManageProductPage SelectAprodutTypeRadioButton() {
	 * producttyperadiobutton.click(); return this; } public ManageProductPage
	 * enterValueOnTagfield(String tagpassing) { tag.sendKeys(tagpassing); return
	 * this; }
	 * 
	 * public ManageProductPage SelectGroup(String grouppassing) { PageUtilities
	 * Pageutilitiesobj =new PageUtilities(); Pageutilitiesobj.selectByValue(group,
	 * grouppassing); return this; }
	 */
	public ManageProductPage ClickOnPriceTypeRadioButton() {
		// pricetyperadiobutton.click();
		PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver, pricetyperadiobutton);
		return this;

	}

	public ManageProductPage minimumPieceDropdown(int piecepassing) {
		PageUtilities Pageutilitiesobj = new PageUtilities();
		Pageutilitiesobj.selectByIndex(piecetype, 1);
		return this;
	}

	/*
	 * public ManageProductPage EnterTheMaximumQuantityCanOrder(String
	 * maxQuantitytypassing) { max.sendKeys(maxQuantitytypassing); return this; }
	 */

	public ManageProductPage enterPrice(String pricepasssing) {
		price.sendKeys(pricepasssing);
		return this;
	}

	/*
	 * public ManageProductPage enterTheMrpValue(String mrpPassing) {
	 * mrp.sendKeys(mrpPassing); return this; }
	 */
	public ManageProductPage enterStock(String stockpasssing) {
		stock.sendKeys(stockpasssing);
		return this;
	}

	/*
	 * public ManageProductPage enterthePurchasePrice(String pppassing) {
	 * purchase.sendKeys(pppassing); return this; } public ManageProductPage
	 * addDescription(String descrptonvalpassing) {
	 * description.sendKeys(descrptonvalpassing); return this; } public
	 * ManageProductPage clickOnStockRadioButton(String buttonpassing) {
	 * stockradioButton.click(); Waitutilities obj=new Waitutilities();
	 * obj.waitForElementToBeClickable(driver,stockradioButton ); //PageUtilities
	 * pageutilities=new PageUtilities(); //pageutilities.javaSriptClick(driver,
	 * stockradioButton); //JavascriptExecutor js = (JavascriptExecutor) driver;
	 * //js.executeScript("arguments[0].click();",savebutton);
	 * 
	 * return this;
	 * 
	 * }
	 */
	public ManageProductPage clickOnSaveButton() {
		Waitutilities waitutiliies = new Waitutilities();
		waitutiliies.waitForElementToBeClickable(driver, savebutton);

		// savebutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", savebutton);
		/*PageUtilities pageutilities = new PageUtilities();
		pageutilities.javaSriptClick(driver,savebutton);*/
		
		return this;

	}

	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}

}
