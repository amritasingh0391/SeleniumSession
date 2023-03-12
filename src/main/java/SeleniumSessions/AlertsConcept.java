package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConcept {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		//Alert Box:
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.className("signinbtn")).click();
		/*
		 * driver.get("https://nxtgenaiacademy.com/alertandpopup/"); Thread.sleep(4000);
		 * driver.findElement(By.xpath("//button[@name='alertbox']")).click(); Alert
		 * alert = driver.switchTo().alert(); String AlertText = alert.getText();
		 * System.out.println(AlertText); alert.accept();
		 */
		//alert.dismiss();
		
		
		//Confirm Alert Box:
		
		/*
		 * driver.get("https://nxtgenaiacademy.com/alertandpopup/"); Thread.sleep(4000);
		 * driver.findElement(By.name("confirmalertbox")).click(); Alert alert =
		 * driver.switchTo().alert(); String AlertText = alert.getText();
		 * System.out.println(AlertText); alert.accept(); alert.dismiss();
		 */
		
		
		//Prompt Alert Box:
		
		/*
		 * driver.get("https://nxtgenaiacademy.com/alertandpopup/"); Thread.sleep(4000);
		 * driver.findElement(By.name("promptalertbox1234")).click(); Alert alert =
		 * driver.switchTo().alert(); String AlertText = alert.getText();
		 * System.out.println(AlertText); alert.sendKeys("Yes"); //alert.accept();
		 * alert.dismiss();
		 */
		
		
		//Single IFrame:
		
		/*
		 * driver.get("https://demo.automationtesting.in/Frames.html");
		 * Thread.sleep(4000); driver.switchTo().frame("SingleFrame");
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation");
		 */
		
		
		//IFrame with in an Iframe:
		
		/*
		 * driver.get("https://demo.automationtesting.in/Frames.html");
		 * Thread.sleep(4000);
		 * driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		 * driver.switchTo().frame(1);
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation");
		 */
		
		
		//Upload a File
		
		/*
		 * driver.get("https://demo.automationtesting.in/Register.html");
		 * Thread.sleep(4000); driver.findElement(By.id("imagesrc")).sendKeys(
		 * "C:\\Users\\Ashutosh\\Pictures\\Screenshots\\Screenshot.png");
		 */
		 
		//AuthPopUpHandle
		 
		String username = "admin";
		String password = "admin";
		 //driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		 Thread.sleep(4000); 
		
		


		
		
	}
	

}
