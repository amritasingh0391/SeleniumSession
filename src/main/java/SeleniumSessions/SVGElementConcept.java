package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		List<WebElement> StateList = driver.findElements(By.xpath(
				"//*[local-name()='svg' and @id ='map-svg']//*[name()='g' and @id ='regions']//*[name()='path']"));
		System.out.println(StateList.size());
	
		 for(WebElement e: StateList) {
		 String Text =e.getAttribute("name");
		  System.out.println(Text); 
		  if(Text.equals("Maryland")) { 
			  e.click(); 
			  break; 
			  } 
		  }
		 List<WebElement> StateList1 = driver.findElements(By.xpath("//*[local-name()='g' and @id = 'maryland']//*[name()='path']"));
			System.out.println(StateList1.size());
			
			 for(WebElement e: StateList1) {
				 String Text1 =e.getAttribute("name");
			  System.out.println(Text1); }
			
		 
	}
}