package com.ej.slfrm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GeneralExampleofXpath 
{
	public static WebDriver driver;
	
	@Test
	public static void getXpath()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		//System.setProperty("Webdriver.Internet.driver", "C:\\IEDriverServer.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.id("Login Name")).getAttribute("kl");
		//driver.findElement(By.xpath("//span[contains(text(),' sign up')]")).click();
		//Mouse Over element
		
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		
		
		
		
	}

}
