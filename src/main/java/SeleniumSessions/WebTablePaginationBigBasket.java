package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationBigBasket {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		
		while(true) {
			By product = By.linkText("Cashew/Godambi - Whole");
			if(driver.findElements(product).size()>=1) {
				BestSeller(product);
				break;
			}
			else {
				WebElement ForwardArrow = driver.findElement(By.xpath("//div[@class = 'carousel-wrap owl-pd-wrap']//div[@class='owl-next']"));
				ForwardArrow.click();
				Thread.sleep(4000);
			}		
			
		}
	}
	
	public static void BestSeller(By locator) {
		driver.findElement(locator).click();
		
	}

}
