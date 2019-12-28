package eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//span[@class='NlWrkb snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='For myself']")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("seleniumtest");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("account");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("selenium5656");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Test@selenium");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Test@selenium");
		driver.findElement(By.xpath("//div[@id='accountDetailsNext']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("0123456789");
		driver.findElement(By.xpath("//div[@id='gradsIdvPhoneNext']")).click();
	}

}
