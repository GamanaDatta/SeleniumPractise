package SeleniumPractise25.SeleniumPractise25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRMLoginPage {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("macbook pro");
		Thread.sleep(4000);
		
		List<WebElement> suggList = driver.findElements(By.xpath("//a[@class='oleBil']/div[2]"));
		System.out.println(suggList.size());
		
		for(int i=0; i<suggList.size(); i++) {
			String text = suggList.get(i).getText();
			System.out.println(text);
				if(text.contains("m4 max")) {
					suggList.get(i).click();
					break;
				}
		}
		
		
		
}
}
