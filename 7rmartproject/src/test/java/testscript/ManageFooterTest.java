package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.Loginpage;
import pages.ManageFooterPage;
import utilities.ExelUtilities;

public class ManageFooterTest extends Base {
	HomePage homepage;
	ManageFooterPage managefooterpage;

	@Test
	public void VerifyIfTheUserCanupdateTheFooterFields() throws IOException {

		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "Loginpage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "Loginpage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		homepage = loginpage.clickOnLoginbutton();

		String newadresss = ExelUtilities.getStringData(1, 0, "ManageFooterPage");
		String newemail = ExelUtilities.getStringData(1, 1, "ManageFooterPage");
		String newphonenumber = ExelUtilities.getIntegerData(1, 2, "ManageFooterPage");

		managefooterpage = homepage.clickOnMoreInfoButtonFooter();
		managefooterpage.clickOnActionButton().enterAddressOnAddressField(newadresss).enterEmailOnEmailField(newemail)
				.enterThePhoneNumber(newphonenumber).clickonUpdateIcon();
		boolean alertdisplayed = managefooterpage.isAlertdisplayed();
		Assert.assertTrue(alertdisplayed, Constants.ALERTMESSAGE);

	}

	@Test
	public void verifytheUpdateButtonIsPresentInTheFooterPage() throws IOException// doubt?
	{
		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "Loginpage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "Loginpage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		homepage = loginpage.clickOnLoginbutton();

		managefooterpage = homepage.clickOnMoreInfoButtonFooter();
		managefooterpage.clickOnActionButton();
		boolean updatedisplayed = managefooterpage.isUpdateButtonIsDisplayed();
		Assert.assertTrue(updatedisplayed, Constants.ALERTMESSAGE);

	}

}
