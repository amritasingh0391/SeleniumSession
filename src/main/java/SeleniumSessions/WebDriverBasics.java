package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Drvier launched suceessfully");
		
		//enter the URL
		driver.get("https://www.google.com");
		
		//get the title
		String Title = driver.getTitle();
		System.out.println("page Title: "+ Title);
		driver.close();
		String Title1 = driver.getTitle();
		System.out.println(Title1);
	}

}
