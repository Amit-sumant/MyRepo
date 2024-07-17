package com.qa.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Factory 
{
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();
	
	/**
	 * This method is used to initialize 
	 * @param browser
	 * @return
	 */
	
	public WebDriver init_driver(String browser)
	{
		System.out.println("Browser Value is -> " + browser);
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			threadDriver.set(new ChromeDriver());
		}
		else
			if(browser.equals("firebox"))
			{
				WebDriverManager.firefoxdriver().setup();
				threadDriver.set(new FirefoxDriver());
			}
			else
				if(browser.equals("edge"))
				{
					WebDriverManager.edgedriver().setup();
					threadDriver.set(new EdgeDriver());
				}
				else
				{
					System.out.println("Please pass the correct Browser - " + browser);
				}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/**
	 * This is used to get the driver with ThreadLocal
	 * @return
	 */
	public static synchronized WebDriver getDriver()
	{
		return threadDriver.get();
	}

}
