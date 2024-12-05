package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import utilities.ExelUtilities;

public class HomeTest extends Base {
	@Test
	
	public void verifyTheUserisAbletologout() throws IOException
	{
	   String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
	   String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
	   HomePage homeobj=new HomePage(driver);
	   homeobj.enterUsernameOnUserNameField(loginusernamevalue);
	   homeobj.enterPasswordOnpasswordField(loginpasswordvalue);
	   homeobj.clickOnLoginbutton();
	   homeobj.clickOnTheProfile();
	   homeobj.ClickOnTheLogOutButton();
	   boolean Logindisplay=homeobj.isHomePageDisplayed();
	   // Assert.assertTrue(display);
	     
	   
	}

}
