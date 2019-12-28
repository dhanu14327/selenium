package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import EncapusingPOM.LoginPOMPage;

public class Testdataproviderexample {

	public static WebDriver driver;
	
	@Test(dataProvider = "dp")
	public void testlogin(String un,String pw) throws InterruptedException
	{
		LoginPOMPage lp=new LoginPOMPage(driver);
		lp.getCredentials(un, pw);
		lp.clickLogin();
		Thread.sleep(3000);
	}
	@DataProvider
	public String[][] dp()
	{
		return new String [][] {{"@dmin","manager"},{"admin","manager"}};
	}
	@BeforeTest
	public void setprop()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	@BeforeMethod
	public void openbrowser()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}
