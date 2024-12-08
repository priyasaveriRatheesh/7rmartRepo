package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitutilities {
	
	public static final int implicitwait=10;//only once using after loading url,if we give 10sec but the element load within 2 sec
	//it will wait until 10 sec over so wasete of time
	//testclass/base classie,src test 
	//static or common wait is called implicit wait,give  wait in seconds
	public static final long EXPLICITWAIT=10;//specify chyt kodukkm atayat aarkano vendat avark kodukkm so called
	//dyndmic wait
	//src main/page class
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));//apply conditions
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));// can apply conditions
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitForElement(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.visibilityOf(target));
	}
	public void waitForAlertToBeVisible(WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	    wait.until(ExpectedConditions.alertIsPresent());
}

public void waitForElementIsSelectable(WebDriver driver,WebElement element) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
    wait.until(ExpectedConditions.elementSelectionStateToBe(element, false));
}


}