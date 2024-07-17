package com.sample.latestSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Dropdown 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();
		
		//below code is because of chrome ver 111 issue
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		//*************************************************
		
		WebDriver driver=new ChromeDriver(opt);
		
		String url="https://www.orangehrm.com/contact-sales/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement e1 = driver.findElement(By.xpath("//select[@id='Form_getForm_NoOfEmployees']"));
		selectElement(e1, "101 - 150");
		
		WebElement e2 = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		selectElement(e2, "Australia");
		//without using select method	

	}
	
	public static void selectElement(WebElement ele1, String val)
	{
		Select sel = new Select(ele1);
		
		List<WebElement> lstelement = sel.getOptions();
		
		for(WebElement titile : lstelement)
		{
			if(titile.getText().equals(val));
			{
				titile.click();
				break;
			}
			
		}
	}

}
