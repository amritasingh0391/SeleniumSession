package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https:\\www.amazon.com");
		driver.manage().window().maximize();
		
		/*
		 * //find all links on the page List<WebElement> TotalLinks =
		 * driver.findElements(By.tagName("a"));
		 * 
		 * //print the total links count int Count = TotalLinks.size();
		 * System.out.println(Count);
		 * 
		 * //For Each
		 * 
		 * for(WebElement e : TotalLinks) { String Text = e.getText(); if(Text.length()>
		 * 0 ) { System.out.println(Text); } }
		 */
		  
		  //Locator
		  By links = By.tagName("a");
		  getTotalElementsCount(links);
		  driver.quit();

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getTotalElementsCount(By locator ) {
		int eleCount = getElements(locator).size();
		System.out.println("Total Elements for :" + eleCount + " --> " + locator);
		return eleCount;

	}
}
