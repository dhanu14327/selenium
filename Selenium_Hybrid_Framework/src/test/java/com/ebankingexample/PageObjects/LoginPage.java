package com.ebankingexample.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
	private WebElement unTB;
	
	@FindBy(name="password")
	private WebElement pwTB;
	
	@FindBy(name="btnLogin")
	private WebElement lgnbtn;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement lgout;
	
	
	public void credentials(String un,String pw)
	{
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		lgnbtn.click();
	}
	public void clickLogout()
	{
		lgout.click();
	}
}
