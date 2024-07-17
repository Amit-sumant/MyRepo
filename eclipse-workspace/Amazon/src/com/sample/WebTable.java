package com.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		// How many rows in a table
		// How many columns in a table
		// Retrive the specific row/column data
		// Retrive the all data from a table
		// Print which table you want to print
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// How many columns in a row
		
		int rows = driver.findElements(By.xpath("//table[@id='countries']//tbody/tr")).size();
		System.out.println("Total Number of Rows in a table -> " + rows);
		
		// How many columns in a table
		
		int column = driver.findElements(By.xpath("//table[@id='countries']//tbody/tr/td/h3")).size();
		System.out.println("Tota Number of columns -> " + column);
		
		
		// Retrive the specific row/column data
		String val = driver.findElement(By.xpath("//table[@id='countries']//tr[2]/td[2]")).getText();
		System.out.println("Your Value -> " + val);
		
		// Retrive the all data from a table
		//need 2 loop. 1 is for row and 1 is for column
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=column;j++)
			{
				String data = driver.findElement(By.xpath("//table[@id='countries']//tbody/tr["+rows+"]/td["+column+"]")).getText();
				System.out.println("Your Data -> " + data);
			}
			System.out.println("");
		}

	}

}
