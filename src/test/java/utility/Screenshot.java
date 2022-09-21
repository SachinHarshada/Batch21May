package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Pojo
{
	
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println("Current date and time is " + date1);
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\harshada\\ScreenShot\\SS_"+date1+".jpeg");
		FileHandler.copy(source,dest);
	}
}
