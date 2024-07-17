package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		//How Many rows in a Table
		// How Many Columns in a Table
		// Retrieve the specific row and column
		// Retrive all data from table
		// Print respective data
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		String url = "https://qavbox.github.io/demo/webtable/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//How Many rows in a Table
		
		int row = driver.findElements(By.xpath("//table[@id='table01']//tbody/tr")).size(); 
		System.out.println("Total Rows -> " + row);
		
		int column = driver.findElements(By.xpath("//table[@id='table01']//thead/tr/th")).size();
		System.out.println("Total Column -> " + column);
		
		//retrieve the specific row and column
		String value = driver.findElement(By.xpath("//table[@id='table01']//tbody/tr[2]/td[3]")).getText();
		System.out.println("Value is specific row col -> " + value);
		
		//retrieve all the data from table
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=column;c++)
			{
				String data = driver.findElement(By.xpath("//table[@id='table01']//tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print("Value is specific row col -> " + data + " ");
			}
			System.out.println();
		}
		
		//getting specific columns value
		
		for(int i=1;i<=row;i++)
		{
			String testing = driver.findElement(By.xpath("//table[@id='table01']//tbody/tr["+i+"]/td[2]")).getText();
			
			if(testing.equals("GUI"))
			{
				String test1 = driver.findElement(By.xpath("//table[@id='table01']//tbody/tr["+i+"]/td[3]")).getText();
				String test2 = driver.findElement(By.xpath("//table[@id='table01']//tbody/tr["+i+"]/td[4]")).getText();
				
				System.out.println(testing + " " + test1 + " " + test2 + " ");
			}
		}

	}

}
