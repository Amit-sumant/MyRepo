package com.java.Final_1_June_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor_Examples 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//drawing border
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
	}

}
