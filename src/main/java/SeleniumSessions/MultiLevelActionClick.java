package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelActionClick {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		/*
		 Actions act = new Actions(driver);
		 * WebElement Category = driver.findElement(By.linkText("SHOP BY CATEGORY"));
		 * act.moveToElement(Category).build().perform(); Thread.sleep(3000);
		 * act.moveToElement(driver.findElement(By.linkText("Beverages"))).build().
		 * perform();
		 * act.moveToElement(driver.findElement(By.linkText("Tea"))).build().perform();
		 * driver.findElement(By.linkText("Tea Bags")).click();
		 */
		By L1 = By.linkText("SHOP BY CATEGORY");
		By L2 = By.linkText("Beauty & Hygiene");
		By L3 = By.linkText("Skin Care");
		By L4 = By.linkText("Face Care");
		MultiLevelHover(L1,L2,L3,L4);
	}
	
	public static void MultiLevelHover(By L1, By L2, By L3,By L4) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(L1)).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(L2)).build().perform();
		act.moveToElement(driver.findElement(L3)).build().perform();
		driver.findElement(L4).click();
	}
	

}
