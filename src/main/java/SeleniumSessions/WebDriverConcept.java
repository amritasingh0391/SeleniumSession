package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverConcept {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String browser = "Chrome";
		
		if(browser.contains("Safari")) {
			driver = new SafariDriver();
			System.out.println("Safari Driver Launched");
		}
		else if (browser.contains("Chrome")){
			driver = new ChromeDriver();
			System.out.println("Chrome Driver Launched");
		}
		
		else if (browser.contains("Firefox")){
			driver = new FirefoxDriver();
			System.out.println("Safari Driver Launched");
		}
		else if (browser.contains("Edge")){
			driver = new EdgeDriver();
			System.out.println("Safari Driver Launched");
		}
		
		else {
			System.out.println("please pass the right browser....\" + browser");
		}
		
		//Get the URL
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pgSrc = driver.getPageSource();
		//System.out.println(pgSrc);
		if(pgSrc.contains("Amazon.com. Spend less. Smile more.")) {
		System.out.println("Pass");	
		}
		else {
			System.out.println("Fail");
		}
		//get the title
		String Title = driver.getTitle();
		System.out.println("Page Title: " + Title);
		driver.quit();
	}

}
