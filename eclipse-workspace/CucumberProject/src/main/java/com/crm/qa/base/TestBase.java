 package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.utility.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		//how to read properties
		//Using property class read all config file
		try
		{
			prop = new Properties();
			FileInputStream fis=new FileInputStream("E:\\New folder\\MyRepo\\eclipse-workspace\\CucumberProject\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
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
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\DELL\\Documents\\Chrome 93\\chromedriver.exe"); driver = new
			 * ChromeDriver();
			 */
			
			driver = WebDriverManager.chromedriver().create();
			
		}
		else if(browsername.equals("Internet Explorer"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			//driver = WebDriverManager.edgedriver().setup();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TIMEOUT, TimeUnit.SECONDS); // this Page load timeout call from TestUtil class.
		driver.manage().timeouts().implicitlyWait(TestUtil.Page_Load_IMPLICIT, TimeUnit.SECONDS); // this Page Implicit timeout call from TestUtil class.
		
		driver.get(prop.getProperty("url"));
		
	}
	
	//Authentication Popup Code
	public static void AuthPopup()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 103\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		String username = "amits@gmail.com";
		String password = "MA@2006";
		
		driver.get("http://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");
	}

}
