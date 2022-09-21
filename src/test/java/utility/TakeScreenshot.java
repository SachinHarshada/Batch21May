package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot 
{
	public static String captureScreenshot(WebDriver driver) throws IOException
	{
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path= "D:\\Screenshot\\SS_"+System.currentTimeMillis()+".jpeg";
		
		File destination=new File(path);
		
		FileUtils.copyFile(source, destination);
		return path;
	}
}
