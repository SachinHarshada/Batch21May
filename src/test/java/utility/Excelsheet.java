package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Excelsheet 
{
	WebDriver driver;
	public static void fetchDataOfExcel(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		
		 String path="D:\\xcel\\Harshada.xlsx";
		 FileInputStream file=new FileInputStream(path);
		 Sheet sheet= WorkbookFactory.create(file).getSheet("Velocity");
		 int lastrow= sheet.getLastRowNum();
		 int lastcolumn=sheet.getRow(0).getLastCellNum();
		 
		 for(int i=0;i<=lastrow;i++)
		 {
			 for (int j=0;j<lastcolumn;j++)
			 {
				 String value2= sheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.print("  "+value2);
			 }
			 System.out.println();
		 }
	}

}
