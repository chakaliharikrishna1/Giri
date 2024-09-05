package basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAndWrite {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new	FileInputStream("./src/test/resources/TextData.xlsx");
	    Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet= wb.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);
		wb.close();
		
		
		
		
	}

}
