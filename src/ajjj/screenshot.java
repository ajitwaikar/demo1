package ajjj;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(source);
File desti = new File("C:\\Users\\DELL\\Desktop\\aaaa\\ajit..jpg");
FileHandler.copy(source, desti);
	}

}