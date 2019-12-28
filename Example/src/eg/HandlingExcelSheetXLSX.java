package eg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelSheetXLSX {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);

		Workbook wk = WorkbookFactory.create(fis);
		Sheet sh = wk.getSheet("Demo");
		Row r=null;
		if (sh!=null) {
			r=sh.getRow(0);
		}
		Cell c=r.getCell(3);
		if (c==null)
			c=r.createCell(3);
		c.setCellValue("Over-WRITTEN");
		FileOutputStream fos=new FileOutputStream(f);
		wk.write(fos);
		fos.close();
		wk.close();
		fis.close();
		System.out.println("pass");
	}

}
