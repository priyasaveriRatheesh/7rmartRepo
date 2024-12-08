package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
    this.driver=driver;
    PageFactory.initElements(driver,this);
    }
	    
  /*@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;*/
	@FindBy(xpath="//img[@class='img-circle']") private WebElement profileicon;
	@FindBy(css="a.dropdown-item[href='https://groceryapp.uniqassosiates.com/admin/logout']")private WebElement logout;
	@FindBy(xpath="//p[text()='Sign in to start your session']") private WebElement signinpagedisplay;
	
		@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div[1]/div/a")private WebElement adminusermoreinfo;
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-contact']") private WebElement  contactmoreinfo;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[10]/div/a") private WebElement footermoreinfo;
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-news']") private WebElement newsmoreinfo;
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']") private WebElement productmoreinfobutton;
	//@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[8]/div/a") private WebElement productmoreinfobutton;

	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[4]/div/a") private WebElement subcategorymoreinfo ;

	
	public AdminUserPage clickonmoreinfoadminuserpage()
    {
   	 //JavascriptExecutor js=(JavascriptExecutor)driver;
   	// js.executeScript("arguments[0].click();",adminusermoreinfo);
     adminusermoreinfo.click();
	return new AdminUserPage(driver);
   	 
    }
   
	public   ManageContactPage clickonmoreinfobuttoncontactpage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",contactmoreinfo);
		return new ManageContactPage(driver);
		
	}
	public ManageFooterPage clickonmoreinfobuttonfooter()
	{
		footermoreinfo.click();
		return new ManageFooterPage(driver);
	}
	public Managenewspage clickonmoreinfobuttonnews()
	{
		newsmoreinfo.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();",newsmoreinfo);
		return new Managenewspage(driver);

	}
	public ManageProductPage clickOnMoreinfoButtonproduct() {
		//productmoreinfobutton.click();//both are  working
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",productmoreinfobutton);
		return new ManageProductPage(driver);
		}
	
	public Subcategorypage clickOnMoreinfobuttonsubcategory() {
		//subcategorymoreinfo.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",subcategorymoreinfo);
		return new Subcategorypage(driver);
	}
	
	/*	
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
     }*/
	
public void clickOnTheProfile()
{
	profileicon.click();
}
public void ClickOnTheLogOutButton()
{
	logout.click();
}
public boolean isSigninbuttonDisplayed()
{
	return signinpagedisplay.isDisplayed();
	
}
}
