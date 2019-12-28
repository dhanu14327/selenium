package com.ebankingexample.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebankingexample.PageObjects.LoginPage;

public class TC_Test_Login_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.credentials(username, password);
		logger.info("Username & Password has been entered");
		lp.clickLogin();
		logger.info("Clicked the login button");
		
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {

			Assert.assertTrue(true);
			logger.info("The home page is opened and the title is validated");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.error("The test has Failed");
		}
	}
}
