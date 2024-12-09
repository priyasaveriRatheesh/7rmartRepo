package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.Loginpage;
import utilities.ExelUtilities;

public class AdminUserTest extends Base {
	HomePage homepage;
	AdminUserPage adminuserpage;

	@Test
	public void VerifyIfTheUserIsableToUpdateAllTheFields() throws IOException {
		String loginusername = ExelUtilities.getStringData(1, 0, "Loginpage");
		String loginpassword = ExelUtilities.getStringData(1, 1, "Loginpage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusername).enterPasswordOnpasswordField(loginpassword);
		homepage = loginpage.clickOnLoginbutton();

		String usernameupdate = ExelUtilities.getStringData(1, 0, "AdminUserPage");
		String passwordupdate = ExelUtilities.getStringData(1, 1, "AdminUserPage");
		adminuserpage = homepage.clickOnMoreInfoAdminuserPage();
		adminuserpage.clickOnUpdateIcon().enterUpdatedUsername(usernameupdate).updatedPassword(passwordupdate)
				.selectValueOnUsertypeField().clickOnUpdateDetailsButton();

		boolean alertvariable = adminuserpage.isAlertDisplayed();
		Assert.assertTrue(alertvariable, Constants.ALERTMESSAGE);
	}

}