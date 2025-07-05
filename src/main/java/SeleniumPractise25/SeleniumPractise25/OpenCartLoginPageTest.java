package SeleniumPractise25.SeleniumPractise25;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenCartLoginPageTest {
	
public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("edge");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = brUtil.getPageTitle();
		VerficationUtil.verifyEquals(title, "Account Login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginbtn = By.xpath("//input[@class='btn btn-primary']");
		
		By RegisterBtn = By.xpath("//a[2][@class='list-group-item']");
		
		Elementutil eleUtil = new Elementutil(driver);
		
		//eleUtil.doSendKeys(email, "naveen@open.com");
		//eleUtil.doSendKeys(password, "naveen@123");
		//eleUtil.clickbtn(loginbtn);
		Thread.sleep(2000);
		;
		eleUtil.clickbtn(RegisterBtn);
		
		String Registers_screen_title = driver.findElement(By.cssSelector("#content > h1")).getText();
		
		System.out.println(Registers_screen_title);
		
		VerficationUtil.verifyEquals(Registers_screen_title, "Register Account");
		
		//RegisterPage Webelements
		
		By F_Name = By.name("firstname");
		By L_Name = By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[3]/div/input");
		By R_Email = By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input");
		By Telephone = By.name("telephone");
		By Pwd = By.xpath("//input[@id='input-password']");
		By C_Pwd = By.xpath("//input[@name='confirm']");
		
		By radiobtn = By.xpath("//input[@value='0']");
		By checkbox = By.xpath("//input[@type='checkbox']");
		By Cont = By.xpath("//input[@value='Continue']");
		
		//RegisterPage actions
		
		String mail  = UUID.randomUUID().toString();
		eleUtil.doSendKeys(F_Name, "GAMANA");
		eleUtil.doSendKeys(L_Name, "DATTA");
		eleUtil.doSendKeys(R_Email, mail+"@gmail.com");
		eleUtil.doSendKeys(Telephone, "9876543210");
		eleUtil.doSendKeys(Pwd, "*********");
		eleUtil.doSendKeys(C_Pwd, "*********");

	
		eleUtil.clickbtn(radiobtn);
		eleUtil.clickbtn(checkbox);
		eleUtil.clickbtn(Cont);
				
		//AccountCreationSuccess
		Thread.sleep(2000);
		String successmsg = driver.findElement( By.tagName("h1")).getText();	
		VerficationUtil.verifyEquals(successmsg, "Your Account Has Been Created!");
		
		brUtil.quitBrowser();
	}
	
}
