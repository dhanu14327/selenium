package com.ebankingexample.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class ReadConfig {

	public static Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		try
		{
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			Reporter.log("Exception is : "+e.getMessage());
		}
	}
	
	public String getappURL()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getUsername()
	{
		String uname=pro.getProperty("username");
		return uname;	
	}
	public String getPassword()
	{
		String pwd=pro.getProperty("password");
		return pwd;	
	}
	public String getChromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;	
	}	
	public String getFirefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;	
	}	
	
	
}