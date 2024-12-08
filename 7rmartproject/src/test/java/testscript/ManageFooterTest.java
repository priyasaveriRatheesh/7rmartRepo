package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;
import pages.ManageFooterPage;
import utilities.ExelUtilities;

public class ManageFooterTest  extends Base{
	HomePage homepage;
	ManageFooterPage managefooterpage;
	
	@Test
	public void VerifyIfTheUserCanupdateTheFooterFields() throws IOException
	{
		
		String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
		String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		//loginpage.clickOnLoginbutton();
		homepage=loginpage.clickOnLoginbutton();

		
		String newadresss=ExelUtilities.getStringData(1,0,"ManageFooterPage");
	    String newemail=ExelUtilities.getStringData(1,1,"ManageFooterPage");
	    String newphonenumber=ExelUtilities.getIntegerData(1,2,"ManageFooterPage");
		/*ManageFooterPage ManageFooterPageobj=new ManageFooterPage(driver);
		ManageFooterPage.enterUsernameOnUserNameField(loginusernamevalue);
		ManageFooterPageobj.enterPasswordOnpasswordField(loginpasswordvalue);
		ManageFooterPageobj.clickOnLoginbutton();*/
		
	    
	    managefooterpage=homepage.clickonmoreinfobuttonfooter();
	    managefooterpage.clickonactionbutton().enteraddressOnAddressfield(newadresss).enterEmailOnEmailField(newemail).enterThePhoneNumber(newphonenumber).clickonupdateIcon();
	    //boolean updatedisplayed=ManageFooterPageobj.isupdatebuttonIsDisplayed();
		//Assert.assertTrue(updatedisplayed," Alert not displayed");
	   // ManageFooterPageobj.clickonupdateIcon();
	    boolean alertdisplayed=managefooterpage.isalertdisplayed();
		Assert.assertTrue(alertdisplayed,"Alert not displayed");

	}
	@Test
	public void verifytheUpdateButtonIsPresentInTheFooterPage() throws IOException// doubt?
	{
		String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
		String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue).enterPasswordOnpasswordField(loginpasswordvalue);
		//loginpage.clickOnLoginbutton();
		homepage=loginpage.clickOnLoginbutton();

		
		
	/*	ManageFooterPage ManageFooterPageobj=new ManageFooterPage(driver);
		ManageFooterPageobj.enterUsernameOnUserNameField(loginusernamevalue);
		ManageFooterPageobj.enterPasswordOnpasswordField(loginpasswordvalue);
		ManageFooterPageobj.clickOnLoginbutton();*/
		managefooterpage=homepage.clickonmoreinfobuttonfooter();
		managefooterpage.clickonactionbutton();
	    boolean updatedisplayed=managefooterpage.isupdatebuttonIsDisplayed();
		Assert.assertTrue(updatedisplayed," Alert not displayed");

	   	
	}

}
