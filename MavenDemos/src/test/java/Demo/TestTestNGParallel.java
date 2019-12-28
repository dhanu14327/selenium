package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestTestNGParallel {
	WebDriver driver=null;
	@BeforeTest
	@Parameters("MyBrowser")

	public void test(String MyBrowser)
	{
		if (MyBrowser.equalsIgnoreCase("Chrome")) {	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		else if (MyBrowser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	}
	@AfterTest
	public void closingbrowsers()
	{
		if (driver!=null) {
			driver.quit();
		}
	}
}
