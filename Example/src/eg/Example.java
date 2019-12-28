package eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); //creating object for chrome browser
		driver.manage().window().maximize(); // maximizing browser
		driver.get("https://www.google.com"); // enter url of google
		driver.findElement(By.name("q")).sendKeys("selenium"); // enter "selenium" in search box
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click(); // clicking on search button
		driver.navigate().back(); // going back to previous page
		Thread.sleep(800); // pausing execution for 800ms
		driver.navigate().forward(); // going forward to the next page
		driver.navigate().refresh(); // reloading current page
		String u=driver.getCurrentUrl(); // extracting the url of the current page
		System.out.println(u); // printing the url
		/*String sc=driver.getPageSource(); //extracting front end source code
		System.out.println(sc);// printing source code */ 
		driver.navigate().to("https://www.gmail.com"); // opening gmail webpage
		String s=driver.getTitle(); // extracting title of the current page
		String n=driver.getWindowHandle(); // getting address of current window
		System.out.println(n);// printing address of current window
		String e="Gmail - Free Storage and Email from Google";
		if (s.contentEquals(e)) { //checking if page title is same as expected title
			System.out.println("Test passed");
		}
		else 
			System.out.println("Test Failed");
		driver.close();
		}
	}