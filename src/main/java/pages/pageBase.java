package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public class pageBase {
	protected static WebDriver driver; 
	
		

	//create conustructor
	public pageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	protected static void clickButton(WebElement button) {
		button.click();
	}

	protected static void sendText(WebElement textElement, String value) {
		textElement.sendKeys(value);


	}
	
	protected static void hover(WebElement Element) {
		Actions action = new Actions(driver);
		action.moveToElement(Element).perform();


	}

}

