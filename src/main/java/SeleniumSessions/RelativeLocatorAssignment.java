package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorAssignment {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		String AboveText = driver.findElement(with(By.tagName("h2")).above(ele)).getText();
		System.out.println("Above Text:"+ AboveText);
		String BelowText = driver.findElement(with(By.tagName("input")).below(ele)).getText();
		System.out.println("Below Email Address:"+ BelowText);
		
		WebElement ele1 = driver.findElement(By.xpath("//strong[text()='Register Account']"));
		String AboveText1 = driver.findElement(with(By.tagName("h2")).above(ele1)).getText();
		System.out.println("Above Text:"+ AboveText1);
		String BelowText1 = driver.findElement(with(By.tagName("p")).below(ele1)).getText();
		System.out.println("Below Text:"+ BelowText1);
		String BelowText2 = driver.findElement(with(By.tagName("a")).below(ele1)).getText();
		System.out.println("Below Text:"+ BelowText2);

	}

}
