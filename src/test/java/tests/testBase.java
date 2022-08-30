package tests;



import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import utilities.Helper;

public class testBase {
	public static WebDriver driver;
	public CSVReader reader ;
	
	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome") String browserName) throws  IOException, CsvException {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver =  new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe");
			driver =  new EdgeDriver();	
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver =  new FirefoxDriver();
		}
		// get path of CSV file 
		String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data\\Data.csv";
		reader = new CSVReader(new FileReader(CSV_file)); 
		
		String[] csvCell ; 

		// while loop to access CSV file . 
		while((csvCell = reader.readNext()) != null) 
		{
			String url = csvCell[0]; 
		
		
		//driver.manage().timeouts().implicitlyWait(150,TimeUnit.MILLISECONDS);
		driver.navigate().to(url);
		}
	}

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void estanna() {
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	}
	// take screenshot when test case fail and add it in the Screenshot folder
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			Helper.CaptureScreen(driver, result.getName());
		}
	}
	@AfterSuite
	public void stopDriver() {
		//driver.quit();
	}
}
