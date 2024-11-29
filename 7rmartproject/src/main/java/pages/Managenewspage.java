package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managenewspage {
	WebDriver driver;
	public Managenewspage(WebDriver driver)
	{
    this.driver=driver;
    PageFactory.initElements(driver,this);}
	@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	
	
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-news']") private WebElement moreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/delete?del=2072&page_ad=1']") private WebElement deleteicon;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']") private WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']") private WebElement newsfield;
	@FindBy(xpath="//button[@type='submit']") private WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement alert;

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
	moreinfo.click();
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].click();",moreinfobutton);

}
public void clickondeletebutton()
{
	deleteicon.click();
	driver.switchTo().alert().dismiss();
	//driver.switchTo().alert().accept();
}
public boolean isalertdisplayed()
{
	return alert.isDisplayed();
}

public void clickonnewButton()
{
	newbutton.click();
}
public void enterthenews(String news)
{
newsfield.sendKeys(news);
}
public void clickOnSavebutton() 
{
	savebutton.click();
}
public boolean isAlertMessageDisplayed() {
	return alert.isDisplayed();
}
}
