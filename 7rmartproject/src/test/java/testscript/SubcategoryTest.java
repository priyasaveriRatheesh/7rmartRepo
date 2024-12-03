package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Subcategorypage;
import utilities.ExelUtilities;

public class SubcategoryTest extends Base {
	@Test
	public void verifyIfTheUserIsAbleToCreateANewSubcategory() throws IOException, AWTException {
		String loginusernamevalue=ExelUtilities.getStringData(1, 0,"LoginPage"); 
		String loginpasswordvalue=ExelUtilities.getStringData(1, 1,"LoginPage");
		//String loginusernamevalue="admin";
		//String loginpasswordvalue="admin";
		Subcategorypage subcategorypageobj=new Subcategorypage(driver);
		subcategorypageobj.enterUsernameOnUsernameField(loginusernamevalue);
		subcategorypageobj.enterPasswordOnPasswordField(loginpasswordvalue);
		subcategorypageobj.clickOnSigninButton();
		
		String categoryvalue=ExelUtilities.getStringData(1, 0,"SubcategoryPage");
		String subcategoryvalue=ExelUtilities.getStringData(1, 1,"SubcategoryPage");
		subcategorypageobj.clickOnMoreinfobutton();
		subcategorypageobj.clickOnNewbutton();
		//subcategorypageobj.selectaCategoryFromDropdown(categoryvalue);
		//subcategorypageobj.selectaCategoryFromDropdown();
		subcategorypageobj.EnteraSubcategory(subcategoryvalue);
		//subcategorypageobj.fileUpload();//inactive when using robot class no need of this line why?
		subcategorypageobj.clickOnSavebutton();
		boolean alertdisplayed=subcategorypageobj.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed,"Alert not displayed");
	}
	@Test
	public void VerifyIfUserIsNotAbleToUpdateTheExistingSubcategory() throws IOException, AWTException {
		String loginusernamevalue=ExelUtilities.getStringData(1, 0,"LoginPage"); 
		String loginpasswordvalue=ExelUtilities.getStringData(1, 1,"LoginPage");
		//String loginusernamevalue="admin";
		//String loginpasswordvalue="admin";
		Subcategorypage subcategorypageobj=new Subcategorypage(driver);
		subcategorypageobj.enterUsernameOnUsernameField(loginusernamevalue);
		subcategorypageobj.enterPasswordOnPasswordField(loginpasswordvalue);
		subcategorypageobj.clickOnSigninButton();
		
		String categoryvalue=ExelUtilities.getStringData(2, 0,"SubcategoryPage");
		String subcategoryvalue=ExelUtilities.getStringData(2, 1,"SubcategoryPage");
		subcategorypageobj.clickOnMoreinfobutton();
		subcategorypageobj.clickOnNewbutton();
		//subcategorypageobj.clickonupdatecategorybutton();
		subcategorypageobj.selectaCategoryFromDropdown(categoryvalue);
		subcategorypageobj.EnteraSubcategory(subcategoryvalue);
		subcategorypageobj.clickOnSavebutton();
		boolean alertdisplayed=subcategorypageobj.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed,"Alert not displayed");
	}
}


