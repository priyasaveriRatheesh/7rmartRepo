package testscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constants.Constants;

import java.io.IOException;
import org.testng.Assert;
import pages.Loginpage;
import utilities.ExelUtilities;

public class LoginTest extends Base {
	@Test(retryAnalyzer = retry.Retry.class, groups = {
			"regression" }, description = "Verifying if the user is able to login using valid credentials")
	public void verifyTheUserisAbletologinusingvalidcredentials() throws IOException {
		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "Loginpage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "Loginpage");
		Loginpage objofloginpage = new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(loginusernamevalue);
		objofloginpage.enterPasswordOnpasswordField(loginpasswordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean homepageloaded = objofloginpage.isAlertDisplayed();
		Assert.assertTrue(homepageloaded, Constants.MESSAGE);

	}

	@Test(description = "verifyIfTheUserIsAbleToLoginWithValidUsernameAndInvalidPassword")
	public void verifyIfTheUserIsAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String usernamevalue = ExelUtilities.getStringData(2, 0, "Loginpage");
		String passwordvalue = ExelUtilities.getStringData(2, 1, "Loginpage");
		Loginpage objofloginpage = new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable = objofloginpage.isAlertDisplayed();
		Assert.assertTrue(alertvariable, Constants.ALERTMESSAGE);
	}

	@Test(groups = { "regression" })
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() throws IOException {
		String usernamevalue = ExelUtilities.getStringData(3, 0, "Loginpage");
		String passwordvalue = ExelUtilities.getStringData(3, 1, "Loginpage");
		Loginpage objofloginpage = new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable = objofloginpage.isAlertDisplayed();
		Assert.assertTrue(alertvariable, Constants.ALERTMESSAGE);
	}

	@Test(dataProvider = "LoginProvider")

	public void verifyTheUserIsAbleToLoginUsingInvalidCredentials(String usernamevalue, String passwordvalue)
			throws IOException {
		Loginpage objofloginpage = new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable = objofloginpage.isAlertDisplayed();
		Assert.assertTrue(alertvariable, Constants.ALERTMESSAGE);
	}

	@DataProvider(name = "LoginProvider")
	public Object[][] getDataFromTestData() throws IOException {
		return new Object[][] {
				{ ExelUtilities.getStringData(4, 0, "LoginPage"), ExelUtilities.getStringData(4, 1, "LoginPage") } };
	}
}
