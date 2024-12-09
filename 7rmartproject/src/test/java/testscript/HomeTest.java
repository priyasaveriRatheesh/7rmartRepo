package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Loginpage;
import utilities.ExelUtilities;

public class HomeTest extends Base {
	@Test

	public void verifyTheUserisAbletologout() throws IOException {
		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "Loginpage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "Loginpage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		loginpage.clickOnLoginbutton();

		HomePage homeobj = new HomePage(driver);
		homeobj.clickOnTheProfileIcon();
		homeobj.ClickOnTheLogOutButton();
		boolean Logindisplay = homeobj.isSigninButtonDisplayed();
		Assert.assertTrue(Logindisplay, "signin button is not displayed ");
	}
}
