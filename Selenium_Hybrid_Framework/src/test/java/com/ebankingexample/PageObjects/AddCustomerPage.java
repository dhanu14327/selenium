package com.ebankingexample.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.ebankingexample.TestCases.BaseClass;

public class AddCustomerPage extends BaseClass
{
	public AddCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using ="//a[text()='New Customer']")
	WebElement AddNewCustomerLink;

	@FindBy(how = How.NAME, using = "name")
	WebElement CustomerName;

	@FindBy(how = How.NAME, using = "rad1")
	WebElement Gender;

	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement dob;

	@FindBy(how = How.NAME, using = "addr")
	WebElement address;

	@FindBy(how = How.NAME, using = "city")
	WebElement city;

	@FindBy(how = How.NAME, using = "state")
	WebElement state;

	@FindBy(how = How.NAME, using = "pinno")
	WebElement pinno;

	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement phoneno;

	@FindBy(how = How.NAME, using = "emailid")
	WebElement emailid;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.NAME, using = "sub")
	WebElement Submitbtn;

	public void clickAddNewCustomer() {
		AddNewCustomerLink.click();

	}

	public void custName(String cname) {
		CustomerName.sendKeys(cname);

	}

	public void custgender(String cgender) {
		Gender.click();
	}

	public void custdob(String mm,String dd,String yy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);

	}

	public void custaddress(String caddress) {
		address.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		city.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		state.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		pinno.sendKeys(String.valueOf(cpinno));
	}

	public void custphoneno(String ctelephoneno) {
		phoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		emailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		password.sendKeys(cpassword);
	}

	public void custsubmit() {
		Submitbtn.click();
	}

}
