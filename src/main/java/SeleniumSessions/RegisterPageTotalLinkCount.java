package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPageTotalLinkCount {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> linksList =  driver.findElements(By.tagName("input"));
		int count = linksList.size();
		System.out.println(count);
		
		int count1 =0;
		for(WebElement e: linksList) {
			String text = e.getText();
			if(text.length()<=0) {
				System.out.println(count1 + ":" + text);
			}
			count1++;
		}

	}

}
