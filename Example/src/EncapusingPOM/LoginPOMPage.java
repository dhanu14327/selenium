package EncapusingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMPage {
	//declaration
	@FindBy(name="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnBtn;
	
	//initialisation
	public LoginPOMPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}		
	//utilisation
	public void getCredentials(String un, String pw) {
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
	}
	public void clickLogin() {
		lgnBtn.click();
	}
	}
