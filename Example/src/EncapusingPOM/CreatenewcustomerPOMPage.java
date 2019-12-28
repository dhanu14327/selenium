package EncapusingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewcustomerPOMPage {
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement CustomerName;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")
	private WebElement CreateNewCustBtn;

	
	public CreatenewcustomerPOMPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	public void clickaddNewCustomer(String nm) throws InterruptedException
	{
		CustomerName.sendKeys(nm);
		Thread.sleep(2000);
		CreateNewCustBtn.click();
	}
}