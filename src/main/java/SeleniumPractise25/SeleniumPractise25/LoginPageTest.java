package SeleniumPractise25.SeleniumPractise25;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();

		brUtil.initDriver("chrome");

		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String title = brUtil.getPageTitle();

		VerficationUtil.verifyEquals(title, "Account Login");

		String appUrl = brUtil.getPageUrl();
		VerficationUtil.verifyContains(appUrl, "route=account/login");

		brUtil.quitBrowser();

	}
}
