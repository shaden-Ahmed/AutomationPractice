package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends pageBase{

	public homePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText =  "Sign in") 
	WebElement signInButton ; 
	
	public void enterSignIn() {
		clickButton(signInButton);

	}
}
