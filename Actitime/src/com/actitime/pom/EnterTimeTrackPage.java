package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {

	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement Settingbtn;
	@FindBy(linkText = "Licenses")
	private WebElement licencelink;
	@FindBy(linkText = "Logout")
	private WebElement logout;
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicksettingbutton()
	{
		Settingbtn.click();
	}
	public void clicklicenselink()
	{
		licencelink.click();
	}
	public void clicklogout()
	{
		logout.click();
	}
}
