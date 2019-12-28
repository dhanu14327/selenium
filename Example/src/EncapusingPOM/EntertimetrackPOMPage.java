package EncapusingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntertimetrackPOMPage {
	
	@FindBy(xpath="//td[@class='navItem preventPanelsHiding navCell relative notSelected']")
	private WebElement TimeTrack;
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement Tasks;
	@FindBy(xpath="//a[@class='content users']")
	private WebElement Users;
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement Reports;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	public EntertimetrackPOMPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickTimetracktab()
	{
		TimeTrack.click();
	}
	public void clickTask(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Tasks']")));
		Tasks.click();
	}
	public void clickReports()
	{
		Reports.click();
	}
	public void clickUsers()
	{
		Users.click();
	}
	public void clickLogout()
	{
		logout.click();
	}
}
