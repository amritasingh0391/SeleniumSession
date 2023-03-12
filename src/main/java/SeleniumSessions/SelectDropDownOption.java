package SeleniumSessions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOption {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// locator 
		By SortBy= By.id("input-sort");
		
		// Create an WebElement
		//WebElement WebEle = driver.findElement(SortBy);
		
		//DropDown option: Select Html tag
		/*
		 * Select select = new Select(WebEle); select.selectByIndex(3); //select option
		 * using index select.selectByValue(
		 * "https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24&sort=pd.name&order=DESC"
		 * );//select option using select.selectByVisibleText("Name (A - Z)"); //select
		 * option using visible text driver.quit();
		 */
		
		doSelectDropDownByIndex(SortBy, 3);
		Thread.sleep(3000);
		doSelectDropDownByvalue(SortBy, "https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24&sort=rating&order=DESC");
		Thread.sleep(3000);
		doSelectDropDownByVisibleText(SortBy, "Default");
		driver.quit();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByvalue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropDownByVisibleText(By locator, String Text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(Text);
	}
	
}
