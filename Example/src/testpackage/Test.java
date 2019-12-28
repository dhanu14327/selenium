package testpackage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Test {

	

		static {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement e= driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(e));
			e.click();
			WebElement eee = driver.findElement(By.xpath("//span[.='Electronics']"));
			Actions act=new Actions(driver);
			act.moveToElement(eee).perform();
			WebElement mi = driver.findElement(By.xpath("(//a[@title='Mi'])[1]"));
			Thread.sleep(3000);
			act.contextClick(mi).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			act.contextClick(mi).perform();
			r.keyPress(KeyEvent.VK_W);
			r.keyRelease(KeyEvent.VK_W);
			/*driver.get("file:///E:/Qspiders/Notes/Selenium%20notes/actions/drag_drop.html");
			WebElement Source = driver.findElement(By.xpath("//p[contains(.,'Drag')]"));
			WebElement destination = driver.findElement(By.xpath("//p[contains(.,'Drop')]"));
			act.dragAndDrop(Source, destination).perform();
			System.out.println("Drag and drop test passed");
			driver.get("file:///E:/Qspiders/Notes/Selenium%20notes/actions/doubliclick.html");
			WebElement var = driver.findElement(By.xpath("//button[contains(.,'here')]"));
			act.doubleClick(var).perform();
			System.out.println("Double-click test passed");*/
			
		}
	}

