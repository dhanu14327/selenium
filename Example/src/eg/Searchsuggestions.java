package eg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchsuggestions {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("wonderchef");
		Thread.sleep(3000);
		List<WebElement> suggestlist = driver.findElements(By.xpath("//span[contains(.,'wonderchef')]"));
		int linksize=suggestlist.size();
		System.out.println(linksize);
		Thread.sleep(3000);
		for (WebElement ele : suggestlist) {
			String e=ele.getText();
			System.out.println(e);
			if (e.equalsIgnoreCase("wonderchef chopper")) {
				ele.click();
			}
		}
	}

}
