package EncapusingPOM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		Workbook wk = WorkbookFactory.create(new File("./TestData/TestData.xlsx"));
		String usn = wk.getSheet("Demo").getRow(3).getCell(0).toString();
		String pwd = wk.getSheet("Demo").getRow(3).getCell(1).toString();
		
		LoginPOMPage lp=new LoginPOMPage(driver);
		lp.getCredentials(usn, pwd);
		lp.clickLogin();
		
		EntertimetrackPOMPage e=new EntertimetrackPOMPage(driver);
		e.clickTask(driver);
	
		TaskListPOMPage t=new TaskListPOMPage(driver);
		t.clickAddnewBtn();
		
		CreatenewcustomerPOMPage cc=new CreatenewcustomerPOMPage(driver);
		cc.clickaddNewCustomer("abcd");
		
		t.clickAddnewBtn1(driver);
		CreatenewProjectPOMPage cp=new CreatenewProjectPOMPage(driver);
		cp.clicknewProjectPage("demo");
	}
}
