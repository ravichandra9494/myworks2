package com.Vtiger.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

/**
 * 
 * @author Ravi
 *
 */

public class BaseTest implements IAutoConstant{
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	public static WebDriver driver;
	public static void OpenApplication() throws IOException
	{
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(WebDriverUtils.getCommonDatafromProperties("url"));
	}
	
	public static int Passcount = 0 ,Failcount = 0;
	public static void CloseApplication(ITestResult res)
	{
		String tcName = res.getName();
		int status = res.getStatus();
		if(status == 1)
		{
			Passcount++;
			System.out.println("Passcount : " +  Passcount);
		}
		else
		{
			Failcount++;
			System.out.println("FailCount : " + Failcount);
			String proof = PHOTO_PATH+tcName+".png";
			WebDriverUtils.takesScreenShot(driver,proof);
		}
		//Close the Browser
		driver.close();
	}
}
