package tests;

import java.io.FileReader;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import pages.Registration;

public class RegistrationTest extends testBase{
	Registration RegistrationObject ;
	@Test(priority = 3)
	public void UserCanRegister() {
		try {

			// get path of CSV file 
			String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data\\Data.csv";
			reader = new CSVReader(new FileReader(CSV_file));

			String[] csvCell ; 

			// while loop will be executed till the lastvalue in CSV file . 
			while((csvCell = reader.readNext()) != null) 
			{ 
			
				String firstName = csvCell[2];
				String lastName = csvCell[3];
				String password = csvCell[4];
				String day = csvCell[5];
				String month = csvCell[6];
				String year = csvCell[7];
				String company = csvCell[8];
				String address = csvCell[9];
				String city = csvCell[10];
				String postCode = csvCell[11];
				String Number = csvCell[12];
				String addressAlias = csvCell[13];
				
				RegistrationObject = new Registration(driver);
				RegistrationObject.register( firstName,  lastName,  password,day,  month, year,  company,  address,  city, postCode, Number, addressAlias);
			}} catch (Exception e) {
				System.out.println(e);
			}

		}

	}
