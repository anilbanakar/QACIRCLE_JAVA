import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {


		
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			
		       // when data is minimal and data is constant then use properties file, if data is more then use excel sheet , 
				//ex: search box to search mobiles or if want check login with different credentials
				
				
				FileInputStream fs = new FileInputStream("TesData\\LoginData.xlsx");
				
				Workbook wb= WorkbookFactory.create(fs);
				Sheet sh = wb.getSheet("Login"); // sheet should import from poi.ss not sl
				String data =sh.getRow(0).getCell(0).toString();
				System.out.println(data);
	}

}
