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

import pomPackage.LogInPageOrangeHrm;

public class TestClassAssertLogInPageA 
{
	private static final boolean False = false;
	WebDriver driver;

	@BeforeClass()
	
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\UpdatedVersion\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//System.out.println("Before Class for class A");
	}
	
//	@BeforeMethod()
//	
//	public void beforeMethod()
//	{
//		System.out.println("Before Method for class A");
//	}	
	
	@Test()
	public void VerifyLoginPage()
	{
		LogInPageOrangeHrm login= new LogInPageOrangeHrm(driver);
		//boolean result=login.sendUsername();
		login.sendPassword();
//		login.clickOnLoginButton();
		System.out.println("TestA for class A");
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String expectedUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		Assert.assertEquals(actualUrl, expectedUrl);
		//Assert.assertNotEquals(actualUrl, expectedUrl);
		
		SoftAssert s =new SoftAssert();
		//s.assertEquals(actualUrl,expectedUrl);
		System.out.println("Hello");
		s.assertNotEquals(actualUrl,expectedUrl);
		s.assertAll();
	}
	
//	@Test(priority=0, invocationCount=2)
//	public void testB()
//	{
//		System.out.println("TestB for class A");
//	}
//	
//	@Test (priority=-1, dependsOnMethods= {"testB"})
//	public void testC()
//	{
//		System.out.println("TestC for class A");
//	}

	
//	@Test (timeOut=3000)
//	public void testD() throws InterruptedException
//	{
//		
//		System.out.println("TestD for class A");
//		Thread.sleep(5000);
//		
//	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method for class A");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		System.out.println("after Class for class A");
		//driver.quit();
	}
	
		
}
