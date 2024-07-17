package com.sample.action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickers 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String year = "2023";
		String month = "Mar";
		String day = "30";
		
		driver.findElement(By.xpath("//label[normalize-space()='Date']")).click();
		
		while(true)
		{
			String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String arr[] = monthyear.split(" ");
			//System.out.println();
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
			break;
			
			else
			{
				driver.findElement(By.xpath("//td[contains(@class,'next')]")).click();
			}
			
			//date selection
			
			List<WebElement> ele = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//tbody/tr[7]/td[4]"));
			
			for(WebElement wl : ele) 
			{
				String dt = wl.getText();
				
				if(dt.equals(day))
				{
					wl.click();
					break;
				}
			}
			
		}

	}

}
