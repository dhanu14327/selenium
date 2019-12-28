package eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Craftsvilla {

	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.craftsvilla.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'KURTIS & DRESSES')]")).click();
		driver.findElement(By.xpath("(//a[@href='/shop/kurti/6220529'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='holder-container'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='addtocart']")).click();
	}

}