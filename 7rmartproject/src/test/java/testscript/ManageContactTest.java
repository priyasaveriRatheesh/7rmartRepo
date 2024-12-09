package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.Loginpage;
import pages.ManageContactPage;
import utilities.ExelUtilities;

public class ManageContactTest extends Base {
	HomePage homepage;
	ManageContactPage managecontactpage;

	@Test
	public void VerifyIfTheUserCanupdateTheContactDetails() throws IOException {

		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "Loginpage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "Loginpage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		homepage = loginpage.clickOnLoginbutton();

		String newnumber = ExelUtilities.getIntegerData(1, 0, "ManageContactPage");
		String newemail = ExelUtilities.getStringData(1, 1, "ManageContactPage");
		String newaddress = ExelUtilities.getStringData(1, 2, "ManageContactPage");
		String newdeliverytime = ExelUtilities.getIntegerData(1, 3, "ManageContactPage");
		String newadelivercharge = ExelUtilities.getIntegerData(1, 4, "ManageContactPage");

		managecontactpage = homepage.clickOnMoreInfoButtonContactPage();
		managecontactpage.clickOnActionButton().enterTheValueInPhoneNumberField(newnumber)
				.enterTheValueInEmailField(newemail).enterTheAddress(newaddress).enterTheDeliveryTime(newdeliverytime)
				.enterTheDeliveryCharge(newadelivercharge).clickOnUpdateButton();
		boolean alertdisplayed = managecontactpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed, "Alert not displayed");

	}

	@Test
	public void VerifyiftheUpdateButtonIsPresentInManageContCtPage() throws IOException {
		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "LoginPage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "LoginPage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		homepage = loginpage.clickOnLoginbutton();

		managecontactpage = homepage.clickOnMoreInfoButtonContactPage();
		managecontactpage.clickOnActionButton();
		boolean updatebuttondisplayed = managecontactpage.isupdateButtonIsDisplayed();
		Assert.assertTrue(updatebuttondisplayed, Constants.NOBUTTONFOUND);
	}

}
