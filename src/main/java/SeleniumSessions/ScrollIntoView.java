package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Popular Gifts in Baby']"));
		JavaScriptUtil jsUtill = new JavaScriptUtil(driver);
		//jsUtill.scrollIntoView(ele);
		WebElement element = driver.findElement(By.linkText("Registry"));
		jsUtill.clickElementByJs(element);

	}

}
