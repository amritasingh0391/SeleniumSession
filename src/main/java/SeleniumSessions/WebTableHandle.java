package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		selectUser("Ali khan");
		String cName = getUserCompanyName("Ali khan");
		System.out.println(cName);
		String pNumber = getUserPhoneNum("Ali khan");
		System.out.println(pNumber);
		String hPhoneNumber = getUserHomePhoneNum("Ali khan");
		System.out.println(hPhoneNumber);
		String emailId = getUserEmailId("Ali khan");
		System.out.println(emailId);
		selectUser("deepti gupta");
		cName = getUserCompanyName("deepti gupta");
		System.out.println(cName);
		pNumber = getUserPhoneNum("deepti gupta");
		System.out.println(pNumber);
		hPhoneNumber = getUserHomePhoneNum("deepti gupta");
		System.out.println(hPhoneNumber);
		selectUser("deepti gupta");
		emailId = getUserEmailId("deepti gupta");
		System.out.println(emailId);
	}

	public static void selectUser(String userName) {
		driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static String getUserCompanyName(String userName) {
		return driver
				.findElement(By
						.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td/a[@context='company']"))
				.getText();
	}

	public static String getUserPhoneNum(String userName) {
		return driver
				.findElement(By.xpath(
						"(//a[text()='" + userName + "']/parent::td/following-sibling::td/span[@context='phone'])[1]"))
				.getText();

	}

	public static String getUserHomePhoneNum(String userName) {
		return driver
				.findElement(By.xpath(
						"(//a[text()='" + userName + "']/parent::td/following-sibling::td/span[@context='phone'])[2]"))
				.getText();
	}

	public static String getUserEmailId(String userName) {
		return driver
				.findElement(By.xpath(
						"//a[text()='" + userName + "']/parent::td/following-sibling::td/a[contains(@href,'mailto')]"))
				.getText();
	}
}
