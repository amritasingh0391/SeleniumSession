package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By lang = By.xpath("//div[@id='SIvCob']/a");
		By footerLinks = By.xpath("//div[@class='KxwPGc SSwjIe']//a[@class='pHiOh']");
		
		/*
		 * List<WebElement> LangLinks = driver.findElements(lang);
		 * System.out.println(LangLinks.size()); for(WebElement e: LangLinks) { String
		 * Text = e.getText(); System.out.println(Text); if(Text.equals("मराठी")) {
		 * e.click(); break; } }
		 */
		List <String> ActualLinkslist = getElementsLinksList(lang);
		System.out.println(ActualLinkslist);
		List <String> Actfooterlinklist = getElementsLinksList(footerLinks);
		System.out.println(Actfooterlinklist);
		doClickOnLink(lang, "मराठी");
		driver.quit();

	}
	

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsLinksCount(By locator) {
		return getElements(locator).size();
	}
	
	public static void doClickOnLink(By locator, String value) {
		List<WebElement> links = getElements(locator);
		for (WebElement e: links) {
			String Text = e.getText();
			if(Text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	public static List<String> getElementsLinksList(By locator) {
		List<WebElement> links = getElements(locator);
		List<String> linksList = new ArrayList();
		for(WebElement e: links) {
			String LinkText = e.getText();
			linksList.add(LinkText);
		}
		return linksList;
	}
}
