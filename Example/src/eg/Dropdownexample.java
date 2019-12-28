package eg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Qspiders/Notes/Selenium%20notes/Fb.html");
		WebElement seltag = driver.findElement(By.id("dropdown"));
		Select s=new Select(seltag);
		System.out.println(s.isMultiple());
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("d3");
		Thread.sleep(4000);
		s.selectByVisibleText("Chapati");
		Thread.sleep(4000);
		//s.deselectByVisibleText("Chapati"); //UnsupportedOperationException
		List<WebElement> allopt = s.getAllSelectedOptions();
		for (WebElement webElement : allopt) {
			System.out.println("all options selected are "+webElement.getText());
		}
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		List<WebElement> all = s.getOptions();
		System.out.println("all options");
		for (WebElement abc : all) {
			System.out.println(abc.getText());
		}
		WebElement wrap = s.getWrappedElement();
		System.out.println(wrap.getText());
		
		Thread.sleep(4000);
		driver.close();
	}
}
