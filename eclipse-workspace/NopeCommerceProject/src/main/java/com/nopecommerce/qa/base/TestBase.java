package com.nopecommerce.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.nopecommerce.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try 
		{
			prop = new Properties();
			FileInputStream fis;
			fis = new FileInputStream("E:\\New folder\\MyRepo\\eclipse-workspace\\NopeCommerceProject\\src\\main\\java\\com\\nopecommerce"
					+"\\qa\\config\\config.properties");
			
			prop.load(fis);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void initialiazation()
	{
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(opt);
		}
		else 
			if(browsername.equals("edge"))
		{
				WebDriverManager.edgedriver().setup();
				EdgeOptions opt = new EdgeOptions();
				opt.addArguments("--remote-allow-origins=*");
				driver = new EdgeDriver(opt);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.Page_LOAD_Implicitly));
		
		driver.get(prop.getProperty("url"));
	}

}
