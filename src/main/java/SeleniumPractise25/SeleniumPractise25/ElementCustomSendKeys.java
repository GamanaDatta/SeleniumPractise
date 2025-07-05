package SeleniumPractise25.SeleniumPractise25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCustomSendKeys {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();// browser
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstname = By.id("input-firstname");
		Elementutil eleUtil = new Elementutil(driver);
		
		eleUtil.doMultipleSendKeys(firstname, "naveen", " ", "automation", " ", null);
		

		
	}
}
