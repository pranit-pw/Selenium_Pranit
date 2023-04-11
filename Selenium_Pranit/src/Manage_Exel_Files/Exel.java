package Manage_Exel_Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		String data = GetDataFromExel.getDataFromExelFile("Sheet1", 6, 0);
		System.out.println(data);
		
//	    String path = "C:\\Users\\Akash\\Desktop\\Book1.xlsx" ;
//	    
//	    FileInputStream file = new FileInputStream(path);
	    
//	    Workbook book = WorkbookFactory.create(file);
//	    
//	    Sheet sheet = book.getSheet("Sheet1");
//	    
//	    Row row = sheet.getRow(3);
//	    
//	    Cell cell = row.getCell(1);
//	    
//	    String data = cell.getStringCellValue();
//	    
//	    System.out.println(data);
//	    
//	    String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(7).getCell(1).getStringCellValue();
//	    
//	    String data = value + "";
//	    System.out.println(data);
	    
		
	    
	
	}	

	

}
