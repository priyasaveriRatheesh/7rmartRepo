package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.Waitutilities;
public class Base {
			public WebDriver driver;
		@BeforeMethod
		@Parameters("browser")
		public void initializeBrowser(String browser) throws Exception {
			//driver=new ChromeDriver();
			if(browser.equalsIgnoreCase("Chrome")) 
			{
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Edge")) 
			{
				driver=new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				driver=new FirefoxDriver();
			}
			else
			{
			throw new Exception("Browser is incorrect");
			}
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waitutilities.implicitwait));
		driver.manage().window().maximize();

		  }
		@AfterMethod
		  public void quitandclose()
		  {
			  //driver.close();
			//  driver.quit();

			}

		}



