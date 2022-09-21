package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends Pojo
{
	public static void explicitWaitAdmin(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Admin']")));
	}
	
	public static void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void explicitWaitPIM(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='PIM'])[1]")));
	}
	
	public static void explicitWaitLeave(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Leave']")));
	}
	
	public static void explicitWaitUsername(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
	}
	public static void explicitWaitPassword(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password']")));
	}
	public static void explicitWaitLoginButton(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));
	}
	

}
