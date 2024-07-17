package com.java.Final_1_June_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

public class WebTable_1 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notification");
		driver=new EdgeDriver(opt);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//get total rows first and Column
		int row = driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody/tr")).size();
		System.out.println("Total Rows - " + row);
		int col = driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody/tr/th")).size();
		System.out.println("Total Rows - " + col);
		
		//retrieve specific row and column
		String val = driver.findElement(By.xpath("//table[@class='ws-table-all']//tbody/tr[5]/td[3]")).getText();
		System.out.println("Your Data - " + val);
		
		//to highligh element
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid red'", val);
		
		Thread.sleep(1000);
		
		//retrieve all column and row
		for(int r=1;r<=row;r++) //row
		{
			for(int c=1;c<=col;c++) //col
			{
				String data = driver.findElement(By.xpath("//table[@class='ws-table-all']//tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println("Your Data - " + data);
			}
		}

	}

}
