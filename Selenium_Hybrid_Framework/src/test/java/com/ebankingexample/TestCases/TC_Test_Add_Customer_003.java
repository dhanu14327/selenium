package com.ebankingexample.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebankingexample.PageObjects.AddCustomerPage;
import com.ebankingexample.PageObjects.LoginPage;

public class TC_Test_Add_Customer_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.credentials(username, password);
		lp.clickLogin();
		Thread.sleep(3000);

		AddCustomerPage addcust=new AddCustomerPage(driver);
		logger.info("providing customer details....");
		addcust.clickAddNewCustomer();
		addcust.custName("Demo");
		addcust.custgender("male");
		addcust.custdob("05", "05", "1995");
		Thread.sleep(3000);
		addcust.custaddress("xyz");
		addcust.custcity("NY");
		addcust.custstate("NY");
		addcust.custpinno("156156");
		addcust.custphoneno("4655464545");
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("546465465");
		addcust.custsubmit();
		Thread.sleep(3000);

		logger.info("validation started....");

		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");

		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
		}
		else
		{
			captureScreen(driver,"addNewCustomer");
			logger.info("test case failed....");
			Assert.assertTrue(false);
		}
	}

}
