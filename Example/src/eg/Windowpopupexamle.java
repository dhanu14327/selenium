package eg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowpopupexamle {

	static {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		File f=new File("./TestData/Windowpopupexample.exe");
		String apath = f.getAbsolutePath();
		Runtime.getRuntime().exec(apath);
//		driver.get("file:///E:/Qspiders/Notes/Selenium%20notes/Upload.html");
//		driver.findElement(By.xpath("//input[@type='file']")).click();
//		File f1=new File("./TestData/Uploadexample.exe");
//		String apath1=f1.getAbsolutePath();
//		Runtime.getRuntime().exec(apath1);
	}
}
