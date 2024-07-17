package com.sample.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithoutSelect 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		//select value from dropdown without using select methods
		WebElement dropCountry = driver.findElement(By.id("input-country"));
		//drop.click();
		
		Select dropElement=new Select(dropCountry);
		//there is a method getOptions()
		
		List<WebElement> lists = dropElement.getOptions();
		
		for(WebElement list : lists)
		{
			if(list.getText().equals("India"))
			{
				list.click();
				System.out.println(list);
				break;
			}
		}

	}

}
