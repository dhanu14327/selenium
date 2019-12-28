package EncapusingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPOMPage {
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement NewCustomer;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement NewProject;
	
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement AddnewBtn;
	
	public TaskListPOMPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public void clickAddnewBtn()
	{
		AddnewBtn.click();
		NewCustomer.click();
	}
	public void clickAddnewBtn1(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
		AddnewBtn.click();
		NewProject.click();
	}	
}