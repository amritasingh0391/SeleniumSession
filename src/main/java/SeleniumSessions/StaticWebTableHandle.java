package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int HeaderCount = getTableHeaderCount();
		System.out.println(HeaderCount);
		int RowCount = getTableRowCount();
		System.out.println(RowCount);
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1]
		
		getFirstColumnValue();
		getSecondColumnValue();
		getThirdColumnValue();

	}
	
	public static int getTableHeaderCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}

	public static int getTableRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	}
	
	public static void getFirstColumnValue() {
		String beforexpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterxpath ="]/td[1]";
		for(int row=2 ; row<=7; row++) {
			String xpath = beforexpath + row + afterxpath ;
			String value = driver.findElement(By.xpath(xpath)).getText();
			System.out.println("First Column: " + value);
		}
	}
		public static void getSecondColumnValue() {
			String beforexpath = "//table[@id=\"customers\"]/tbody/tr[";
			String afterxpath ="]/td[2]";
			for(int row=2 ; row<=7; row++) {
				String xpath = beforexpath + row + afterxpath ;
				String value = driver.findElement(By.xpath(xpath)).getText();
				System.out.println("Second Column: " + value);
			}
		}
			public static void getThirdColumnValue() {
				String beforexpath = "//table[@id=\"customers\"]/tbody/tr[";
				String afterxpath ="]/td[3]";
				for(int row=2 ; row<=7; row++) {
					String xpath = beforexpath + row + afterxpath ;
					String value = driver.findElement(By.xpath(xpath)).getText();
					System.out.println("Third Column: " + value);
				}
				
	}
}
