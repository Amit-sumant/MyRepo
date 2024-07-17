package com.sample.action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableExamaple 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//how many rows in a table
		List<WebElement> listofrow = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		System.out.println("Total Rown in a table -> " + listofrow.size());
		
		int rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
		System.out.println("Total rows -> " + rows);
		
		//find first col
		List<WebElement> firstrowcol = driver.findElements(By.xpath("//table[@id='countries']//tbody/tr[1]/td"));
		System.out.println("Total column size are -> " + firstrowcol.size());
		
		int columns = driver.findElements(By.xpath("//table[@id='countries']//tbody/tr[1]/td")).size();
		System.out.println("Total Columns are -> " + columns);
		
		//below code will dislay all tables
		/*
		  for(int r=1; r<=rows; r++) 
		  { 
		  for(int c=1; c<=columns; c++) 
		  { 
		  	String str = driver.findElement(By.xpath("//table[@id='countries']//tbody/tr["+r+"]/td["+c+"]")).getText(); 
		  	System.out.print(" --> " + str + "    ");
		  
		  
		  } System.out.println(); }
		 */
		
		//above code from 42 to 52 will dislay all tables
		
		System.out.println("********************************************************************");
		
		for(int r=1;r<=rows;r++)
		{
			String country = driver.findElement(By.xpath("//table[@id='countries']//tbody/tr["+r+"]/td[2]")).getText();
			System.out.println(country);
			
			if(country.equals("India"))
			{
				String capital = driver.findElement(By.xpath("//table[@id='countries']//tbody/tr["+r+"]/td[3]")).getText();
				System.out.println(country + " " + capital);
				
				driver.findElement(By.xpath("//input[@type='checkbox']["+r+"]")).click();
			}
		}
		
		
	}

}
