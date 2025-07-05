package SeleniumPractise25.SeleniumPractise25;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elementutil {
	private WebDriver driver;

	public Elementutil(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKeys(By locator, String value) {
		if (value == null) {
			throw new ElementException("===value can not be null====");
		}
		getElement(locator).sendKeys(value);
	}
	public void doMultipleSendKeys(By locator, CharSequence... value) {
		getElement(locator).sendKeys(value);
	}
	
	public void clickbtn(By locator) {
		getElement(locator).click();
	}


	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean isElementCheck(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			throw new ElementException("===ELEMENT NOT FOUND===");
		}
	}
	
	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} 
		catch (NoSuchElementException e) {
			System.out.println("Element is not displayed on the page: "+ locator);
			return false;
		}
	}
	
	public boolean isElementEnabled(By locator) {
		try {
			return getElement(locator).isEnabled();
		} 
		catch (NoSuchElementException e) {
			System.out.println("Element is not displayed on the page: "+ locator);
			return false;
		}
	}
	
	public String getElementDOMAttributeValue(By locator, String attrName) {
		return getElement(locator).getDomAttribute(attrName);
	}

	public String getElementDOMPropertyValue(By locator, String propName) {
		return getElement(locator).getDomProperty(propName);
	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();// pc=0,vc=10; []
		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	public boolean isElementExist(By locator) {
		if (getElementsCount(locator) == 1) {
			System.out.println("the element : " + locator + " is present on the page one time");
			return true;
		} else {
			System.out.println("the element : " + locator + " is not present on the page");
			return false;
		}
	}

	public boolean isElementExist(By locator, int expectedEleCount) {
		if (getElementsCount(locator) == expectedEleCount) {
			System.out.println("the element : " + locator + " is present on the page " + expectedEleCount + " times");
			return true;
		} else {
			System.out
					.println("the element : " + locator + " is not present on the page " + expectedEleCount + " times");
			return false;
		}
	}
	
	public void clickElement(By locator, String eleText) {
		List<WebElement> eleList = getElements(locator);
		System.out.println("total number of elements: "+ eleList.size());
		
		for(WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
				if(text.contains(eleText)) {
					e.click();
					break;
				}
		}
	}
	
	
	public void doSearch(By searchLocator, String searchKey, By suggestionsLocator, String suggestionValue)
			throws InterruptedException {
		
		doSendKeys(searchLocator, searchKey);
		Thread.sleep(4000);

		List<WebElement> suggList = getElements(suggestionsLocator);
		System.out.println("total number of suggestions: " + suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(suggestionValue)) {
				e.click();
				break;
			}
		}
	}

}
