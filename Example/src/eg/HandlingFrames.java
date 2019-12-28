package eg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/Qspiders/Notes/Selenium%20notes/s2.html");
		WebElement a = driver.findElement(By.id("i2"));
		a.sendKeys("java");
		driver.switchTo().frame(0);
		driver.findElement(By.id("i1")).sendKeys("selenium");
		driver.switchTo().parentFrame();
		a.clear();
		
}
}

