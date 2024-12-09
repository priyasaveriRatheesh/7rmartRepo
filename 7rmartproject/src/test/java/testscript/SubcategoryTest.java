package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.Loginpage;
import pages.Subcategorypage;
import utilities.ExelUtilities;

public class SubcategoryTest extends Base {
	HomePage homepage;
	Subcategorypage subcategorypage;

	@Test
	public void verifyIfTheUserIsAbleToCreateANewSubcategory() throws IOException, AWTException {
		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "LoginPage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "LoginPage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		homepage = loginpage.clickOnLoginbutton();

		String categoryvalue = ExelUtilities.getStringData(1, 0, "SubcategoryPage");
		String subcategoryvalue = ExelUtilities.getStringData(1, 1, "SubcategoryPage");
		subcategorypage = homepage.clickOnMoreInfoButtonSubcategory();
		subcategorypage.clickOnNewbutton().selectValueOnCateforyFieldDropdown().EnterSubcategory(categoryvalue)
				.clickOnSavebutton();
		boolean alertdisplayed = subcategorypage.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed, Constants.ALERTMESSAGE);
	}

	@Test
	public void VerifyIfUserIsAbleToUpdateTheExistingSubcategory() throws IOException, AWTException {
		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "LoginPage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "LoginPage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		homepage = loginpage.clickOnLoginbutton();

		String categoryvalue = ExelUtilities.getStringData(2, 0, "SubcategoryPage");
		String subcategoryvalue = ExelUtilities.getStringData(2, 1, "SubcategoryPage");
		subcategorypage = homepage.clickOnMoreInfoButtonSubcategory();
		subcategorypage.clickOnNewbutton().selectValueOnCateforyFieldDropdown().EnterSubcategory(subcategoryvalue)
				.clickOnSavebutton();
		boolean alertdisplayed = subcategorypage.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed, Constants.ALERTMESSAGE);
	}
}
