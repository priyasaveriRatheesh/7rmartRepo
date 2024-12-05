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
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']") private WebElement moreinfobutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']") private WebElement newicon;
	@FindBy(xpath="//input[@id='title']") private WebElement title;
	@FindBy(xpath="//input[@value='Nonveg']") private WebElement producttyperadiobutton;
	@FindBy(xpath="//input[@placeholder='Enter the Tag']") private WebElement tag;	
	@FindBy(xpath="//select[@id='grp_id']") private WebElement group;
	@FindBy(xpath="//input[@id='purpose1']") private WebElement pricetyperadiobutton;
	@FindBy(xpath="//*[@id=\"p_minimum\"]") private WebElement piecetype;
	@FindBy(xpath="//input[@name='p_max']") private WebElement max;
	@FindBy(xpath="//input[@id='p_price']") private WebElement price ;
	@FindBy(xpath="//input[@id='p_mrp']") private WebElement mrp;
	@FindBy(xpath="//input[@id='p_stock']") private WebElement stock;
	@FindBy(xpath="//input[@id='p_pp']") private WebElement purchase ;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[9]/div/div/div/div[3]/div[2]") private WebElement description ;
	@FindBy(xpath="(//input[@name='stock'])[2]") private WebElement stockradioButton ;
	@FindBy(xpath="//button[@type='submit']") private WebElement savebutton ;
	@FindBy(xpath="//h5[text()=' Alert!']") private WebElement alertmessage;

	
	public void enterUsernameOnUsernameField(String usernamepassing) {
		loginusername.sendKeys(usernamepassing);
	}
	public void enterPasswordOnPasswordField(String passwordpassing) {
		loginpassword.sendKeys(passwordpassing);
	}
	public void clickOnLoginButton() {
		loginbutton.click();
	}
			
	public void clickOnMoreinfoButton() {
		moreinfobutton.click();//both are  working
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();",moreinfobutton);
	}
	public void clickOnNewIcon() 
	{
		newicon.click();
	}
	public void enterValueOnTitleField(String titlepassing) 
	{
		title.sendKeys(titlepassing);
	}
	public void SelectAprodutTypeRadioButton()
	{
		producttyperadiobutton.click();
	}
	public void enterValueOnTagfield(String tagpassing)
	{
		tag.sendKeys(tagpassing);
	}
	
	public void SelectGroup(int grouppassing)
	{
		PageUtilities Pageutilitiesobj =new PageUtilities();
		Pageutilitiesobj.selectByIndex(group, grouppassing);
	}
	public void ClickOnPriceTypeRadioButton()
	{
		//pricetyperadiobutton.click();
		PageUtilities pageutilities=new PageUtilities();
		pageutilities.javaSriptClick(driver, pricetyperadiobutton);
		
	}
	
	public void minimumpiecedropdown(int piecepassing)
	{
		PageUtilities Pageutilitiesobj =new PageUtilities();
		Pageutilitiesobj.selectByIndex(piecetype, piecepassing);
		}
	
	public void EnterTheMaximumQuantityCanOrder(String maxQuantitytypassing)
	{
		max.sendKeys(maxQuantitytypassing);
	}
	
	public void enterPrice(String pricepasssing) {
		price.sendKeys(pricepasssing);
	}
	
	public void enterTheMrpValue(String mrpPassing)
	{
	mrp.sendKeys(mrpPassing);
	}
	public void enterStock(String stockpasssing)
	{
		stock.sendKeys(stockpasssing);
	}
	public void enterthePurchasePrice(String pppassing)
	{
		purchase.sendKeys(pppassing);
	}
	public void addDescription(String descrptonvalpassing)
	{
		description.sendKeys(descrptonvalpassing);
	}
	public void clickOnStockRadioButton(String buttonpassing)
	{
		//stockradioButton.click();
		Waitutilities obj=new Waitutilities();
		//obj.waitForElement(driver, stockradioButton);
		obj.waitForElementToBeClickable(driver,stockradioButton );
		PageUtilities pageutilities=new PageUtilities();
		pageutilities.javaSriptClick(driver, stockradioButton);
		
	}  
		public void clickOnSavebutton() {
		Waitutilities waitutiliies=new Waitutilities();
		waitutiliies.waitForElementToBeClickable(driver, savebutton);
	   
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",savebutton);
		
		//savebutton.click();
	}
	public boolean isAlertMessageDisplayed()
	{
		return alertmessage.isDisplayed();
	}
	
}

