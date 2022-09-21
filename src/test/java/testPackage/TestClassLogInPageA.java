package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.LogInPageOrangeHrm;
import utility.Pojo;
import utility.Wait;

public class TestClassLogInPageA extends Pojo
{
	private static final boolean False = false;
	WebDriver driver;
	
	@BeforeClass()
	public void beforeClass()
	{
		WebDriver driver=chromeBrowser();
		this.driver=driver;
	}
	
	@Test()
	public void VerifyLoginPage()
	{
		LogInPageOrangeHrm login= new LogInPageOrangeHrm(driver);
		Wait.explicitWaitUsername(driver);
		login.sendUsername();
		login.sendPassword();
		login.clickOnLoginButton();
		System.out.println("TestA for class A");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		System.out.println("after Class for class A");
		//driver.quit();
	}
	
}
