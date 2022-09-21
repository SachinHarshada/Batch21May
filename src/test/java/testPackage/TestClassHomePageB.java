package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.HomePageOrangeHrm;
import pomPackage.LogInPageOrangeHrm;
import utility.Excelsheet;
import utility.Wait;
import utility.Pojo;
import utility.Screenshot;

public class TestClassHomePageB extends Pojo
{
	private static final boolean False = false;
	WebDriver driver;
	
	@BeforeClass()
	public void beforeClass()
	{
		WebDriver driver=chromeBrowser();
		this.driver=driver;
	}
	
	@BeforeMethod()
	public void beforeMethod() throws IOException
	{
		LogInPageOrangeHrm login= new LogInPageOrangeHrm(driver);
		System.out.println("Before Method B");
		//Wait.explicitWaitUsername(driver);
		login.sendUsername();
		//Wait.explicitWaitPassword(driver);
		login.sendPassword();
		login.clickOnLoginButton();
		Screenshot.takesScreenshot(driver);
	}	
	
	@Test()
	public void verifyAdminTab() throws InterruptedException
	{
		HomePageOrangeHrm home=new HomePageOrangeHrm(driver);

//		Wait.explicitWaitAdmin(driver);
//		Wait.implicitwait(driver);
		home.verifyAdminTab();

	}
	
	@Test()
	public void verifyExcelsheet() throws EncryptedDocumentException, IOException
	{
		Excelsheet.fetchDataOfExcel(driver);
		
	}
	
//	@Test()
//	public void verifyrecruitmentTab()
//	{
//		HomePageOrangeHrm recruit= new HomePageOrangeHrm(driver);
//		recruit.verifyrecruitmentTab();
//	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method for class B");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class for class B");
		driver.quit();
	}
}
