package com.qa.AppHooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.Factory.Driver_Factory;
import com.qa.Utility.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Application_Hooks 
{
	private Driver_Factory driverfactory;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() throws IOException
	{
		configreader=new ConfigReader();
		prop = configreader.init_prop();
	}
	
	@Before(order = 1)
	public void launchBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverfactory=new Driver_Factory();
		driver = driverfactory.init_driver(browserName);
	}
	
	@After(order = 0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order = 1)
	public void takeScreenshot(Scenario sc)
	{
		if(sc.isFailed())
		{
			String screenShot = sc.getName().replaceAll(" ", "_");
			byte[] srcPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			
			sc.attach(srcPath, "imp/png", screenShot);
		}
	}
}
