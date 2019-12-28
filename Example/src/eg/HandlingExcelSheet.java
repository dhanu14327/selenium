package eg;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
	Workbook wk = WorkbookFactory.create(new File("./TestData/TestData.xlsx"));
	Sheet sh = wk.getSheet("Demo");
	Row r = sh.getRow(0);
	Cell c = r.getCell(0);
	System.out.println(c.toString());
	Cell c1 = r.getCell(1);
	System.out.println(c1.toString());
	String xyz = wk.getSheet("Demo").getRow(1).getCell(0).toString();
	System.out.println(xyz);
	
	String usn = wk.getSheet("Demo").getRow(3).getCell(0).toString();
	String pwd = wk.getSheet("Demo").getRow(3).getCell(1).toString();
	System.out.println(usn);
	System.out.println(pwd);
	}
}