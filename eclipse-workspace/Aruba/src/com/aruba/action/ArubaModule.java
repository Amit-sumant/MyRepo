package com.aruba.action;

import java.awt.AWTException;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArubaModule {
	
	@BeforeMethod
	public void setup()
	{
		DriveArubaFunction.getFunction();
		DriveArubaFunction.driver.get("http://newtours.demoaut.com/");
		
		try {
			File fl = ((TakesScreenshot)DriveArubaFunction.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fl, new File("C:\\Users\\mypc\\Desktop\\ss\\ss1.jpg"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void regisCnt()
	{
		ArubaProject.getAllLink();
	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		ArubaProject.AurubaRegis();
		ArubaProject.fillRegisdetails("Narendra", "M", "123456789", "narendra.m@gmail.com");
		ArubaProject.mailingInfo("abc road", "pune", "pune1", "Maharashtra", 123, "INDIA");
		ArubaProject.UserInfo("narendra.m@gmail.com", "Pass123", "Pass123");
		ArubaProject.Submit();
		
		Thread.sleep(5000);
		ArubaProject.signoff();
		
		Thread.sleep(5000);
		ArubaProject.homepage();
	}
	
	public void testcase2()
	{
		ArubaProject.getAllLinks();
	}
	
}
