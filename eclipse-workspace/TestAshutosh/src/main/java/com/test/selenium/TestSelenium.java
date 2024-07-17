package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	
	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException 
	{
		//https://app.hubspot.com/login
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://freecrm.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath("//span[@class='mdi-chart-bar icon icon-md']"));
		ele.click();
		

	}

}
