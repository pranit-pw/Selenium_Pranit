package Manage_Exel_Files;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExel {
	
	
	//Method for Get data from Exel file
		public static String getDataFromExelFile (String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
			
			try 
			{
				String path = "C:\\Users\\Akash\\Desktop\\Book1.xlsx";
		 
		        FileInputStream file = new FileInputStream(path);
		        String data = WorkbookFactory.create(file).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		    
		        return data;
			}
			catch(IllegalStateException e)
			{
				String path = "C:\\Users\\Akash\\Desktop\\Book1.xlsx";
				FileInputStream file = new FileInputStream(path);
			    double value = WorkbookFactory.create(file).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
			    
			    String data = value + "";
				return data;
			}
		}

}
