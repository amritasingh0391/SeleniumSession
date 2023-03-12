package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksCount {

	public static void main(String[] args) {
		
	WebDriver driver;
	
	driver = new ChromeDriver();
	driver.get("https:\\www.amazon.com");
	driver.manage().window().maximize();
	
	//find all links on the page
	List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));
	
	//print the total links count
	int Count = TotalLinks.size();
	System.out.println(Count);
	
	//print the text of each link
	//and avoid blank text
	/*for (int i=0 ;i<Count; i++){
		String Text = TotalLinks.get(i).getText();
		if(Text.length() > 0 ) {
			System.out.println(Text);
		}
		
	}*/
	
	//For Each 
	

	  for(WebElement e : TotalLinks) { 
		  String Text = e.getText(); 
		  if(Text.length()> 0 ) { 
			  System.out.println(Text); 
			  } 
		  }
	 
	
	//get total blank links count??? --- assignment
	
	int counter = 0;
	for(WebElement e : TotalLinks) {
		String Text = e.getText();
		if(Text.length() <= 0 ) {
			counter++;
			System.out.println(counter + ":" + Text);
		}
	}
	 // Total Image Count 
	
	List<WebElement> imgLinks = driver.findElements(By.tagName("img"));
	 int Totalimgcount = imgLinks.size();
	 System.out.println(Totalimgcount);

	}

}
