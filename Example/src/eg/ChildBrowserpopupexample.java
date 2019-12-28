package eg;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowserpopupexample {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Set<String> whs = driver.getWindowHandles();
		Iterator<String> it = whs.iterator();
		String parent = it.next();
		String child1 = it.next();
		String child2 = it.next();
		System.out.println("parent: "+parent);
		System.out.println("child1: "+child1);
		System.out.println("child2: "+child2);
		driver.switchTo().window(child1).close();
		driver.switchTo().window(child2).close();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[contains(text(),'Create a Job Alert')]")).click();
		driver.close();
	}

}
