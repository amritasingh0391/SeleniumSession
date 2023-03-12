package testngSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters({"url", "browser"})
	@BeforeMethod
	public void setup(String url, String browserName) {
		System.out.println("running Test on :" + browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Driver Close");
		driver.quit();
	}

	
}
