package ajjj;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class basics {
	
	public static WebDriver driver ;
	
	
	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
	public static void screenshot(String testMethodName)
	{
	File src	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest= new File("C:\\Users\\DELL\\Desktop\\aaaa\\"+testMethodName+"_"+".jpg");
	
	
try {
	FileHandler.copy(src, dest);
} catch (IOException e) {
	
	e.printStackTrace();
}

	}
}