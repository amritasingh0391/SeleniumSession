package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html\']"));
		driver.switchTo().frame(Frame1);
		String Text = driver.findElement(By.xpath("//div[@class ='iframe-container']")).getText();
		System.out.println(Text);
		WebElement Frame2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(Frame2);
		String Text1 = driver.findElement(By.xpath("//div[@class ='container' and h5]")).getText();
		System.out.println(Text1);
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Amrita");
		driver.switchTo().parentFrame();
		String Text3 = driver.findElement(By.xpath("//div[@class ='iframe-container']")).getText();
		System.out.println(Text3);
		
		
		

	}

}
