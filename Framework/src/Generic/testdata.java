package Generic;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class testdata
{
	public static String getdata(String Sheet1,int row,int cell) throws EncryptedDocumentException, IOException
	
	{
		String val="";
		FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		val=book.getSheet(Sheet1).getRow(row).getCell(cell).getStringCellValue();
		return val;
		
		
		
		
	}

}
