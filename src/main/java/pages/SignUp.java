package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends pageBase{

	public SignUp(WebDriver driver) {
		super(driver);		 
	}
	
	@FindBy(id = "email_create")
	WebElement EmailBox ;
	
	@FindBy(id = "SubmitCreate")
	WebElement Create ;
	
	public void CreateAccount(String email) {
		sendText(EmailBox, email);
		clickButton(Create);
	}

	
	

	
}
