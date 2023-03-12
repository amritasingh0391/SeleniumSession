package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
	static WebDriver driver;
	
	public static void main(String[] args ) {
		//8 locators:
		//id, name, classname, xpath, css selector, linktext, partial link text, tag name

		//create a webelement + perform action (click, sendkeys, gettext, isDisplayed....)
				
		//create a webelement: need a locator
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//1. id: Unique
	      driver.findElement(By.id("input-firstname")).sendKeys("Amrita");
	      
	   //2. Name: Can be duplicate
	      driver.findElement(By.name("lastname")).sendKeys("Singh");;
	     
	   //3. ClassName:  can be duplicate most of the time - not recommended if its duplicate (use class name only if its unique)
	   // By.className("form-control"); duplicate class
	     
	   //4. xpath its not an attribute. its the address of the element in HTML DOM
	     
	   driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("8377844126");;
	   
	   //5. css selector not an attribute
	   
	   driver.findElement(By.cssSelector("#input-password")).sendKeys("amrita@123");;
	   
	   //6. Link text only for links --> htmltag = a . LinkText can be duplicate
		//its not an attribute -- its the text of the link
	   driver.findElement(By.linkText("Register")).click();
	   
	  //7. Partial Link text : only for links
	   
	   driver.findElement(By.partialLinkText("Forgotten")).click();
	   
	  //8.tagName: htmltags
	   
	  String Header = driver.findElement(By.tagName("h1")).getText();
	   System.out.println(Header);
	}

}
