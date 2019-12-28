package Demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ParallelTest extends TestTestNGParallel {

	@Test
	public void testgooglesearch()
	{
	driver.get("https://www.google.com");
	driver.switchTo().activeElement().sendKeys("gmail");
	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
	System.out.println("From testgooglesearch() | "+Thread.currentThread().getId());
	}
}
