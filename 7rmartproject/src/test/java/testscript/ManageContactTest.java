package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpage;
import pages.ManageContactPage;
import utilities.ExelUtilities;

public class ManageContactTest extends Base{

	@Test
	public void updateTheContactDetails() throws IOException 
	{
		
		String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
		String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
		Loginpage loginpage=new Loginpage(driver);
		/*loginpage.enterUsernameOnUserNameField(loginusernamevalue);/////doubt?
		loginpage.enterPasswordOnpasswordField(loginpasswordvalue);
		loginpage.clickOnLoginbutton();*/
		
		String newnumber=ExelUtilities.getIntegerData(1,0,"ManageContactPage");
	    String newemail=ExelUtilities.getStringData(1,1,"ManageContactPage");
		String newaddress=ExelUtilities.getStringData(1,2,"ManageContactPage");
		String newdeliverytime=ExelUtilities.getIntegerData(1,3,"ManageContactPage");
		String newadelivercharge=ExelUtilities.getIntegerData(1,4,"ManageContactPage");
		  	
		
		
		ManageContactPage ManageContactPageobj=new ManageContactPage(driver);
		ManageContactPageobj.enterUsernameOnUserNameField(loginusernamevalue);//no need from this
		ManageContactPageobj.enterPasswordOnpasswordField(loginpasswordvalue);//this
		ManageContactPageobj.clickOnLoginbutton();//
		ManageContactPageobj.clickonmoreinfobutton();
	    ManageContactPageobj.clickonactionbutton();
	
	   	 
	   ManageContactPageobj.enterthevalueinPhoneNumberField(newnumber);
	   ManageContactPageobj.enterthevalueinemailField(newemail);
	   ManageContactPageobj.enterTheAddress(newaddress);
	   ManageContactPageobj.enterTheDeliverytime(newdeliverytime);
	   ManageContactPageobj.enterTheDeliveryCharge(newadelivercharge);
	   ManageContactPageobj.clickOnUpdateButton();
	  boolean alertdisplayed=ManageContactPageobj.alertDisplayed();
	  Assert.assertTrue(alertdisplayed,"alert is not displayed");
	  
	   }
	   
      @Test
	   public void VerifyiftheUpdateButtonIsPresent() throws IOException
	   {
		String loginusernamevalue=ExelUtilities.getStringData(1, 0,"LoginPage"); 
		String loginpasswordvalue=ExelUtilities.getStringData(1, 1,"LoginPage");
		
		ManageContactPage ManageContactPageobj=new ManageContactPage(driver);
		ManageContactPageobj.enterUsernameOnUserNameField(loginusernamevalue);
		ManageContactPageobj.enterPasswordOnpasswordField(loginpasswordvalue);
		ManageContactPageobj.clickOnLoginbutton();
		
		ManageContactPageobj.clickonmoreinfobutton();
	    ManageContactPageobj.clickonactionbutton();
	     ManageContactPageobj.clickOnUpdateButton();
		boolean updatebuttondisplayed=ManageContactPageobj.isupdateButtonIsDisplayed();
		Assert.assertTrue(updatebuttondisplayed,"Update Button not displayed");
	    }
         
}

	

