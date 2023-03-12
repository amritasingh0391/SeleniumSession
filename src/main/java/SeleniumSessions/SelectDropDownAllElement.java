package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElement {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24");
		driver.manage().window().maximize();
		
		// locator 
		By SortBy= By.id("input-sort");
		By Show = By.id("input-limit");
		
		/*
		 * Select select = new Select(driver.findElement(SortBy)); List<WebElement>
		 * DropDownlist= select.getOptions();
		 * System.out.println("DropDown option list count: " + DropDownlist.size());
		 */
		
		DoGetDropDownListCount(SortBy);
		DoGetDropDownListCount(Show);
		List<String> SortByList = DoGetDropDownListText(SortBy);
		System.out.println(SortByList);
		List<String> ShowList =DoGetDropDownListText(Show);
		System.out.println(ShowList);
		selectDropDownValue(SortBy, "Default");
		selectDropDownValue(Show, "25");
		driver.quit();
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	public static int DoGetDropDownListCount(By locator) {
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("total options ==> " + optionsCount);
		return optionsCount;
	}
	
	public static List<String> DoGetDropDownListText(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String>  optionsTextList = new ArrayList();
		for(WebElement e: optionsList) {
			String Text = e.getText();
			optionsTextList.add(Text);
		}
		return optionsTextList;
	}
	public static void selectDropDownValue(By locator, String text) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for(WebElement e: optionsList) {
			String Text = e.getText();
			System.out.println(text);
			if(Text.equals(text)) {
				e.click();
				break;
			}
			
		}
	}
	


}
