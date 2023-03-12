package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https:\\www.amazon.com");
		driver.manage().window().maximize();
		
		By link = By.tagName("a");
		getElementsAttribute(link, "href");
		
		/*
		 * List<WebElement> linkList = getElements(link); int linksCount =
		 * linkList.size(); System.out.println("Total linkList:" + linksCount);
		 * 
		 * //for each for(WebElement e: linkList) { String hrefVal=
		 * e.getAttribute("href"); System.out.println(hrefVal); }
		 */
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void getElementsAttribute(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e: eleList) {
			String attrValue = e.getAttribute(attrName);
			System.out.println(attrValue);
		}
	}

}
