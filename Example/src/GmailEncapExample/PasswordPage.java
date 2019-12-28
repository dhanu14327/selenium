package GmailEncapExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordPage {
	private WebElement pwTB;
	private WebElement nxtBtn;
	
	public PasswordPage(WebDriver driver) {
		pwTB=driver.findElement(By.xpath("//input[@type='password']"));
		nxtBtn=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	}
	
	public void getPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickNext()
	{
		nxtBtn.click();
	}
}
