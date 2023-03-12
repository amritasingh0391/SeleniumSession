package testngSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	@Test(priority = 1)
	public void titleTest() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Page Title" + title);
		Assert.assertEquals(title, "Google");
	}

}
