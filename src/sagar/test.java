package sagar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
		
	element.sendKeys("abcd");
	WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		  
		 pass.sendKeys("ahh12");
		  
		
	  
	}

}
