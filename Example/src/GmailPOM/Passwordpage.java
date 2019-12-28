package GmailPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passwordpage {

	@FindBy(xpath="//input[@name='password']")
	private WebElement pwTB;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nxtBtn;
	
	public Passwordpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getPassword(String pw) throws InterruptedException
	{
		pwTB.sendKeys(pw);
		Thread.sleep(2000);
		nxtBtn.click();
	}
}
