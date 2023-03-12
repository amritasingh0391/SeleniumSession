package SeleniumSessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/sa20-2022-23-1335268/mi-cape-town-vs-pretoria-capitals-20th-match-1343960/full-scorecard");
		Thread.sleep(4000);
		
		String wTName = getWicketTakerName("Will Jacks");
		System.out.println(wTName);
		
		List<String> willJKScoreList = getScoreCardList("Will Jacks");
		System.out.println(willJKScoreList);
	
	}
	public static String getWicketTakerName(String batsmanName) {
		return driver.findElement(By.xpath("(//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td//span)[2]")).getText();
	}
	
	public static List<String> getScoreCardList(String playerName) {
		List<WebElement> scoreList= driver
		.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		
		List<String> playerList = new ArrayList<String>();
		for(WebElement e: scoreList) {
			String Text = e.getText();
			playerList.add(Text);
		}
		return playerList;
	}

}
