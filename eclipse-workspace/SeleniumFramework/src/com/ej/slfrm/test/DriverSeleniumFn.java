package com.ej.slfrm.test;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverSeleniumFn 
{
	public static WebDriver driver = null;
	
	public static void getFunction()
	{
		//System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		System.setProperty("Webdriver.Internet.driver", "C:\\IEDriverServer.exe");
		//driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("Login Name")).getAttribute("kl");
	}

}
