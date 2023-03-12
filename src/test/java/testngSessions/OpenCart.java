package testngSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCart extends BaseTest{
	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("Page Title" + title);
		Assert.assertEquals(title, "Your Store");
	}
}
