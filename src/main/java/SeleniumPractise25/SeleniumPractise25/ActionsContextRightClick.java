package SeleniumPractise25.SeleniumPractise25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsContextRightClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions act = new Actions(driver);
		
		act
			.contextClick(driver.findElement(By.cssSelector("span.context-menu-one")))
					.perform();
		
		
		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul.context-menu-list > li >span"));
		System.out.println(optionsList.size());
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
				if(text.contains("Copy")) {
					e.click();
					break;
				}
		}
	
	
	}

	
}
