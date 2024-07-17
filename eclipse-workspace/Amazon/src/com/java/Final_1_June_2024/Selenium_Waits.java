package com.java.Final_1_June_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Waits 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notification");
		driver=new EdgeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Today's Deals")).click();
		
		Thread.sleep(1000);
		
		WebElement cll = driver.findElement(By.xpath("//span[@class='a-truncate-cut' and contains(text(),'Amazon Brand - Presto! Glass & Household Cleaner Refill Pouch - 1…')]"));
		cll.click();
		
		//By elocator = By.xpath("//span[@class='a-truncate-cut' and contains(text(),'Amazon Brand - Presto! Glass & Household Cleaner Refill Pouch - 1…')]");
		
		//waitforElementPresent(driver, elocator, 10).click();
		
	}
	
	public static WebElement waitforElementPresent(WebDriver driver, By locator, int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
	}

}
