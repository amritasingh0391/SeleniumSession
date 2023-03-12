package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
			while(true) {
				if(driver.findElements(By.xpath("//tr/td[contains(text(),'Denmark')]")).size() > 0 ) {
					selectCountry("Denmark");
				}
					//pagination Logic 
					WebElement next = driver.findElement(By.linkText("Next"));
					if(next.getAttribute("class").contains("disabled")) {
				System.out.println("pagination is over...country is not found....");
					break;
				}
				next.click();
			Thread.sleep(10000);
					
				}
			}
	
	public static void selectCountry(String CountryName) {
		List<WebElement> CheckBoxList = driver.findElements(By.xpath("//tr/td[contains(text(),'"+CountryName+"')]/preceding-sibling::td//input[@type='checkbox']"));
		for(WebElement e: CheckBoxList) {
			e.click();
		}
	}
			
	}
		

