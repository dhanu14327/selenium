package eg;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadexample {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/Qspiders/Notes/Selenium%20notes/Upload.html");
		String rpath = "./TestData/URL.txt";
		System.out.println("relative path: "+rpath);
		File f=new File(rpath);
		String apath = f.getAbsolutePath();
		System.out.println("absolute path: "+apath);
		driver.findElement(By.id("1")).sendKeys(apath);

	}

}
