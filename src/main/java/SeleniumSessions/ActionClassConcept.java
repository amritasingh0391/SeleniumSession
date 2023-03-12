package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Content')]"));
		Actions act = new Actions(driver);
		//act.moveToElement(menu).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
		
	}

}
