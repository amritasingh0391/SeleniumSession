package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver ;
	
	/**
	 * @param
	 * @return
	 */
	
	public WebDriver initDriver(String browserName) {
		
		switch(browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
		break;
		
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "Edge":
			driver = new EdgeDriver();
			break;
			
		case "Safari":
			driver = new EdgeDriver();
			break;
			
		default:
			System.out.println("Pleease pass the correct BrowserName" + browserName);
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		
		
	}
	
	public void launchURL(String url) {
		
		if(url == null) {
			System.out.println("URL can't be null");
		}
		
		if(url.indexOf("https")== 0) {
			driver.get(url);
		}
	}
	
	public String getPageTitle() {
		String Title = driver.getTitle();
		System.out.println("Page Title :"+ Title);
		return Title;
	}
	
	public String getCurrentUrl(){
		String url = driver.getCurrentUrl();
		System.out.println("Current url: " + url);
		return url; 	
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}
