package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	@BeforeSuite
	public void DBConnections() {
		System.out.println("BS--DB Connection started");
	}
	@BeforeTest
	public void CreateUser() {
		System.out.println("BT--User Created");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC--Launch Browser");
	}
	
	@BeforeMethod
	public void LoginToApp() {
		System.out.println("BM--Login To App");
	}
	
	@Test
	public void loginPageURLtest() {
		System.out.println("T--Login Page URL Test");
	}
	
	@Test
	public void loginPageTitletest() {
		System.out.println("T--Login Page Title Test");
	}
	
	@Test
	public void loginPageSearchTest() {
		System.out.println("T--Login Page Search Test");
	}
	
	@AfterMethod
	public void LogoutToApp() {
		System.out.println("AM--Logout To App");
	}
	
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("AC--lose Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT--Delete User");
	}
	
	@AfterSuite
	public void DBConnectionsClose() {
		System.out.println("AS--DB Connection closed");
	}

}
