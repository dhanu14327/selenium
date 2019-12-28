package com.ebankingexample.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebankingexample.PageObjects.LoginPage;
import com.ebankingexample.Utilities.XLUtils;

public class TC_Test_LoginDDT_002 extends BaseClass{

	@Test(dataProvider = "LoginData")
	public void loginDDT(String User,String Pwd) throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.credentials(User, Pwd);
		logger.info("Username & Password has been entered from excel file");
		lp.clickLogin();
		logger.info("Clicked the login button");
		Thread.sleep(4000);
		if(isAlertPresent()==true)
		{
			captureScreen(driver, "loginDDT");
			logger.warn("The login has failed and Screenshot is taken");
			logger.info("Intercepted failed login alert");
//			driver.switchTo().alert().accept();
//			logger.info("Alert has been closed");
//			driver.switchTo().defaultContent();
//			logger.info("Returned control to default content for further actions");
			Assert.assertTrue(false);
		}
		else 
		{
			Assert.assertTrue(true);
			logger.info("The login is success and home page is opened");
			lp.clickLogout();
			Thread.sleep(3000);
			logger.info("Clicked logout button");
			driver.switchTo().alert().accept();
			logger.info("Alert has been closed");
			driver.switchTo().defaultContent();
			logger.info("Returned control to default content for further actions");
		}
	}
	@DataProvider(name="LoginData")
	String[][]getData() throws IOException
	{
		String path="./src/test/java/com/ebankingexample/TestData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][]=new String[rownum][colcount];
		for (int i = 1; i <=rownum; i++) 
		{
			for (int j = 0; j < colcount ; j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
			}
		}
		return logindata;
	}

}
