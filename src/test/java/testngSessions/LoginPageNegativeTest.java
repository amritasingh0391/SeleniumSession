package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {

	public WebDriver driver;

	public boolean doLogin(String userName, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMesg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMesg);
		if (errorMesg.contains("No match for E-Mail Address and/or Password")) {
			return true;
		}
		return false;
	}
	
	@DataProvider
	public Object[][] getLoginNegativeData() {
		return new Object [] [] {
			{"abcccccc@gmail.com", "testttt@123"},
			{"abcccccc1212@gmail.com", "testttt@123"},
			{"abc@gmail.com", "testttt@123"},
			{"testtttt@gmail.com", " "},
			{"testtttt@gmail.com", "testtttt"},
			{"#@#@#@#@gmail.com", "asdasdasd"},
			
		};
	}
	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object [] [] {
			{"Heena", "Vaghela", "heena@gmail.com", "9090909098", "heena@123"},
			{"vinutha", "ravindra", "vinu@gmail.com", "9090909099", "vinu@123"},
			{"supriya", "bendukuri", "supriya@gmail.com", "9090909088", "sup@123"},
			
		};
	}
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test(dataProvider = "getLoginNegativeData" )
	public void LoginTest(String Un, String Pwd) {
		Assert.assertTrue(doLogin(Un, Pwd));
	}
	
	@Test(dataProvider = "getRegTestData")
	public void RegisterTest(String fn, String ln, String mob, String password) {
		System.out.println(fn+ ln+ mob+ password );
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
