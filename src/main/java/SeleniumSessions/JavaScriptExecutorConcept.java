package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		String Title = Js.executeScript("return document.title").toString();
		System.out.println(Title);
		JavaScriptUtil JsUtill = new JavaScriptUtil(driver);
		JsUtill.GenerateAlert("Hi Amrita");

	}

}
