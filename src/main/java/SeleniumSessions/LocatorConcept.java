package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver ;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. first Approach
		
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		 */
		//2. Second Approach 
		
		/*
		 * WebElement emailId = driver.findElement(By.id("input-email")); WebElement
		 * password = driver.findElement(By.id("input-password"));
		 * emailId.sendKeys("naveen@gmail.com"); password.sendKeys("naveen@123");
		 */
		
		//3. Third Approach by locator
		
		/*
		 * By emailId = By.id("input-email"); By password = By.id("input-password");
		 * 
		 * WebElement eId = driver.findElement(emailId); WebElement ePwd =
		 * driver.findElement(password);
		 * 
		 * eId.sendKeys("naveen@gmail.com"); ePwd.sendKeys("naveen@123");
		 */
		//4. By locator + generic method for webelement
		
		/*
		 * By emailId = By.id("input-email"); By password = By.id("input-password");
		 * 
		 * getElement(emailId).sendKeys("naveen@gmail.com");
		 * getElement(password).sendKeys("naveen@123");
		 */
		 
		 //5. By locator + generic methods for webelement and actions
		 
			/*
			 * By emailId = By.id("input-email"); By password = By.id("input-password");
			 * doSendKeys(emailId, "naveen@gmail.com"); doSendKeys(password, "naveen@123");
			 */
		
		//6th: By locator + generic methods for webelement and actions in a ElementUtil class
		
		By emailId = By.id("input-email"); 
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		eleUtil.doSendKeys(password, "naveen@123");
		
			 	
	}
	
	/*
	 * public static WebElement getElement(By locator) { return
	 * driver.findElement(locator); }
	 * 
	 * public static void doSendKeys(By locator, String value) {
	 * getElement(locator).sendKeys(value); }
	 */

}
