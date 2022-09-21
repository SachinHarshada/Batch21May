package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Excelsheet;

public class TestClassFetchDataFromXcelSheet 
{
	WebDriver driver;
	@Test
	public void verifyExcelsheet() throws EncryptedDocumentException, IOException
	{
		
		Excelsheet.fetchDataOfExcel(driver);
		this.driver=driver;
		
	}

}
