package Generic;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test
{
	public static WebDriver driver;
	@BeforeMethod
	public void Openapp1()
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("Base_url");
		
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
