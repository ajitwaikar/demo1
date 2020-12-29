package ajjj;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(customiselistner.class)
public class practice extends basics {
	
	@BeforeMethod
	public void browser()
	{
		openbrowser();
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, false);
	}
	@Test
	
	public void test2()
	{
		Assert.assertEquals(true, true);
	}
	@Test
	
	public void logintest()
	{
		Assert.assertEquals(false, true);
	}
	
	
	
	
@AfterMethod()

public void teardown()
{
	driver.quit();
	
}


}
