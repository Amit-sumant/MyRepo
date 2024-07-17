package com.sample.action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jQueryDropDownHandle 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("justAnInputBox")).click();
		selectChoiceValue(driver, "choice 2","choice 2 1","choice 2 2");
		Thread.sleep(1000); 
		driver.findElement(By.xpath("(//span[@class='comboTreeArrowBtnImg'])[1]")).click();
		
		Thread.sleep(1500); 
		
		driver.findElement(By.id("justAnInputBox1")).click();
		selectChoiceValue(driver, "choice 7");
		driver.findElement(By.xpath("(//span[@class='comboTreeArrowBtnImg'])[2]")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("justAnotherInputBox")).click();
		selectChoiceValue(driver, "all");
		
		 
		
		
	}
	
	public static void selectChoiceValue(WebDriver driver, String... val) //... hold all values
	{
		List<WebElement> drop1= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!val[0].equalsIgnoreCase("all"))
		{
			for(WebElement ele:drop1)
			{
				String str= ele.getText();
				
				for(String value : val)
				{
					if(str.equals(value))
					{
						ele.click();
						break;
					}
				}
				
			}
		}
		
		else
		{
			for(WebElement item:drop1)
			{
				item.click();
			}
		}
	}

}
