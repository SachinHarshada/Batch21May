package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.HomePageOrangeHrm;
import pomPackage.LogInPageOrangeHrm;

public class TestOrange 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Updated Version\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		// to verify/to check that login functionality
		
		driver.manage().window().maximize();
		
		LogInPageOrangeHrm login= new LogInPageOrangeHrm(driver);
		
		login.sendUsername();
		login.sendPassword();
		login.clickOnLoginButton();
		
		// to verify/to check that home page functionality
		
		HomePageOrangeHrm home= new HomePageOrangeHrm(driver);
		
//		home.verifyAdminTab();
//		home.verifyPimTab();
//		home.verifyLeaveTab();
		
		driver.close();
	}
}
