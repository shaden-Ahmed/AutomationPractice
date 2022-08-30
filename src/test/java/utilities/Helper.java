package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	//to take screenshots on faliur 
	public static void CaptureScreen(WebDriver driver, String ssName) {
		Path destenation = Paths.get("./Screenshots",ssName+".png");
		
		try {
			Files.createDirectories(destenation.getParent());
			FileOutputStream out = new FileOutputStream(destenation.toString());
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			System.out.println("Excpetion while taking screenshot"+ e.getMessage());
		}
		
	}

}
