package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import pages.Managenewspage;
import utilities.ExelUtilities;

public class ManagenewsTest extends Base{
	@Test
	public void deletenews() throws IOException
	{
		String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
		String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
		
		Managenewspage objofManagenewspage=new Managenewspage(driver);
		objofManagenewspage.enterUsernameOnUserNameField(loginusernamevalue);
		objofManagenewspage.enterPasswordOnpasswordField(loginpasswordvalue);
		objofManagenewspage.clickOnLoginbutton();
		
		objofManagenewspage.clickonmoreinfobutton();
		objofManagenewspage.clickondeletebutton();
		boolean alertdisplayed=objofManagenewspage.isalertdisplayed();
		Assert.assertTrue(alertdisplayed,"alert not displayed");
	}
		@Test
		public void createnews() throws IOException
		{
			//String loginusername="admin";
			//String loginpassword="admin";
			
			String loginusername=ExelUtilities.getStringData(1,0,"Loginpage");
			String loginpassword=ExelUtilities.getStringData(1,1,"Loginpage");
			
			Managenewspage objofManagenewspage=new Managenewspage(driver);
			objofManagenewspage.enterUsernameOnUserNameField(loginusername);
			objofManagenewspage.enterPasswordOnpasswordField(loginpassword);
			objofManagenewspage.clickOnLoginbutton();
			
			
		String news=ExelUtilities.getStringData(1, 0,"ManagenewsPage");
		objofManagenewspage.clickonmoreinfobutton();
		objofManagenewspage.clickonnewButton();
		objofManagenewspage.enterthenews(news);
		objofManagenewspage.clickOnSavebutton();
		boolean alertdisplayed=objofManagenewspage.isalertdisplayed();
		Assert.assertTrue(alertdisplayed,"Alert not displayed");

	}

}
