package com.java.Final_1_June_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip_Capture {
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='age']"));
		String toolText = ele.getAttribute("title");
		System.out.println(toolText);
		
	}

}
