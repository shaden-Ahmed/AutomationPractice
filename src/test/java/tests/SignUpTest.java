package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


import pages.SignUp;
public class SignUpTest extends testBase{
	SignUp signUpObjectpage ;
	
	
	
	@Test(priority = 2)
	public void userCanCreateAccount() throws CsvValidationException, IOException {
		try {
			// get path of CSV file 
			String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data\\Data.csv";
			reader = new CSVReader(new FileReader(CSV_file));

			String[] csvCell ; 

			// while loop will be executed till the lastvalue in CSV file . 
			while((csvCell = reader.readNext()) != null) 
			{ 
				String Email = csvCell[1];
				

				signUpObjectpage = new SignUp(driver);
				
				signUpObjectpage.CreateAccount(Email);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}



}
