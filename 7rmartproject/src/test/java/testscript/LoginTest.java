package testscript;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import pages.Loginpage;
import utilities.ExelUtilities;

public class LoginTest extends Base {//here claass extending to base class  to launch chromedriver
	@Test(retryAnalyzer=retry.Retry.class)//for re execution
	public void verifyTheUserisAbletologinusingvalidcredentials() throws IOException
	{
		//String usernamevalue="admin";
		//String passwordvalue="admin";
		String usernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
		String passwordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
		Loginpage objofloginpage=new Loginpage(driver);//crating another class object and passing driver
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);//login page objct name.loginpage method
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean homepageloaded=objofloginpage.ishomepagedisplayed();
		Assert.assertTrue(homepageloaded,"Homepage is not loaded when the user is entering the valid credentials");
		
}@Test
	public void verifyIfTheUserIsAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
	//String usernamevalue="admin";
	//String passwordvalue="admi11";
	String usernamevalue=ExelUtilities.getStringData(2, 0,"Loginpage");
	String passwordvalue=ExelUtilities.getStringData(2, 1,"Loginpage");
	
	Loginpage objofloginpage=new Loginpage(driver);
	objofloginpage.enterUsernameOnUserNameField(usernamevalue);
	objofloginpage.enterPasswordOnpasswordField(passwordvalue);
	objofloginpage.clickOnLoginbutton();
	boolean alertvariable=objofloginpage.isalertdisplayed();
	Assert.assertTrue(alertvariable,"Alert not displayed");	

			}

 @Test
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() throws IOException {
		//String usernamevalue="dmin";
		//String passwordvalue="admin";
	     String usernamevalue=ExelUtilities.getStringData(3, 0,"Loginpage");
		String passwordvalue=ExelUtilities.getStringData(3, 1,"Loginpage");
			
	    Loginpage objofloginpage=new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable=objofloginpage.isalertdisplayed();
		Assert.assertTrue(alertvariable,"Alert not displayed");	
	}
@Test
	public void verifyTheUserIsAbleToLoginUsingInvalidCredentials() throws IOException {
		//String usernamevalue="dmin";
		//String passwordvalue="dmin";
	    String usernamevalue=ExelUtilities.getStringData(4, 0,"Loginpage");
	   String passwordvalue=ExelUtilities.getStringData(4, 1,"Loginpage");
		
	    Loginpage objofloginpage=new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable=objofloginpage.isalertdisplayed();
		Assert.assertTrue(alertvariable,"Alert not displayed");	
	}

}
	