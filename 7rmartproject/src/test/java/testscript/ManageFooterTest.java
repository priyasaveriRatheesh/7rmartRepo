package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ManageFooterPage;
import utilities.ExelUtilities;

public class ManageFooterTest  extends Base{
	@Test
	public void VerifyIfTheUserCanupdateTheFooterFields() throws IOException
	{
		
		String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
		String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
		
		ManageFooterPage ManageFooterPageobj=new ManageFooterPage(driver);
		ManageFooterPageobj.enterUsernameOnUserNameField(loginusernamevalue);
		ManageFooterPageobj.enterPasswordOnpasswordField(loginpasswordvalue);
		ManageFooterPageobj.clickOnLoginbutton();
		
	    String newadresss=ExelUtilities.getStringData(1,0,"ManageFooterPage");
	    String newemail=ExelUtilities.getStringData(1,1,"ManageFooterPage");
	    String newphonenumber=ExelUtilities.getIntegerData(1,2,"ManageFooterPage");
	    
	    ManageFooterPageobj.clickonmoreinfobutton();
	    ManageFooterPageobj.clickonactionbutton();
	    ManageFooterPageobj.enteraddressOnAddressfield(newadresss);
	    ManageFooterPageobj.enterEmailOnEmailField(newemail);
	    ManageFooterPageobj.enterThePhoneNumber(newphonenumber);
	    //boolean updatedisplayed=ManageFooterPageobj.isupdatebuttonIsDisplayed();
		//Assert.assertTrue(updatedisplayed," Alert not displayed");

	    ManageFooterPageobj.clickonupdateIcon();
	    boolean alertdisplayed=ManageFooterPageobj.isalertdisplayed();
		Assert.assertTrue(alertdisplayed,"Alert not displayed");

	}
	@Test
	public void verifytheUpdateButtonIsPresentInTheFooterPage() throws IOException// doubt?
	{
		String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
		String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
		
		ManageFooterPage ManageFooterPageobj=new ManageFooterPage(driver);
		ManageFooterPageobj.enterUsernameOnUserNameField(loginusernamevalue);
		ManageFooterPageobj.enterPasswordOnpasswordField(loginpasswordvalue);
		ManageFooterPageobj.clickOnLoginbutton();
	    ManageFooterPageobj.clickonmoreinfobutton();
	    ManageFooterPageobj.clickonactionbutton();
	    boolean updatedisplayed=ManageFooterPageobj.isupdatebuttonIsDisplayed();
		Assert.assertTrue(updatedisplayed," Alert not displayed");

	   	
	}

}
