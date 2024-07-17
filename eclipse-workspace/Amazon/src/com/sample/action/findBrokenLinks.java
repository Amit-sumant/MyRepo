package com.sample.action;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findBrokenLinks 
{
	
	static WebDriver driver;

	public static void main(String[] args) 
	{
		//Find Broken links in a web page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 103\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/blog/web-based-hr-management/");
		
		List<WebElement> lstbrokenlink = driver.findElements(By.tagName("a"));
		System.out.println(lstbrokenlink.size());
		
		List<String> urllist = new ArrayList<String>();
		
		for(WebElement e : lstbrokenlink)
		{
			String url = e.getAttribute("href");
			urllist.add(url);
			
			//getBrokenLinks(url);
			//here we get all url and iterate	
		}
		
		try
		{
			long sttime = System.currentTimeMillis();
			urllist.parallelStream().forEach(e -> {
				try {
					getBrokenLinks(e);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			long endtime = System.currentTimeMillis();
			
			System.out.println("Total Time Taken" + (endtime-sttime));
			
		}
		catch(Exception x) 
		{
			
		}
		
		driver.quit();
	}
	
	public static void getBrokenLinks(String linkurl) throws MalformedURLException 
	{
		try 
		{
			URL newurl=new URL(linkurl); //now we have to use OPenConnection method
			HttpURLConnection httpurlconn = (HttpURLConnection) newurl.openConnection(); //HTTPURLConnection is a superclass
			httpurlconn.setConnectTimeout(5000);
			httpurlconn.connect(); //this connect with URL
			
			if(httpurlconn.getResponseCode()>=400) //400 is a for bad request
			{
				System.out.println(linkurl + " -----> " + httpurlconn.getResponseMessage() + " is a broken link");
			}
			else
			{
				System.out.println(linkurl + " -----> " + httpurlconn.getResponseMessage());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
