package GmailPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsernamePage {

	@FindBy(xpath="//input[@type='email']")
	private WebElement unTB;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nxtBtn;
	
	public UsernamePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void getEmail(String email) throws InterruptedException
	{
		unTB.sendKeys(email);
		Thread.sleep(2000);
		nxtBtn.click();
	}
}
