package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName = "Chrome";
		String url = null ;
		
		BrowserUtil At = new BrowserUtil();
		
		At.initDriver(browserName);
		At.launchURL(url);
		At.getPageTitle();
		At.getCurrentUrl();
		At.quitBrowser();
	

	}

}
