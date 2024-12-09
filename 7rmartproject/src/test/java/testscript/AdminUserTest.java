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
		String loginusername = ExelUtilities.getStringData(1, 0, "Loginpage");// row,column starts with zero
		String loginpassword = ExelUtilities.getStringData(1, 1, "Loginpage");
		// String usernameupdate="user123";
		// String passwordupdate="admin12345";
		// String usertypeupdate="Delivery Boy";
		Loginpage loginpage = new Loginpage(driver);// passing driver only once
		loginpage.enterUsernameOnUserNameField(loginusername).enterPasswordOnpasswordField(loginpassword);
		// methods are called in a single line with a single object
		// loginpage.enterPasswordOnpasswordField(loginpassword);
		// loginpage.clickOnLoginbutton();
		homepage = loginpage.clickOnLoginbutton();

		String usernameupdate = ExelUtilities.getStringData(1, 0, "AdminUserPage");
		String passwordupdate = ExelUtilities.getStringData(1, 1, "AdminUserPage");
		// String usertypeupdate=ExelUtilities.getStringData(1, 2, "AdminUserPage");

		// AdminUserPage objAdminUserPage=new AdminUserPage(driver);//both page objects
		// can use
		adminuserpage = homepage.clickOnMoreInfoAdminuserPage();
		// now moved to admin page when clicked on moreinfo button
		// objAdminUserPage.enterUsernameOnUserNameField(loginusername);
		// objAdminUserPage.enterPasswordOnpasswordField(loginpassword);
		// objAdminUserPage.clickOnLoginbutton();
		adminuserpage.clickOnUpdateDetailsButton().enterUpdatedUsername(usernameupdate).updatedPassword(passwordupdate)
				.clickOnUpdateDetailsButton();

		/*
		 * objAdminUserPage.enterUsernameOnUserNameField();
		 * objAdminUserPage.clickonupdateicon();
		 * objAdminUserPage.enterupdatedusername(usernameupdate);
		 * objAdminUserPage.updatepassword(passwordupdate);
		 * objAdminUserPage.selectupdatedusertype();
		 * objAdminUserPage.clickonupdateDetailsButton();
		 */// write all these in the above single line
		boolean alertvariable = adminuserpage.isAlertDisplayed();
		Assert.assertTrue(alertvariable, Constants.ALERTMESSAGE);
	}

}