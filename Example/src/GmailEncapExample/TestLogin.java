package GmailEncapExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
		UsernamePage u=new UsernamePage(driver);
		u.getUsername("amithasm963@gmail.com");
		u.clickNext();
		
		Thread.sleep(3000);
		
		PasswordPage p=new PasswordPage(driver);
		p.getPassword("selenium@963");
		p.clickNext();
		
		InboxPage i=new InboxPage(driver);
		i.clickLogout();
		driver.close();		
	}

}
