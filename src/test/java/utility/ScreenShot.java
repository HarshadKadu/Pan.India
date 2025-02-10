package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot
{ 
	

public  static void captureScreenShot(WebDriver driver) throws IOException 
{
	File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	String path = "C:\\Users\\DELL\\OneDrive\\Desktop\\ScreenShot.jpeg";
	
	File destination = new File (path);
	
	FileHandler.copy(Source, destination);
    
    System.out.println("ScreenShot Captured successfully");
}
}
