package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Managenewspage;
import utilities.ExelUtilities;

public class ManagenewsTest extends Base{
	@Test
	public void managenews() throws IOException
	{
		String loginusernamevalue=ExelUtilities.getStringData(1,0,"Loginpage");
		String loginpasswordvalue=ExelUtilities.getStringData(1,1,"Loginpage");
		Managenewspage obj=new Managenewspage(driver);
		obj.enterUsernameOnUserNameField(loginusernamevalue);
		obj.enterPasswordOnpasswordField(loginpasswordvalue);
		obj.clickOnLoginbutton();
		
		obj.clickonmoreinfobutton();
		obj.clickondeletebutton();
		boolean alertdisplayed=obj.isalertdisplayed();
		Assert.assertTrue(alertdisplayed,"alert not displayed");
	}

}
