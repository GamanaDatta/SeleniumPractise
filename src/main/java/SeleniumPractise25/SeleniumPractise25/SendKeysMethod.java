package SeleniumPractise25.SeleniumPractise25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SendKeysMethod {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();// browser
		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		String emailId = "naveen@gmail.com";
//		StringBuilder emailIdBuilder = new StringBuilder("tom@gmail.com");
//		StringBuffer emailIdBuffer = new StringBuffer("test@gmail.com");
//
//		driver.findElement(By.id("input-email")).sendKeys(emailId,emailIdBuilder,emailIdBuffer);
//		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String initialName = "Gaman";
		String middleName = "Dutt";
		String lastName = "PK";
		
		driver.findElement(By.id("input-firstname")).sendKeys(initialName," ",middleName," ",lastName);
		
		//null is not allowed
		//driver.findElement(By.id("input-lastname")).sendKeys(null);
		
		By lastname = By.id("input-lastname");
		Elementutil eleUtil = new Elementutil(driver);
		eleUtil.doSendKeys(lastname, "testing");
		
		//sendKeys:
		//single value - allowed
		//multiple values -- allowed
		//String, SB, SBF --- allowed
		//null -- not allowed
		
		
		
		
	}
}
