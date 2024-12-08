package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;
import pages.Managenewspage;
import utilities.ExelUtilities;

public class ManagenewsTest extends Base{
	HomePage homepage;
	Managenewspage managenewspage;
	
	/*@Test
	public void VerifyIfTheUserIsAbleToDeleteNewsdeletenews() throws IOException
	{
		String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
		String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUsernameOnUserNameField(loginusernamevalue);/////doubt?
		loginpage.enterPasswordOnpasswordField(loginpasswordvalue);
		//loginpage.clickOnLoginbutton();
		 homepage=loginpage.clickOnLoginbutton();

		
		
		Managenewspage objofManagenewspage=new Managenewspage(driver);
		objofManagenewspage.enterUsernameOnUserNameField(loginusernamevalue);
		objofManagenewspage.enterPasswordOnpasswordField(loginpasswordvalue);
		objofManagenewspage.clickOnLoginbutton();
		
		objofManagenewspage.clickonmoreinfobutton();
		objofManagenewspage.clickondeletebutton();
		boolean alertdisplayed=objofManagenewspage.isalertdisplayed();
		Assert.assertTrue(alertdisplayed,"alert not displayed");
	}*/
		@Test
		public void VerifyIfTheUserCanCreateNews() throws IOException
		{
			//String loginusername="admin";
			//String loginpassword="admin";
			String loginusername=ExelUtilities.getStringData(1,0,"Loginpage");
			String loginpassword=ExelUtilities.getStringData(1,1,"Loginpage");
			Loginpage loginpage=new Loginpage(driver);
			loginpage.enterUsernameOnUserNameField(loginusername).enterPasswordOnpasswordField(loginpassword);
			//loginpage.clickOnLoginbutton();
			homepage=loginpage.clickOnLoginbutton();

			
			
			/*Managenewspage objofManagenewspage=new Managenewspage(driver);
			objofManagenewspage.enterUsernameOnUserNameField(loginusername);
			objofManagenewspage.enterPasswordOnpasswordField(loginpassword);
			objofManagenewspage.clickOnLoginbutton();
			*/
			
		String news=ExelUtilities.getStringData(1, 0,"ManagenewsPage");
		/*objofManagenewspage.clickonmoreinfobutton();
		objofManagenewspage.clickonnewButton();
		objofManagenewspage.enterthenews(news);
		objofManagenewspage.clickOnSavebutton();*/
		managenewspage=homepage.clickonmoreinfobuttonnews();
		managenewspage.clickonnewButton().enterthenews(news).clickOnSavebutton();
		boolean alertdisplayed=managenewspage.isalertdisplayed();
		Assert.assertTrue(alertdisplayed,"Alert not displayed");

	}

}
