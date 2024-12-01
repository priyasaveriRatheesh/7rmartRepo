package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {
	WebDriver driver;
	public ManageContactPage(WebDriver driver)
	{
    this.driver=driver;
    PageFactory.initElements(driver,this);}
	@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-contact']") private WebElement moreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']") private WebElement actionicon;
	@FindBy(xpath="//input[@id='phone']") private WebElement phnnumber ;
	@FindBy(xpath="//input[@id='email']") private WebElement email ;
	@FindBy(xpath="//textarea[@name='address']") private WebElement address;
	@FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']") private WebElement deliverytime;
	@FindBy(xpath="//input[@id='del_limit']") private WebElement deliverycharge ;
	@FindBy(xpath="//button[@name='Update']") private WebElement updatebutton ;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement alert ;


	public void enterUsernameOnUserNameField(String usernamevaluepassing)
	{
		loginusername.sendKeys(usernamevaluepassing);

	}
	public void enterPasswordOnpasswordField(String passwordvaluepassing)
	{
		loginpassword.sendKeys(passwordvaluepassing);

	}
	public void clickOnLoginbutton()
	{
		loginbutton.click();

	}

	

	public void clickonmoreinfobutton()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",moreinfo);
		//moreinfo.click();
	}
    public void clickonactionbutton()
    {
	actionicon.click();
     }
   public void enterthevalueinPhoneNumberField(String phnnumpassing)
    {
	phnnumber.clear();
	phnnumber.sendKeys(phnnumpassing);
    }
   public void enterthevalueinemailField(String emailpassing)
    {
	email.clear();
    email.sendKeys(emailpassing);
    }
   public void enterTheAddress(String emailpassing)
   {
	address.clear();
	address.sendKeys(emailpassing);
   }
   public void enterTheDeliverytime(String deltimepassing)
    {
	deliverytime.clear();
	deliverytime.sendKeys(deltimepassing);
    }
    public void enterTheDeliveryCharge(String  deliverychargepassing)
    {
	deliverycharge.clear();
	deliverycharge.sendKeys(deliverychargepassing);
     }
    public boolean isupdateButtonIsDisplayed()
    {
    	return updatebutton.isDisplayed();
    }
    public void  clickOnUpdateButton()
    {
	//updatebutton.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",updatebutton);
	//return updatebutton.isDisplayed();
		
      }
     public boolean alertDisplayed()
     {
	return alert.isDisplayed();
     }
     }