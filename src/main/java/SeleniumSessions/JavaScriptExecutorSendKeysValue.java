package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorSendKeysValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		JavaScriptUtil JsUtill = new JavaScriptUtil(driver);
		JsUtill.sendKeysValueWithId("input-email" , "amritasingh0391");

	}

}