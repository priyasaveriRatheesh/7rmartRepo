package pages;
import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtilities;
import utilities.Pageutilities;

public class ManageProductPage {
	WebDriver driver;
	public ManageProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	
	/*@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']") private WebElement moreinfobutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']") private WebElement newicon;
	@FindBy(xpath="//input[@placeholder='Enter the Title']") private WebElement title;
	@FindBy(xpath="//input[@value='Nonveg']") private WebElement producttyperadiobutton;
	@FindBy(xpath="//input[@placeholder='Enter the Tag']") private WebElement tag;
	@FindBy(xpath="//select[@id='cat_id']") private WebElement category;
	@FindBy(xpath="//select[@id='sub_id']") private WebElement subcategory;
	@FindBy(xpath="//select[@id='grp_id']") private WebElement group;
	@FindBy(xpath="//input[@id='purpose']") private WebElement pricetype;
	@FindBy(xpath="//input[@placeholder='Enter the Weight Value']") private WebElement weightvalue;
	@FindBy(xpath="//input[@placeholder='Enter the Weight Value']") private WebElement weightunit;
	@FindBy(xpath="//span[@placeholder='Enter the Maximum Quantity']") private WebElement maximumorder;
	@FindBy(xpath="//input[@name='w_price']") private WebElement price;
	@FindBy(xpath="//input[@name='w_mrp']") private WebElement mrp;
	@FindBy(xpath="//input[@name='w_stock']") private WebElement stock ;
	@FindBy(xpath="//input[@id='w_pp']") private WebElement purchase ;
	@FindBy(xpath="//input[@name='unlimitw[]']") private WebElement unlimitedstockceckbox ;
	@FindBy(xpath="//div[@contenteditable='true']") private WebElement description ;
	@FindBy(xpath="//input[@id='main_img']") private WebElement image ;
	@FindBy(xpath="//input[@id='main_imgs']") private WebElement subimage ;
	@FindBy(xpath="//button[@type='submit']") private WebElement save ;

	
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
		moreinfobutton.click();
	}
	public void clickOnNewIcon() {
		newicon.click();
	}
	public void enterATitle(String titlepassing) {
		title.sendKeys(titlepassing);
	}
	
	public void selectAproductType()
	{
		producttyperadiobutton.isSelected();
		
	}
	public void entertag()
	{
		tag.sendKeys();
	}
	public void selectAcategory() 
	{
		//String value=category.selectByValue();
		
	}
	public void SelectSubCategory()
	{
		
	}
	public void SelectGroup()
	{
		
	}
	public void SelectPriceType()
	{
		
	}
	public void SelectWeightValue()
	{
		
	}
	public void SelectWeightUnit()
	{
		
	}
	public void SelectMaximumQuantityCanOrder()
	{
		
	}
	public void selectPrice()
	{
		
	}
	public void selectMrp()
	{
		
	}
	public void StockAvailability()
	{
		
	}
	public void purchasePrice()
	{
		
	}
	public void CheckboxUnlimited()
	{
		
	}
	public void Descriptionbox()
	{
		
	}
	public void choseradiobuttonstock()
	{
		
	}
	public void uploadimage()
	{
		
	}
	public void uploadsubimage()
	{
		
	}
	public void featuredradiobutton()
	{
		
	}
	public void combopackradiobutton()
	{
		
	}
	public void savebutton()
	{
		
	}
	public void fileUpload() throws AWTException {
		
		FileUploadUtilities fileuploadutilities=new FileUploadUtilities();
		//fileuploadutilities.FileuploadUsingRobotclass(uploadimagebutton, Constants.IMAGE);
	}
	//we cannot do this test as some mandatory fields are not inspectable - website issue- not even possible in manual testing
	public void clickOnloginButton() {
		// TODO Auto-generated method stub
		
	}
	
}*/

 @FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']") private WebElement moreinfobutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']") private WebElement newicon;
	@FindBy(xpath="//input[@id='title']") private WebElement title;
	@FindBy(xpath="//input[@id='main_img']") private WebElement uploadimagebutton; 
	@FindBy(xpath="//input[@name='featured' and @value='yes']") private WebElement featuredradio;
	@FindBy(xpath="//button[@type='submit']") private WebElement savebutton;
	@FindBy(xpath="//input[@id='m_weight']") private WebElement weightvaluefield;
	@FindBy(xpath="//select[@id='w_unit']") private WebElement weightunitdropdown;
	@FindBy(xpath="//input[@id='max_weight']") private WebElement maxquantityfield;
	@FindBy(xpath="//input[@id='w_price']") private WebElement price ;
	@FindBy(xpath="//input[@id='w_stock']") private WebElement stock;
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
	public void clickOnMoreinfoButton() {
		//moreinfobutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",moreinfobutton);
	}
	public void clickOnNewIcon() {
		newicon.click();
	}
	public void enterValueOnTitleField(String titlepassing) {
		title.sendKeys(titlepassing);
	}
	public void enterValueOnWeightvalueField(String weightvaluepassing) {
		weightvaluefield.sendKeys(weightvaluepassing);
	}
	public void selectWeightunitDropdownValue(String weightunitpassing) {
		Pageutilities pageutility=new Pageutilities();
		pageutility.selectByValue(weightunitdropdown, weightunitpassing);
	}
	public void enterValueOnMaxQuantityField(String maxqtypassing) {
		maxquantityfield.sendKeys(maxqtypassing);
	}
	public void enterPrice(String pricepasssing) {
		price.sendKeys(pricepasssing);
	}
	public void enterStock(String stockpasssing) {
		stock.sendKeys(stockpasssing);
	}
	public void fileUpload() throws AWTException {
		FileUploadUtilities fileuploadutilities=new FileUploadUtilities();
		//fileuploadutilities.FileuploadUsingRobotclass(uploadimagebutton, Constants.APPLE_IMAGE);
	}
	public void selectFeaturedRadiobutton() {
		featuredradio.click();
	}
	public void clickOnSavebutton() {
		savebutton.click();
	}
	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}
	public void clickOnloginbutton() {
		// TODO Auto-generated method stub
		
	}
	
}



