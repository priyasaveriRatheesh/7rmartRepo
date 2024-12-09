package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.Loginpage;
import pages.Managenewspage;
import utilities.ExelUtilities;

public class ManagenewsTest extends Base {
	HomePage homepage;
	Managenewspage managenewspage;

	@Test
	public void VerifyIfTheUserCanCreateNews() throws IOException {
		String loginusername = ExelUtilities.getStringData(1, 0, "Loginpage");
		String loginpassword = ExelUtilities.getStringData(1, 1, "Loginpage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusername).enterPasswordOnpasswordField(loginpassword);
		homepage = loginpage.clickOnLoginbutton();

		String news = ExelUtilities.getStringData(1, 0, "ManagenewsPage");
		managenewspage = homepage.clickOnMoreInfoButtonNews();
		managenewspage.clickOnNewButton().enterTheNews(news).clickOnSaveButton();
		boolean alertdisplayed = managenewspage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed, Constants.ALERTMESSAGE);

	}

}
