package GmailEncapExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InboxPage {

	private WebElement logout;
	private WebElement googleacc;
	
	public InboxPage(WebDriver driver)
	{
		googleacc=driver.findElement(By.xpath("//a[@class='gb_D gb_Oa gb_i']"));
		logout=driver.findElement(By.xpath("//a[@id='gb_71']"));
	}
	public void clickLogout()
	{
		googleacc.click();
		logout.click();
	}
}
