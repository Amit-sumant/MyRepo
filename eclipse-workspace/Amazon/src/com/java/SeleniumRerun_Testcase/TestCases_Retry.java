package com.java.SeleniumRerun_Testcase;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

public class TestCases_Retry 
{
	static WebDriver driver;

	@BeforeTest
	public void beforeTest()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void afterTest()
	{
		driver.close();
	}
	@Test(retryAnalyzer = Rerun_Automation.class)
	public void testMethod() throws IOException
	{
		String title = driver.getTitle();
		System.out.println("Your Page Title is -> " + title);
		assertEquals(title, "Google");
		
		takeScreenshot();
		
		WebElement section = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		specifictakeScreenshot(section, title);
	}
	
	public void takeScreenshot() throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File trgFile = new File(".\\Screenshots\\fullpage.png");
		
		FileUtils.copyFile(srcFile, trgFile);
		
	}
	
	public void specifictakeScreenshot(WebElement ele, String fileName) throws IOException
	{
		//TakesScreenshot ts=((TakesScreenshot)driver);
		File srcFile = ele.getScreenshotAs(OutputType.FILE);
		File trgFile = new File(".\\Screenshots" + fileName + ".png");
		
		FileUtils.copyFile(srcFile, trgFile);
		
	}

}
