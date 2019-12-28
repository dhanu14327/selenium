package com.ebankingexample.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ebankingexample.Utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
	public String baseurl=readconfig.getappURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String br) {
		logger=Logger.getLogger("e-banking");
		PropertyConfigurator.configure("log4j.properties");
		
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
			driver=new ChromeDriver();
			logger.info("chrome browser is opened");
			driver.manage().window().maximize();
			logger.info("chrome browser is maximised");
		}
		else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxpath());
			driver=new FirefoxDriver();
			logger.info("firefox browser is opened");
			driver.manage().window().maximize();
			logger.info("firefox browser is maximised");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseurl);
		logger.info("The Url has been opened");
	}
	public boolean isAlertPresent()
	{
		try
		{
		driver.getTitle();
		return false;
		}
		catch(Exception e)
		{
			return true;
		}
		
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "\\Screenshots\\" + tname + ".png");
		FileUtils.copyFile(source, target);
		
	}
	
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(8);
		return (generatedString1);
	}
	
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(5);
		return (generatedString2);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
