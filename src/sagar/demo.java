package sagar;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Dimension d= new Dimension (400,500);
	driver.manage().window().setSize(d);
	Point p= new Point(700,400);
	driver.manage().window().setPosition(p);
String ur= driver.getCurrentUrl();
System.out.println(ur);
String tit= driver.getTitle();
	System.out.println(tit);
	driver.quit();
	
	
	
	
	
	
}
}
