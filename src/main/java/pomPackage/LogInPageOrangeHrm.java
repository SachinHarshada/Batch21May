package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPageOrangeHrm 
{	
	static WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//*[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//*[@type='submit']")
	private WebElement loginbutton;
	
	public LogInPageOrangeHrm(WebDriver driver)
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
		username.sendKeys("Admin");
	}
	public void sendPassword()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password']")));
		password.sendKeys("admin123");
	}
	public void clickOnLoginButton()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));
		loginbutton.click();
	}
}

