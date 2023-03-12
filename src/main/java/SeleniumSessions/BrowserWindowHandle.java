package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String ParentWindowId = driver.getWindowHandle();
		Thread.sleep(2000);

		// Get the window ids
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement youEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement linkEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		twEle.click();
		Thread.sleep(1000);
		
		youEle.click();
		Thread.sleep(1000);
		linkEle.click();
		Thread.sleep(1000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		
		while (it.hasNext()) {
			String WindowId = it.next();
			driver.switchTo().window(WindowId);
			System.out.println(WindowId);
			System.out.println(driver.getCurrentUrl());
			if (!WindowId.equals(ParentWindowId)) { 
				driver.close();
			  }
			driver.switchTo().window(ParentWindowId);
			System.out.println("Parent Window: "+driver.getCurrentUrl());
			System.out.println("Parent Window Title: "+ driver.getTitle());
			 
		}
		
		fbEle.click();
		Thread.sleep(1000);
		

	}

}
