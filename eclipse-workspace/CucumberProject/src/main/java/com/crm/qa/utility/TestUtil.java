package com.crm.qa.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtil extends TestBase
{
	//this class called for all common method need to be write here E.g. Screenshot, switch to Frame
	
	public static long Page_Load_TIMEOUT = 20;
	public static long Page_Load_IMPLICIT = 10;
	
	public void takeScreenShot(String fileName) throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //TakeScreenshot is an Interface
		// getScreenshot is a method and return File object. And store is in File format
		//below code copy the screenshot and save into desired location
		String currentdir = System.getProperty("user.dir");
		FileUtils.copyFile(file, new File("E:\\New folder\\MyRepo\\eclipse-workspace\\CucumberProject\\src\\test\\java\\com\\crm\\qa\\TestCase" 
		+ fileName + ".jpg"));
	}
	
	public void multipleBrowserHandle()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		String url = "https://google.com";
		driver.get(url);
		
		Set<String> str= driver.getWindowHandles();
		
		//shortcut method of handling multiple window
		List<String> windowIDlist=new ArrayList(str);
		
		for(String winid : windowIDlist)
		{
			String title = driver.switchTo().window(winid).getTitle();
			if(title.equals("our page title"))
			{
				driver.close();
			}
		}
		
		/*Iterator<String> it= str.iterator();
		
		String parentWinID = it.next();
		System.out.println("Parent Win");
		
		String childWinID = it.next();
		System.out.println("Child Id");
		
		driver.switchTo().window(childWinID);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWinID);
		System.out.println(driver.getTitle());*/
		
		
	}

}
