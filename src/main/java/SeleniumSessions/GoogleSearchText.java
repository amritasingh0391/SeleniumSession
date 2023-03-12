package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By googleSugg = By.xpath("//ul[@class='G43f7e']/li");

		driver.findElement(By.name("q")).sendKeys("Naveen automation labs");
		Thread.sleep(3000);
		/*
		 * List<WebElement> Sugglist =
		 * driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		 * System.out.println(Sugglist.size()); for (WebElement e : Sugglist) { String
		 * Text = e.getText(); System.out.println(Text); if
		 * (Text.equals("naveen automation labs github")) { e.click(); break; } }
		 */

		doSearch(googleSugg, "naveen automation labs github");

		// driver.quit();

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSearch(By locator, String value) {
		List<WebElement> Sugglist = getElements(locator);
		System.out.println(Sugglist.size());
		for (WebElement e : Sugglist) {
			String Text = e.getText();
			if (Text.length() > 0) {
				System.out.println(Text);
			}
		}
		

	}
}
