package eg;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
static
{
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
}
	public static void main(String[] args)throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//opening google and searching for flipkart
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("flipkart");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		//creating a list of links from the google search results
		List<WebElement> link= driver.findElements(By.xpath("//h3[@class='LC20lb']"));
		int linksize=link.size();
		System.out.println(linksize);
		//selecting & clicking on flipkart link from the list using equalsignorecase method
		for (WebElement a : link) {
			String add=a.getText();
			System.out.println(add);
			if (add.equalsIgnoreCase("Flipkart")) {
				a.click();
			}
		}
		//closing the login WebElement by waiting for it to appear and then clicking on close button
		
		WebElement e= driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(e));
		e.click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Apple X");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		//creating a list of links from the flipkart search results
		List<WebElement> link2= driver.findElements(By.className("_2cLu-l"));
		int linksize2=link2.size();
		System.out.println(linksize2);
		//selecting & clicking on "Apple iPhone X (Space Gray, 256 GB)" link from the list using equalsignorecase method
		for (WebElement b : link2) {
			String add2=b.getText();
			System.out.println(add2);
			if (add2.equalsIgnoreCase("Apple iPhone X (Space Gray, 256 GB)")) {
				b.click();
			}
			}
		Set<String> whs = driver.getWindowHandles();
		Iterator<String> it = whs.iterator();
		String parent = it.next();
		String child1 = it.next();
		driver.switchTo().window(child1);
		driver.navigate().refresh();
		//performing some action on the new window
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Remove']")).click();
		driver.findElement(By.xpath("//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")).click();
		driver.close();
		driver.switchTo().window(parent);// switching back to parent window
		//clicking on a link in the parent window
		driver.findElement(By.xpath("//div[@class='_1jcwFN']")).click();		
		System.out.println("Test Passed");
		driver.close();
	}
	}

