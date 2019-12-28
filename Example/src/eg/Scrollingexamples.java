package eg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingexamples {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com/");
		WebElement cv = driver.findElement(By.xpath("//strong[contains(.,'Wings')]"));
		Point loc = cv.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		System.out.println("x-Axis is: "+x);
		System.out.println("y-Axis is: "+y);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,"+y+")");
	}

}
