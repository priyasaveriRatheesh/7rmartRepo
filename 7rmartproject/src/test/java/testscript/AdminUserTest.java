package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import utilities.ExelUtilities;

public class AdminUserTest extends Base{
	
@Test                               
public void UpdateTheFields()throws IOException
{
		//String loginusername="admin";//wa use use excel insted of hard code the values
		//String loginpassword="admin";
		String loginusername=ExelUtilities.getStringData(1, 0, "Loginpage");//row,column starts with zero
		String loginpassword=ExelUtilities.getStringData(1, 1, "Loginpage");
		//String usernameupdate="user123";
	    //String passwordupdate="admin12345";
		//String usertypeupdate="Delivery Boy";
		 //using string its not working? and usertypfield
		
		int usertypeupdate=4;
		String usernameupdate=ExelUtilities.getStringData(1, 0, "AdminUserPage");
		String passwordupdate=ExelUtilities.getStringData(1, 1, "AdminUserPage");
		//String usertypeupdate=ExelUtilities.getStringData(1, 2, "AdminUserPage");
		
		AdminUserPage objAdminUserPage=new AdminUserPage(driver);//both page objects can use 
		objAdminUserPage.enterUsernameOnUserNameField(loginusername);
		objAdminUserPage.enterPasswordOnpasswordField(loginpassword);
		objAdminUserPage.clickOnLoginbutton();
		
		objAdminUserPage.clickonmoreinfo();
		objAdminUserPage.clickonupdateicon();
		objAdminUserPage.enterupdatedusername(usernameupdate);
		objAdminUserPage.updatepassword(passwordupdate);
		objAdminUserPage.selectupdatedusertype(usertypeupdate);
		objAdminUserPage.clickonupdateDetailsButton();
	    boolean alertvariable=objAdminUserPage.isalertdisplayed();
	    Assert.assertTrue(alertvariable, "Alert not displayed");
}
	
}