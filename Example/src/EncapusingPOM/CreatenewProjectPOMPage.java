package EncapusingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewProjectPOMPage {

	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement NewProject;
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement ProjectName;
	@FindBy(xpath="//div[@class='components_button  withPlusIcon']")
	private WebElement CreateNewProjectBtn;
	
	public CreatenewProjectPOMPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicknewProjectPage(String pn) throws InterruptedException
	{
//		NewProject.click();
//		Thread.sleep(2000);
		ProjectName.sendKeys(pn);
		Thread.sleep(2000);
		CreateNewProjectBtn.click();
	}
	
}
