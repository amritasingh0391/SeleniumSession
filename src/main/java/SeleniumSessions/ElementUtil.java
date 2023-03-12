package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	 public WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
	 
	 public List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		public  void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);
		}
		
		public void doClick(By locator) {
			getElement(locator).click();
		}
		
		public String getText(By locator) {
			return getElement(locator).getText();
		}
		
		public boolean doElementIsDisplayed(By loc) {
			return getElement(loc).isDisplayed();
		}
		
		public int getTotalElementsCount(By locator ) {
			int eleCount = getElements(locator).size();
			System.out.println("Total Elements for :" + eleCount + " --> " + locator);
			return eleCount;
		}
		
		public String getAttribute(By locator, String attr) {
			String attribute =  getElement(locator).getAttribute(attr);
			System.out.println(attribute);
			return attribute;
		}
		public List<String> getElementsTextList(By locator) {
			List<String> eleTextList = new ArrayList<String>();
			List<WebElement> elemList = driver.findElements(locator);
			for(WebElement e: elemList) {
				String Text = e.getText();
				eleTextList.add(Text);
			}
			return eleTextList;
		}
		
		public void getElementsAttribute(By locator, String attrName) {
			List<WebElement> eleList = getElements(locator);
			for(WebElement e: eleList) {
				String attrValue = e.getAttribute(attrName);
				System.out.println(attrValue);
			}

}
		
		// *************************Select based drop down utils****************//
		
		public void doSelectDropDownByIndex(By locator, int index) {
			Select select = new Select(getElement(locator));
			select.selectByIndex(index);
		}
		
		public void doSelectDropDownByvalue(By locator, String value) {
			Select select = new Select(getElement(locator));
			select.selectByValue(value);
		}
		public void doSelectDropDownByVisibleText(By locator, String Text) {
			Select select = new Select(getElement(locator));
			select.selectByVisibleText(Text);
		}
}
