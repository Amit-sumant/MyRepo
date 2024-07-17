package com.sample.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles 
{
	
	static WebDriver driver;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 101\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.orangehrm.com/blog/web-based-hr-management/");
		driver.findElement(By.xpath("//span[@class='fa fa-facebook']")).click();
		
		
		//driver.findElement(By.xpath("//span[@class='fa fa-twitter']")).click();
		
		
		//driver.findElement(By.xpath("//span[@class='fa fa-linkedin']")).click();
		
		Set<String> str=driver.getWindowHandles(); //here it return window it stored in a list4
		
		List<String> hlist = new ArrayList<String>(str);
		if (switchtoRightWindow("Facebook", hlist))
		{
			System.out.println(driver.getCurrentUrl()   + "" + driver.getTitle());
		}
		
	}
	
	public static boolean switchtoRightWindow(String winTitle, List<String> hlist) 
	{
		for(String e : hlist)
		{
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(winTitle))
			{
				System.out.println("Found Right Window");
				return true;
			}
		}
		return false;
	}

}
