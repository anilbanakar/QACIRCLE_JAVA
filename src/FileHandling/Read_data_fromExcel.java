package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_data_fromExcel {

	public static void main(String[] args) throws IOException {
		
		/*
		 * FileInputStream fs = new FileInputStream("TestData\\LoginData.xlsx");
		 * 
		 * Workbook wb = WorkbookFactory.create(fs); Sheet sh= wb.getSheet("Login");
		 * String data = sh.getRow(2).getCell(0).toString(); System.out.println(data);
		 */		
         FileInputStream fs = new FileInputStream("TestData\\LoginData.xlsx");
		
		Workbook wb= WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet("Login"); // sheet should import from poi.ss not sl
		String data =sh.getRow(2).getCell(0).toString();
		System.out.println(data);
		
		
	}

}
