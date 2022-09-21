package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.HomePageOrangeHrm;
import pomPackage.LogInPageOrangeHrm;

public class TestClassAssertHomePageB 
{
	private static final boolean False = false;
	WebDriver driver;
	
	@BeforeClass()
	
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\UpdatedVersion\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Before Class B");
	}
	
	@BeforeMethod()
	
	public void beforeMethod()
	{
		LogInPageOrangeHrm login= new LogInPageOrangeHrm(driver);
//		System.out.println("Before Method B");
		login.sendUsername();
		login.sendPassword();
		login.clickOnLoginButton();
	
	}	
	
	@Test()
	public void verifyAdminTab() throws InterruptedException
	{
		HomePageOrangeHrm home=new HomePageOrangeHrm(driver);
		//boolean result1=home.verifyAdminTab();
		//System.out.println("TestA for class B");
		Thread.sleep(2000);
		//Assert.assertTrue(result1); //hard assert
		//Assert.assertFalse(result1); //hard assert
		//Assert.fail(); //hard assert
		
//		SoftAssert s =new SoftAssert();
//		
////		s.assertTrue(result1);
//		
//		//s.assertFalse(result1);
//		s.assertAll();
	}
	
//	@Test(priority=0, invocationCount=2)
//	public void testB()
//	{
//		System.out.println("TestB for class B");
//	}
//	
//	@Test (priority=-1, dependsOnMethods= {"testB"})
//	public void testC()
//	{
//		System.out.println("TestC for class B");
//	}
//
//	
////	@Test (timeOut=3000)
////	public void testD() throws InterruptedException
////	{
////		
////		System.out.println("TestD for class B");
////		Thread.sleep(5000);
////		
////	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method for class B");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		System.out.println("after Class for class B");
	}
	
}
