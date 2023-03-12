package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https:\\www.amazon.com");
		driver.manage().window().maximize();

		// 1. First Approach:

		/*
		 * Boolean flag = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		 * if(flag == true) { System.out.println("Amazon image is displayed" + ": " +
		 * flag); } else { System.out.println("Amazon image isn't displayed" + ": " +
		 * flag); }
		 */

		// 2. Second Approach:

		By logoImg = By.id("nav-logo-sprites");
		By cartImg = By.id("nav-cart-text-container");
		Boolean flag = doElementIsDisplayed(logoImg);
		if (flag == true) {
			System.out.println("Amazon image is displayed" + ": " + flag);
		} else {
			System.out.println("Amazon image isn't displayed" + ": " + flag);
		}

		Boolean flag1 = doElementIsDisplayed(cartImg);
		if (flag1 == true) {
			System.out.println("Cart image is displayed" + ": " + flag1);
		} else {
			System.out.println("Cart image isn't displayed" + ": " + flag1);
		}

		driver.quit();
	}

	public static WebElement getElement(By loc) {
		return driver.findElement(loc);
	}

	public static boolean doElementIsDisplayed(By loc) {
		return getElement(loc).isDisplayed();
	}

}
