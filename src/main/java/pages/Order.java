package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Order extends pageBase{

	public Order(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement Dresses;
	
	@FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a")
	WebElement summerDresses;
	
	@FindBy(id= "layered_id_attribute_group_13")
	WebElement orang;
	
	@FindBy(id="layered_id_attribute_group_3")
	WebElement sizeL;
	
	@FindBy(xpath  = "//*[@id=\"center_column\"]/ul/li/div/div[2]/span/span/link")
	WebElement inStock ;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]" )
	WebElement addToCart ;
	
	@FindBy(xpath = "//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a")
	WebElement Proceed ;
	
	@FindBy(xpath = "//*[@id=\'center_column\']/p[2]/a[1]")
	WebElement ProceedToChecOut ;
	
	@FindBy(xpath = "//*[@id=\'center_column\']/form/p/button")
	WebElement ProceedToChecOut2 ;
	
	@FindBy(id="cgv")
	WebElement agree ;
	
	@FindBy(xpath = "//*[@id=\'form\']/p/button")
	WebElement ProceedToChecOut3 ;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	WebElement payCheck ;
	
	@FindBy(xpath = "//*[@id=\'cart_navigation\']/button")
	WebElement Confirm ;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a")
	WebElement BackToOrders ;
	
	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement MyAccount ;
	
	@FindBy(xpath = "//*[@id=\'center_column\']/div/div[1]/ul/li[1]/a")
	WebElement history ;
	
	@FindBy(xpath = "//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a")
	WebElement orderList ;
	
	public void makeOrder() {
		clickButton(Dresses);
		clickButton(summerDresses);
		clickButton(sizeL);
		clickButton(orang);
		//clickButton(inStock);
		clickButton(addToCart);
		clickButton(Proceed);
		clickButton(ProceedToChecOut);
		clickButton(ProceedToChecOut2);
		clickButton(agree);
		clickButton(ProceedToChecOut3);
		clickButton(payCheck);
		clickButton(Confirm);
		clickButton(MyAccount);
		clickButton(history);
		Assert.assertEquals(true, orderList.isDisplayed());
		
	}
}
