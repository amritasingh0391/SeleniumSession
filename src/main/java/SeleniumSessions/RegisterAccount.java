package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {
	
	public static void main(String[] args) {
		String browserName = "Chrome";
		BrowserUtil BroUtil = new BrowserUtil();
		
		WebDriver driver = BroUtil.initDriver(browserName);
		BroUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmpwd = By.id("input-confirm");
		By Subscribe = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]");
		By PrivacyPolicy = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By submitBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By header = By.tagName("h1");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Amrita");
		eleUtil.doSendKeys(lastName, "Singh");
		eleUtil.doSendKeys(emailId, "amritasingh01@gmail.com");
		eleUtil.doSendKeys(telephone, "8377844126");
		eleUtil.doSendKeys(password, "Amrita@123");
		eleUtil.doSendKeys(confirmpwd, "Amrita@123");
		eleUtil.doClick(Subscribe);
		eleUtil.doClick(PrivacyPolicy);
		eleUtil.doClick(submitBtn);
		String headerText = eleUtil.getText(header);
		if(headerText.equals(headerText)) {
			System.out.println("Header Display correct");
		}
		else {
			System.out.println("Header display incorrect");
		}
		
		
		

	}

}
