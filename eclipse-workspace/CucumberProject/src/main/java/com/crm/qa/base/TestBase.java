package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.utility.TestUtil;

public class TestBase 
{
	static WebDriver driver;
	static Properties prop;
	
	public TestBase() throws IOException
	{
		//how to read properties
		try
		{
			prop = new Properties();
			FileInputStream fis=new FileInputStream("C:/Users/mypc/eclipse-workspace/CucumberProject/src/main/java/com/crm/qa/config/config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException I)
		{
			I.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("Internet Explorer"))
		{
			System.setProperty("Webdriver.chrome.driver", "C:\\IEDriverServer.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TIMEOUT, TimeUnit.SECONDS); // this Page load timeout call from TestUtil class.
		driver.manage().timeouts().implicitlyWait(TestUtil.Page_Load_IMPLICIT, TimeUnit.SECONDS); // this Page Implicit timeout call from TestUtil class.
		
		driver.get(prop.getProperty("url"));
	}

}
