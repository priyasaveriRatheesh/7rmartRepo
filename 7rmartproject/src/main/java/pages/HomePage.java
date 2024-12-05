package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
    this.driver=driver;
    PageFactory.initElements(driver,this);}
	    
	@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	@FindBy(xpath="//img[@class='img-circle']") private WebElement profileicon;
	@FindBy(css="a.dropdown-item[href='https://groceryapp.uniqassosiates.com/admin/logout']")private WebElement logout;
	@FindBy(xpath="//p[text()='Sign in to start your session']") private WebElement homepagedisplay;


	
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
	
public void clickOnTheProfile()
{
	profileicon.click();
}
public void ClickOnTheLogOutButton()
{
	logout.click();
}
public boolean isHomePageDisplayed()
{
	return homepagedisplay.isDisplayed();
	
}
}
