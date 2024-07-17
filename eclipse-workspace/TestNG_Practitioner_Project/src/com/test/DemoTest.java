package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		String url = "https://www.google.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@Test
	public void googleTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void googleImage()
	{
		boolean ele =  driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(ele);
	}
	
	@Test
	public void googleSearch()
	{
		boolean b = driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).isDisplayed();
		System.out.println(b);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
