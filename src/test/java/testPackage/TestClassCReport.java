package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pomPackage.HomePageOrangeHrm;
import pomPackage.LogInPageOrangeHrm;
import utility.Pojo;
import utility.Screenshot;
import utility.TakeScreenshot;

public class TestClassCReport extends Pojo
{
	WebDriver driver;
	SoftAssert s= new SoftAssert();
	HomePageOrangeHrm home;
	ExtentTest logger;
	ExtentReports extent;
	@BeforeClass
	public void beforeClass()
	{
		WebDriver driver=chromeBrowser();
		this.driver= driver;
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("./test-output/velocity.html");
		 extent= new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("verifyLoginPage");
		 logger = extent.createTest("verifyHomePage");
	}
	
	@Test (priority=0)
	public void verifyLoginPage() throws InterruptedException, IOException
	{
	
		LogInPageOrangeHrm login= new LogInPageOrangeHrm(driver);
		  login.sendUsername();
		  login.sendPassword();
		  login.clickOnLoginButton();	
		  Thread.sleep(2000);
		
		  String ActualURL = driver.getCurrentUrl();
		  System.out.println(ActualURL);
		  String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		  SoftAssert s= new SoftAssert();
		  s.assertEquals(ActualURL, ExpectedURL);
		  s.assertAll();
		 
	}
	
	
	@Test (priority=1)
	public void verifyHomePage() throws InterruptedException
	{
		
		System.out.println("Hello");
	}
	

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path =TakeScreenshot.captureScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
		
		extent.flush();
	}

}
