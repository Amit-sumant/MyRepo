package com.test;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMap_RealTime_Use_In_Selenium 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);

		driver.get("https://classic.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys(getusercredentials("Retailer"));
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys(getpwdcredentials("Retailer"));
		
	}
	
	public static HashMap<String, String> entercredentialsMAP()
	{
		HashMap<String, String> umap=new HashMap<String, String>();
		umap.put("Customer", "ameet2012:Sriram@1981");
		umap.put("Retailer", "abc:abc123");
		umap.put("Distributor", "xyz:xyz123");
		umap.put("Seller", "svg:svg123");
		
		return umap;
	}
	
	public static String  getusercredentials(String role)
	{
		String credentials = entercredentialsMAP().get(role);
		return credentials.split(":")[0];
	}
	
	public static String getpwdcredentials(String role)
	{
		String credentials = entercredentialsMAP().get(role);
		return credentials.split(":")[1];
	}

}
