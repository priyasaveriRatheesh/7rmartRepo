package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ManageProductPage;
import utilities.ExelUtilities;

public class ManageProductTest extends Base{
		@Test
	public void VerifyIfTheUserIsAbleToCreateNewProduct() throws IOException, AWTException 
		{
			String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
			String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
			ManageProductPage ManageProductpageobj=new ManageProductPage(driver);
			ManageProductpageobj.enterUsernameOnUsernameField(loginusernamevalue);
			ManageProductpageobj.enterPasswordOnPasswordField(loginpasswordvalue);
			ManageProductpageobj.clickOnLoginButton();
			
		    String titlevalue=ExelUtilities.getStringData(1,0,"ManageProductPage");
			String tagvalue=ExelUtilities.getStringData(1, 1,"ManageProductPage");
			String maxquantity=ExelUtilities.getStringData(1,2,"ManageProductPage");
			String pricevalue=ExelUtilities.getIntegerData(1, 3,"ManageProductPage");
			String mrpvalue=ExelUtilities.getIntegerData(1, 4,"ManageProductPage");
			String stockvalue=ExelUtilities.getStringData(1,5,"ManageProductPage");
			String purchasevalue=ExelUtilities.getIntegerData(1,6,"ManageProductPage");
			String descptionvalue=ExelUtilities.getStringData(1,7,"ManageProductPage");


			ManageProductpageobj.clickOnMoreinfoButton();
			ManageProductpageobj.clickOnNewIcon();
			ManageProductpageobj.enterValueOnTitleField(titlevalue);
			ManageProductpageobj.SelectAprodutTypeRadioButton();
			ManageProductpageobj.enterValueOnTagfield(tagvalue);
			ManageProductpageobj.SelectGroup(1);
			ManageProductpageobj.ClickOnPriceTypeRadioButton();
			ManageProductpageobj.minimumpiecedropdown(2);
			ManageProductpageobj.EnterTheMaximumQuantityCanOrder(maxquantity);//doubt
			ManageProductpageobj.enterPrice(pricevalue);
			ManageProductpageobj.enterTheMrpValue(mrpvalue);
			ManageProductpageobj.enterStock(stockvalue);
			ManageProductpageobj.enterthePurchasePrice(purchasevalue);
			ManageProductpageobj.addDescription(descptionvalue);
			ManageProductpageobj.clickOnStockRadioButton(stockvalue);
			ManageProductpageobj.clickOnSavebutton();
			boolean alertdisplayed=ManageProductpageobj.isAlertMessageDisplayed();
			Assert.assertTrue(alertdisplayed,"Alert not displayed");
		
			}
}

				
		


			