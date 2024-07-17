package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebtable2 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		////How Many rows in a Table
		
		int rows = driver.findElements(By.xpath("//table[@id='table02']//tbody/tr")).size();
		System.out.println("Number of Rows -> " + rows);
		
		
		//number of columns
		int col = driver.findElements(By.xpath("//table[@id='table02']//thead/tr/th")).size();
		System.out.println("Number of columns -> " + col);
		
		//specific row and column
		
		WebElement sprow = driver.findElement(By.xpath("//table[@id='table02']//tbody/tr[14]/td[1]"));
		String val = sprow.getText();
		System.out.println("Value is ->" + val);
		
		/*for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				//WebElement data = driver.findElement(By.xpath("//table[@id='table02']//tbody/tr["+r+"]/td["+c+"]"));
				//String value = data.getText();
				//System.out.print("Value is ->" + value + "  " );
				
				
				
			}*/
		
		for(int r=1;r<=rows;r++)
		{
			String name = driver.findElement(By.xpath("//table[@id='table02']//tbody/tr["+r+"]/td[1]")).getText();
			
			if(name.equals("Sonya Frost"))
			{
				String position = driver.findElement(By.xpath("//table[@id='table02']//tbody/tr["+r+"]/td[2]")).getText();
				
				System.out.print("Name - " + name + " " + "Position -" + position);
			}
			
		}
		
		//Print Position and salary
		

	}

}
