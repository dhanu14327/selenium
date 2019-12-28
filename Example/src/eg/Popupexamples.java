package eg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popupexamples {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.xpath("//input[@id='nqame2']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='dtDOB']")).click();
		WebElement selmonth = driver.findElement(By.id("selMonth"));
		Select s1=new Select(selmonth);
		s1.selectByVisibleText("January");
		
		WebElement selYear = driver.findElement(By.id("selYear"));
		Select s2=new Select(selYear);
		s2.selectByVisibleText("2019");
		driver.findElement(By.partialLinkText("15")).click();
		driver.findElement(By.xpath("//button[@id='proceed']")).click();
	}

}
