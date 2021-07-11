package com.ej.slfrm.test;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.File;

public class DriverSeleniumodule
{
	@BeforeMethod
	
	public void setup(int cnt)
	{
		DriverSeleniumFn.getFunction();
		DriverSeleniumFn.driver.get("https://test.salesforce.com/");
		
		try {
			File fl = ((TakesScreenshot)DriverSeleniumFn.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fl, new File("C:\\Users\\mypc\\Desktop\\ss\\ss"+cnt+".jpg"));
		}catch(Exception e) 
		{
			e.printStackTrace();
		}	
	}
	
	@AfterMethod
	public void Loginpage()
	{
		DriverSeleniumMainProj.loginpage();
	}
	
	@Test
	public void Testcase1()
	{
		//DriverSeleniumMainProj.drivetut();
	}
}
