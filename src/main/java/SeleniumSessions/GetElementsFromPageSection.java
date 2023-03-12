package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		/*
		 * List<WebElement> panelList =
		 * driver.findElements(By.xpath("//aside[@id='column-right']//a")); int
		 * panelLinksList = panelList.size(); System.out.println(panelLinksList); //for
		 * each for(WebElement e: panelList) { String Text = e.getText();
		 * System.out.println(Text); }
		 */
		
		By rightPanelLinks = By.xpath("//aside[@id='column-right']//a");
		List<String> panelList= getElementsTextList(rightPanelLinks);
		System.out.println(panelList);
		driver.quit();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = driver.findElements(locator);
		for(WebElement e: eleList) {
			String Text = e.getText();
			eleTextList.add(Text);
		}
		return eleTextList;
	}

}
