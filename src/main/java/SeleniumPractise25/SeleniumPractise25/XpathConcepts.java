package SeleniumPractise25.SeleniumPractise25;

public class XpathConcepts {
public static void main(String[] args) {
		
		//xpath: 
		//- its not an attribute
		//- its the address of the element in html DOM
		
		//1. absolute xpath: never use this xpath; fragilel; performance issues
		// /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		
		//2. relative/custom xpath:
		
		//1. with single attribute:
		//htmltag[@attr='value']
		//input[@id='input-email']
		//input[@name='email']
		//input[@placeholder='E-Mail Address']
		
		//input[@id]
		//img[@title='naveenopencart']
		
		//2. with multiple attributes:
		//htmltag[@attr1='value' and @attr2='value']
		//img[@title='naveenopencart' and @class='img-responsive']
		//img[@title='naveenopencart' and @class='img-responsive' and @alt='naveenopencart']
		//input[@type='text' and @placeholder='E-Mail Address']
		
		//input[@type and @placeholder]
		//input[@type or @placeholder]
		
		//3. with the text(): button, link, para, header, label
		//htmltag[text()='value']
		//h2[text()='New Customer']
		//h2[text()='Returning Customer']
		//a[text()='Register']
		//a[text()='Delivery Information']
		
		//4. text() and attribute:
		//htmltag[text()='value' and @attr='value']
		//a[text()='Register' and @class='list-group-item']
		//a[@class='list-group-item' and text()='Register']
		//label[text()='E-Mail Address' and @for='input-email']
		
		//5. contains() with attribute:
		//htmltag[contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail')]
		//input[contains(@placeholder,'Address')]
		
		//contains() with one attribute and another attribute without contains:
		//htmltag[contains(@attr,'value') and @attr2='value']
		//input[contains(@placeholder,'E-Mail') and @name='email']
		//input[contains(@placeholder,'E-Mail') and @name='email' and @type='text' and contains(@id,'email')]
		
		//<input> id="firstname_123" />
		//<input> id="firstname_234" />
		//<input> id="firstname_989" />
		//<input> id="firstname_765" />
		//By.id("firstname_765");//--wrong way of using id, coz id is dynamic
		
		//input[contains(@id, 'firstname_')]
		
		
		
		
	}
}
