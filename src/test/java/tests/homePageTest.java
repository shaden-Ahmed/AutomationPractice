package tests;



import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvException;
import pages.homePage;


public class homePageTest extends testBase{
	homePage homeObject ;

	@Test(priority = 1, alwaysRun = true)
	public void userCanGoSignPage() throws IOException, CsvException {
		
			homeObject = new homePage(driver);
			homeObject.enterSignIn();
			
	}
}
