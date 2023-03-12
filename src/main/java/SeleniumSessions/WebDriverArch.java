package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverArch {

	public static void main(String[] args) {
		
	WebDriver driver = null;
	String browser = "chrome";
	
	//cross browser logic
	
	switch (browser) {
	case "chrome" :
	driver = new ChromeDriver();
	System.out.println("Chrome is launched");
	}
	
	switch (browser) {
	case "Firefox" :
	driver = new FirefoxDriver();
	System.out.println("firefox is launched");
	//enter the URL
	driver.get("https://www.google.com");	
	//get the title
	String Title = driver.getTitle();
	System.out.println("Page Title: " + Title);
	}
	
	switch (browser) {
	case "Edge" :
	driver = new EdgeDriver();
	System.out.println("edge is launched");
	//enter the URL
	driver.get("https://www.google.com");	
	//get the title
	String Title = driver.getTitle();
	System.out.println("Page Title: " + Title);
	}
	
	switch (browser) {
	case "safari" :
	driver = new SafariDriver();
	System.out.println("safari is launched");
	}

	}

}
