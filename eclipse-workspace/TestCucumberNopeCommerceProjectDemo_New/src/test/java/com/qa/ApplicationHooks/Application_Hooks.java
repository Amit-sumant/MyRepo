package com.qa.ApplicationHooks;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.qa.Factory.Driver_Factory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Application_Hooks 
{
	/**
	 * This is specific for Application Hook
	 */
	private Driver_Factory driverFactory;
	private WebDriver driver;
	private ConfigReader confgReader;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() throws FileNotFoundException
	{
		confgReader = new ConfigReader();
		prop = confgReader.init_prop();
	}
	
	@Before(order = 1)
	public void launchBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverFactory=new Driver_Factory();
		driver = driverFactory.init_driver(browserName);
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
			String screenshotname = sc.getName().replaceAll(" ", "_");
			byte [] src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(src, "img/png", screenshotname);
		}
	}
}
