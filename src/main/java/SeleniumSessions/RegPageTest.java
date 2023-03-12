package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		
		String browserName = "Chrome";
		
		BrowserUtil broUtil = new BrowserUtil();
		WebDriver driver = broUtil.initDriver(browserName);
		broUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		broUtil.getPageTitle();
		
		//By locator 
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmpwd = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(firstName, "Amrita");
		eleUtil.doSendKeys(lastName, "Singh");
		eleUtil.doSendKeys(emailId, "amritasingh0391@gmail.com");
		eleUtil.doSendKeys(telephone, "8377844126");
		eleUtil.doSendKeys(password, "Amrita@123");
		eleUtil.doSendKeys(confirmpwd, "Amrita@123");
		

	}

}
