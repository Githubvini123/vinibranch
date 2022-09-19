package Generic;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class screenshot extends Base_test
{
	public static void main(String[]args) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dst=new File("\"C:\\Users\\vinay\\Desktop\\screenshots\".jpeg");
		FileHandler.copy(src, dst);
       
		
		
		
	}

}
