package ajjj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	

	WebDriver driver= new ChromeDriver();
	
	driver.get(" https://www.facebook.com/");
	WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
	Select s= new Select (month);
	List<WebElement> opt =s.getOptions();
	 for (int i=0; i<=opt.size()-1; i++)
	{
		String result = opt.get(i).getText();
		System.out.println(result);
	}

	}

}
