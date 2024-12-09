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
		// loginpage.clickOnLoginbutton();
		homepage = loginpage.clickOnLoginbutton();

		// loginpage.enterUsernameOnUserNameField(loginusernamevalue);/////doubt?
		// loginpage.enterPasswordOnpasswordField(loginpasswordvalue);
		// loginpage.clickOnLoginbutton();

		// ManageProductPage ManageProductpageobj=new ManageProductPage(driver);
		String titlevalue = ExelUtilities.getStringData(1, 0, "ManageProductPage");
		// String tagvalue=ExelUtilities.getStringData(1, 1,"ManageProductPage");
		// String maxquantity=ExelUtilities.getStringData(1,2,"ManageProductPage");
		String pricevalue = ExelUtilities.getIntegerData(1, 3, "ManageProductPage");
		// String mrpvalue=ExelUtilities.getStringData(1, 4,"ManageProductPage");
		String stockvalue = ExelUtilities.getStringData(1, 5, "ManageProductPage");
		// String purchasevalue=ExelUtilities.getStringData(1,6,"ManageProductPage");
		// String descptionvalue=ExelUtilities.getStringData(1,7,"ManageProductPage");

		// ManageProductpageobj.clickOnMoreinfoButton();
		manageproductpage = homepage.clickOnMoreInfoButtonproduct();
		manageproductpage.clickOnNewIcon().enterValueOnTitleField(titlevalue).ClickOnPriceTypeRadioButton()
				.minimumPieceDropdown(5).enterStock(stockvalue).enterPrice(pricevalue).clickOnSaveButton();
		/*
		 * ManageProductpageobj.enterValueOnTitleField(titlevalue);
		 * ManageProductpageobj.SelectAprodutTypeRadioButton();
		 * ManageProductpageobj.enterValueOnTagfield(tagvalue);
		 * ManageProductpageobj.SelectGroup(1);
		 * manageproductpage.ClickOnPriceTypeRadioButton();
		 * /*ManageProductpageobj.minimumpiecedropdown(2);
		 * ManageProductpageobj.EnterTheMaximumQuantityCanOrder(maxquantity);
		 * manageproductpage.enterPrice(pricevalue);
		 * ManageProductpageobj.enterTheMrpValue(mrpvalue);
		 * manageproductpage.enterStock(stockvalue);
		 * /*ManageProductpageobj.enterthePurchasePrice(purchasevalue);
		 * ManageProductpageobj.addDescription(descptionvalue);
		 * ManageProductpageobj.clickOnStockRadioButton(stockvalue);
		 * ManageProductpageobj.clickOnSavebutton();
		 */
		boolean alertdisplayed = manageproductpage.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed,Constants.ALERTMESSAGE);

	}
}
