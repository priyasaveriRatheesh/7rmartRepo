package testscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constants.Constants;

import java.io.IOException;
import org.testng.Assert;
import pages.Loginpage;
import utilities.ExelUtilities;

public class LoginTest extends Base {// here claass extending to base class to launch chromedriver
	@Test(retryAnalyzer = retry.Retry.class, groups = {
			"regression" }, description = "Verifying if the user is able to login using valid credentials")
	// for re execution
	// @Test
	public void verifyTheUserisAbletologinusingvalidcredentials() throws IOException // can create 4 ethods with the
																						// credentials combination
	{
		// String loginusernamevalue="admin";
		// String loginpasswordvalue="admin";
		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "Loginpage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "Loginpage");
		Loginpage objofloginpage = new Loginpage(driver);// crating another class object and passing driver
		objofloginpage.enterUsernameOnUserNameField(loginusernamevalue);// login page objct name.loginpage method
		objofloginpage.enterPasswordOnpasswordField(loginpasswordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean homepageloaded = objofloginpage.isAlertDisplayed();
		Assert.assertTrue(homepageloaded, Constants.MESSAGE);

	}

	@Test(description = "verifyIfTheUserIsAbleToLoginWithValidUsernameAndInvalidPassword") // purpose
	public void verifyIfTheUserIsAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException {
		// String usernamevalue="admin";
		// String passwordvalue="admi11";
		String usernamevalue = ExelUtilities.getStringData(2, 0, "Loginpage");
		String passwordvalue = ExelUtilities.getStringData(2, 1, "Loginpage");
		Loginpage objofloginpage = new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable = objofloginpage.isAlertDisplayed();
		Assert.assertTrue(alertvariable, "Alert not displayed");
	}

	@Test(groups = { "regression" })
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() throws IOException {
		// String usernamevalue="dmin";
		// String passwordvalue="admin";
		String usernamevalue = ExelUtilities.getStringData(3, 0, "Loginpage");
		String passwordvalue = ExelUtilities.getStringData(3, 1, "Loginpage");
		Loginpage objofloginpage = new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable = objofloginpage.isAlertDisplayed();
		Assert.assertTrue(alertvariable, "Alert not displayed");
	}

	@Test(dataProvider = "LoginProvider")

	public void verifyTheUserIsAbleToLoginUsingInvalidCredentials(String usernamevalue, String passwordvalue)
			throws IOException {
		// String usernamevalue="dmin";
		// String passwordvalue="dmin";
		// String usernamevalue=ExelUtilities.getStringData(4, 0,"Loginpage");
		// String passwordvalue=ExelUtilities.getStringData(4, 1,"Loginpage");
		Loginpage objofloginpage = new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable = objofloginpage.isAlertDisplayed();
		Assert.assertTrue(alertvariable, "Alert not displayed");
	}

	@DataProvider(name = "LoginProvider")
	public Object[][] getDataFromTestData() throws IOException {
		return new Object[][] {
				{ ExelUtilities.getStringData(4, 0, "LoginPage"), ExelUtilities.getStringData(4, 1, "LoginPage") } };
	}
}
