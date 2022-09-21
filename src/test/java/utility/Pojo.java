package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo 
{
	
	public static WebDriver chromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\UpdatedVersion\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		return driver;
	}
}
