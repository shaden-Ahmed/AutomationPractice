package tests;

import org.testng.annotations.Test;

import pages.Order;

public class OrderTest extends testBase {
	Order orderObject;

	@Test(priority = 4)
	public void userCanOrder() {
		try {
			orderObject = new Order(driver);
			orderObject.makeOrder();
		} catch (Exception e) {
			System.out.println(e);
		}


	}


}
