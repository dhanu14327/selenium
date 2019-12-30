package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

	@FindBy(xpath="//input[@name='username']")
	private WebElement unTB;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwTB;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement Login;
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errormsg;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getCredentials(String un,String pw)
	{
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
	}
	public void ClickLogin()
	{
		Login.click();
	}
}
