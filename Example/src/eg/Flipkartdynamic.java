package eg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkartdynamic {

	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement e= driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(e));
		e.click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("apple");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		//driver.findElement(By.xpath("//div[.='Apple iPhone 7 Plus (Black, 32 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
		driver.findElement(By.xpath("(//div[contains(@class,'_3wU53n')])[1]/ancestor::div[@class='_1-2Iqu row']/descendant::div[@class='_1vC4OE _2rQ-NK']"));
	}
}
