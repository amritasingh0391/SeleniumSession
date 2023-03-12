package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https:\\www.amazon.com");
		driver.manage().window().maximize();
	
		/*
		 * String hrefVal =
		 * driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");
		 * System.out.println(hrefVal);
		 */
		
		//Locator
		By logoImg = By.id("nav-logo-sprites");
		getAttribute(logoImg, "href");
		driver.quit();
	}
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public static String getAttribute(By locator, String attr) {
		String attribute =  getElement(locator).getAttribute(attr);
		System.out.println(attribute);
		return attribute;
	}

}
