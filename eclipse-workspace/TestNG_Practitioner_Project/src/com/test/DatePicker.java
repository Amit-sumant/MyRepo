package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		String date="22";
		String year="2024";
		String month="Jan";
		
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		
		while(true)
		{
			String monthyear = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[2]")).getText();
			
			String str[] = monthyear.split(" ");
			String mon = str[0];
			String yr = str[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			
			else
				driver.findElement(By.xpath("//*[@id='Layer_1']")).click();
				Thread.sleep(1000);
			
				//String str1="//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[1]//*[local-name()='svg']";
				//String str2="//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[local-name()='svg']";
				
			WebElement clickNext = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[local-name()='svg']"));
			Boolean bNext = Boolean.FALSE;
			
			if(clickNext!=null)
			{
				bNext = clickNext.isDisplayed();
			}
			
			if(bNext)
			{
				clickNext.click();
			}
		}

	}

}
