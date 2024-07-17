package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery_Dropdown 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		String str="https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/";
		driver.get(str);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		System.out.println("Your Page Opened");
		
		//selectChoiceValuesJquery(driver, "choice 1");
		selectChoiceValuesJquery(driver, "choice 1","choice 2","choice 2 1","choice 2 2","choice 2 3");
		//selectChoiceValuesJquery(driver, "all");

	}
	
	public static void selectChoiceValuesJquery(WebDriver driver, String... val) throws InterruptedException 
	{
		//List<WebElement> firstChoiceboxlist = driver.findElements(By.xpath("//div[@id='comboTree251442DropDownContainer']//li"));
		List<WebElement> firstChoiceboxlist = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//li"));
		
		for(WebElement list : firstChoiceboxlist)
		{
			System.out.println(list.getText());
		}
		
		if(!val[0].equalsIgnoreCase("all"))
		{
			for(WebElement item : firstChoiceboxlist)
			{
				String itText = item.getText();
				
				for(String value : val)
				{
					if(itText.equals(value))
					{
						item.click();
						break;
					}
				}
			}
		}
		else
		{
			try
			{
				for(WebElement item : firstChoiceboxlist)
				{
					item.click();
					Thread.sleep(500);
				}
			}
			catch(ElementNotInteractableException e)
			{
				e.getStackTrace();
			}
			
		}
	}

}
