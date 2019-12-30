package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass implements iAutoConstants {

	public static WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY, CHROME_PATH);
	}
	
	@BeforeMethod
	public void launchApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(APP_URL);
	}
	@AfterMethod
	public void teardownApp(ITestResult tr)
	{
		if(tr.getStatus()==2)
		{
			String name=tr.getName();
			FWUtils.getSnapshot(driver, SNAPSHOT+name+".png");
		}
		driver.quit();
	}
}
