package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.Loginpage;
import pages.ManageProductPage;
import utilities.ExelUtilities;

public class ManageProductTest extends Base {
	HomePage homepage;
	ManageProductPage manageproductpage;

	@Test
	public void VerifyIfTheUserIsAbleToCreateNewProduct() throws IOException, AWTException {
		String loginusernamevalue = ExelUtilities.getStringData(1, 0, "Loginpage");
		String loginpasswordvalue = ExelUtilities.getStringData(1, 1, "Loginpage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		homepage = loginpage.clickOnLoginbutton();

		String titlevalue = ExelUtilities.getStringData(1, 0, "ManageProductPage");
		String pricevalue = ExelUtilities.getIntegerData(1, 3, "ManageProductPage");
		String stockvalue = ExelUtilities.getStringData(1, 5, "ManageProductPage");

		manageproductpage = homepage.clickOnMoreInfoButtonproduct();
		manageproductpage.clickOnNewIcon().enterValueOnTitleField(titlevalue).ClickOnPriceTypeRadioButton()
				.minimumPieceDropdown(5).enterStock(stockvalue).enterPrice(pricevalue).clickOnSaveButton();
		boolean alertdisplayed = manageproductpage.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed, Constants.ALERTMESSAGE);

	}
}
