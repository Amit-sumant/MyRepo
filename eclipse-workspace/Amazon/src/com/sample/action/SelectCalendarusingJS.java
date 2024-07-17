package com.sample.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarusingJS 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 103\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit Wait example
		//WebElement we=(new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("Search")));
		//driver=(WebDriver) new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("Search")));
		
		String url = "https://www.spicejet.com/";
		driver.get(url);
		
		WebElement dateele = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[1]"));
		String date = "Wed, 7 Dec 2022";
		
		selectDate(driver, dateele, date);
		
		Thread.sleep(3000);

	}
	
	public static void selectDate(WebDriver driver, WebElement ele, String date)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver; //this is called cast
		js.executeScript("argument[0].setAttribute('"+date+"');", ele);
		
	}

}
