package com.java.Final_1_June_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Link 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new EdgeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Today's Deals")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("A"));
		
		int no = links.size(); System.out.println(no);
		
		for(int i=0;i<links.size();i++)
		{
			String alllinks = links.get(i).getText();
			System.out.println(alllinks);
			System.out.println(links.get(i).getAttribute("href"));
		}
			
	}

}
