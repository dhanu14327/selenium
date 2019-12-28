package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTestNGDemo {
	WebDriver driver=null;
	@BeforeTest
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	@Test
	public void test1()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("gmail");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		System.out.println("From test1()");
	}
	@Test
	public void test2()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("gmail");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		System.out.println("From test2()");
	}
	@AfterTest
	public void closingbrowsers()
	{
		driver.quit();
	}
}
