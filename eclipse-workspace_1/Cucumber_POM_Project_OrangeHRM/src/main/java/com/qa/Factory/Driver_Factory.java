package com.qa.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Factory 
{
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver(String browser)
	{
		System.out.println("Browser Value " + browser);
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			tldriver.set(new EdgeDriver());
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		else
		{
			System.out.println("Pass the Correct Browser " + browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
	}
	
	public static synchronized WebDriver getDriver()
	{
		return tldriver.get();
	}

}
