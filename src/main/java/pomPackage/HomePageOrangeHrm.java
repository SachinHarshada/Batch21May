package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePageOrangeHrm 
{
	static WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//*[text()='Admin']")
	WebElement admin;
	
	@FindBy (xpath="(//*[text()='PIM'])[1]")
	WebElement pim;
	
	@FindBy (xpath="//*[text()='Leave']")
	WebElement leave;
	
	@FindBy (xpath="(//*[text()='Recruitment'])[1]")
	WebElement recruitment;
	
	public HomePageOrangeHrm(WebDriver driver)
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyAdminTab()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Admin']")));
		admin.isDisplayed();
		
		admin.click();
		//boolean result=admin.isDisplayed();
		//return result;
	}
	
//	public void verifyPimTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Configuration ']")));
//		pim.click();
//		pim.isDisplayed();
//	}
//	
//	public void verifyLeaveTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Configuration ']")));
//		leave.click();
//		leave.isDisplayed();
//	}
	
	public void verifyrecruitmentTab()
	{
		recruitment.isDisplayed();
		recruitment.click();
	}
	
}
