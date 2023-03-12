package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with; 	
public class RelativeLocatorConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.linkText("Laval, Canada"));
		String AQI = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(AQI);
		String Rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(Rank);
		String AboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(AboveCity);
		String BelowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(BelowCity);
		String near = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(near);
		//driver.close();
		

	}

}
