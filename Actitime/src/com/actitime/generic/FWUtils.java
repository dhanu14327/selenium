package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FWUtils {

	/** 
	 * This method is used to get the data from excel sheet
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return string
	 */
	public static String getXLData(String path,String sheet,int row,int cell)
	{
		String value="";
		try 
		{
			Workbook wk = WorkbookFactory.create(new File(path));
			value = wk.getSheet(sheet).getRow(row).getCell(cell).toString();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return value;
	}

	/**
	 * This method is used to write a string value into excel sheet
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 */
	public static void setXLData(String path,String sheet,int row,int cell,String value) // set value into excel file
	{
		try
		{
			FileInputStream fis=new FileInputStream(new File(path));
			Workbook wk = WorkbookFactory.create(fis);
			Sheet sh=wk.getSheet(sheet);
			Row r=sh.getRow(row);
			if(r==null)
				r=sh.createRow(row);
			Cell c=r.getCell(cell);
			if(c==null)
			{
				c=r.createCell(cell);
				c.setCellValue(value);
				FileOutputStream fos=new FileOutputStream(new File(path));
				wk.write(fos);
				fos.close();
				wk.close();
				fis.close();
			}

		} 
		catch (EncryptedDocumentException | IOException e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * This method is used for taking Screenshots
	 * @param driver
	 * @param path
	 */
	public static void getSnapshot(WebDriver driver, String path) // take screenshot
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try 
		{
			FileUtils.copyFile(src, dest);
			
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
	/**
	 * This method is used to get the last Row Number of an excel sheet
	 * @param path
	 * @param sheet
	 * @return
	 */
	public static int getLastRowNumber(String path, String sheet) // get last row number of excel sheet
	{
		int value=0;
		try 
		{
			Workbook wk = WorkbookFactory.create(new File(path));
			value=wk.getSheet(sheet).getLastRowNum();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * This method is used to verify the title of a webpage
	 * @param driver
	 * @param expectedTitle
	 */
	public static void verifyTitles(WebDriver driver,String expectedTitle)
	{
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expectedTitle);
	}
}
