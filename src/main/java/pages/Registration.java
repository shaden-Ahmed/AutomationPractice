package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registration extends pageBase{

	public Registration(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "id_gender2")
	WebElement radioElement;
	
	@FindBy(id = "customer_firstname")
	WebElement FirstName ;
	
	@FindBy(id = "customer_lastname")
	WebElement LastName ;
	
	@FindBy(id = "passwd")
	WebElement passWord ;
	
	
	@FindBy(id = "days")
	WebElement daysDropDown ;
	Select day = new Select(daysDropDown);
	
	
	@FindBy(id = "months")
	WebElement monthsDropDown ;
	Select month = new Select(monthsDropDown);
	
	
	@FindBy(id="years")
	WebElement yearsDropDown ;
	Select year = new Select(yearsDropDown);
	
	@FindBy(id = "newsletter")
	WebElement checkNewsletter ;
	
	@FindBy(id = "optin")
	WebElement checkOffers ;
	
	@FindBy(id = "company")
	WebElement company ;
	
	@FindBy(id="address1")
	WebElement address ;
	
	@FindBy(id="address2")
	WebElement address2 ;
	
	
	@FindBy(id="city")
	WebElement city ;
	
	
	@FindBy(id="id_state")
	WebElement stateDropDown ;
	Select state = new Select(stateDropDown);
	
	
	@FindBy(id="postcode")
	WebElement PostCode ;
	
	@FindBy(id="phone")
	WebElement HomePhone ;
	
	@FindBy(id="phone_mobile")
	WebElement MobilePhone ;
	

	@FindBy(id="alias")
	WebElement addressAlias ;
	@FindBy(id="submitAccount")
	WebElement submit ;
	
	
	public void register(String FName, String LName, String pwd, String dy, String mnth, String yer, String cmpny, String adress, String citi, String zip, String phone, String alias) {
		clickButton(radioElement);
		sendText(FirstName, FName);
		sendText(LastName, LName);
		
		sendText(passWord, pwd);
		
		clickButton(daysDropDown);
		day.selectByValue(dy);
		clickButton(monthsDropDown);
		month.selectByValue(mnth);
		clickButton(yearsDropDown);
		year.selectByValue(yer);
		
		clickButton(checkNewsletter);
		clickButton(checkOffers);
		
		sendText(company, cmpny);
		
		sendText(address, adress);
		sendText(address2, adress);
		
		sendText(city, citi);
		clickButton(stateDropDown);
		state.selectByValue("1");
		sendText(PostCode, zip);
		
		sendText(HomePhone, phone);
		sendText(MobilePhone, phone);
		
		addressAlias.clear();
		sendText(addressAlias, alias);
		
		
		
		clickButton(submit);
		
	}
}
