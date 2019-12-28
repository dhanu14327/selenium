package GmailEncapExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsernamePage {

	private WebElement unTB;
	private WebElement nxtBtn;
	
	public UsernamePage(WebDriver driver) {
		unTB=driver.findElement(By.xpath("//input[@type='email']"));
		nxtBtn=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	}
	
	public void getUsername(String un)
	{
		unTB.sendKeys(un);
	}
	public void clickNext()
	{
		nxtBtn.click();
	}
}
