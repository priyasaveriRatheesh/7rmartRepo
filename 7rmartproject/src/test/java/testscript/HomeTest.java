package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Loginpage;
import utilities.ExelUtilities;

public class HomeTest extends Base {
	@Test
	
	public void verifyTheUserisAbletologout() throws IOException
	{
	   String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
	   String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
	   Loginpage loginpage=new Loginpage(driver);
	   loginpage.enterUsernameOnUserNameField(loginusernamevalue);
	   loginpage.enterPasswordOnpasswordField(loginpasswordvalue);
	   loginpage.clickOnLoginbutton();
		
	   HomePage homeobj=new HomePage(driver);
	/* homeobj.enterUsernameOnUserNameField(loginusernamevalue);
	   homeobj.enterPasswordOnpasswordField(loginpasswordvalue);
	   homeobj.clickOnLoginbutton();*/
	   homeobj.clickOnTheProfile();
	   homeobj.ClickOnTheLogOutButton();
	   boolean Logindisplay=homeobj.isSigninbuttonDisplayed();
	   Assert.assertTrue(Logindisplay,"signin button is not displayed ");
		}
}
