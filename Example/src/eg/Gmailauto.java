package eg;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailauto {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https:/www.gmail.com");
		driver.switchTo().activeElement().sendKeys("amithasm963@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("selenium@963");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("amithasm963@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Starred");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("demo email to check compose using selenium");
		driver.findElement(By.xpath("//div[@class='dC']/descendant::div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		driver.navigate().refresh();
		Alert a= driver.switchTo().alert();
		a.dismiss();
		WebElement src = driver.findElement(By.xpath("//tr[@id=':2q']"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='TN bzz aHS-bnw']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert b= driver.switchTo().alert();
		b.dismiss();
		driver.findElement(By.xpath("//span[@class='gb_Ea gbii']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[@id='gb_71']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		Alert c= driver.switchTo().alert();
		c.accept();
		System.out.println("Gmail test passed");
		
	}

}
