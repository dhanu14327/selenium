package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LicensePage {

	@FindBy(xpath = "//nobr[contains(text(),'Edition')]/ancestor::tr[1]/descendant::b")
	private WebElement licenceversion;
	
	public LicensePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyLicencesVersion(String expected)
	{
		String lictxt = licenceversion.getText();
		Assert.assertEquals(lictxt, expected );
	}
}
