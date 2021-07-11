package com.aruba.action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriveArubaFunction 
{
	public static WebDriver driver = null; // before this external libraries must be added 
	
	public static void getFunction()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
