package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import EncapusingPOM.LoginPOMPage;

public class handlepropertyfile {
public void getData() throws IOException
{
	WebDriver driver=new ChromeDriver();
	FileInputStream fis=new FileInputStream(new File("./TestData/i.properties"));
	Properties p= new Properties();
	p.load(fis);
	driver.get(p.getProperty("URL"));
	LoginPOMPage lp = new LoginPOMPage(driver);
	lp.getCredentials(p.getProperty("username"), p.getProperty("password"));
	lp.clickLogin();
}
}
