package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAssertexample {

	@Test(priority = 1)
	public void sum()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		Assert.assertEquals(sum, 30); // Hard Assert
		System.out.println("hi");
	}
	@Test(enabled = false)
	public void google()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle= driver.getTitle();
		Assert.assertEquals("Google", actualtitle);
		Reporter.log("homepage is displayed",true);
		WebElement googleimg = driver.findElement(By.xpath("//img[@alt='Google']"));
		boolean isdisplayed = googleimg.isDisplayed();
		Assert.assertTrue(isdisplayed); // Hard Assert
		driver.quit();
	}
	@Test(priority = 2)
	public void softasserttest()
	{
		int a=20;
		int b=10;
		int sum=a+b;
		int mul=a*b;
		int div=a/b;
		int sub=a-b;
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(sum, 20);
		Reporter.log("S1",true);
		 
		s.assertEquals(mul, 200);
		Reporter.log("S2",true);
		s.assertEquals(div, 15);
		Reporter.log("S3",true);
		s.assertEquals(sub, 10);
		Reporter.log("S4",true);
		s.assertAll();
		
	}
}
