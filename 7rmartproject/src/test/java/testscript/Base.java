package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;
import utilities.ScreenShotUtility;
import utilities.Waitutilities;

public class Base {

	public ScreenShotUtility scrshot;
	public WebDriver driver;
	public Properties properties;
	public FileInputStream fileinputstream;

	@BeforeMethod(alwaysRun = true) // for grouping to run
	@Parameters("browser")
	public void initializeBrowser(String browser) throws Exception {

		try {
			properties = new Properties();
			fileinputstream = new FileInputStream(Constants.CONFIG_FILE);
			properties.load(fileinputstream);

		} catch (Exception e) {
			System.out.println("Error");
		}
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Browser is incorrect");
		}
		driver.get(properties.getProperty("url"));

		// implicit wait after url loads
		// if we give 10 sec, element loads in 2 sec, but it will wait till 10, so dont
		// use for bigger time period
		// common wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waitutilities.implicitwait));
		driver.manage().window().maximize();

	}

	@AfterMethod(alwaysRun = true) // grouping
	/*
	 * public void quitandclose() { //driver.close(); // driver.quit();
	 * 
	 * }
	 */

	public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			scrshot = new ScreenShotUtility();
			scrshot.getScreenShot(driver, iTestResult.getName());
		}

		// driver.quit();
	}

}
