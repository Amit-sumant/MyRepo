package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class General_Selenium 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele=null;
		
		try
		{
			while (true)
			{
				ele = driver.findElement(By.xpath("//div[@id='CCOjioplusD']//div/img[@class='closeSummer']"));
					
			if(ele.isDisplayed())
			{
				ele.click();
				Thread.sleep(500);
			}
			
			else
				break;
			}
		}catch(Exception e)
		{
			//e.printStackTrace();
		}
		
		System.out.println("Enter into Next ");
		
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='drp1']//div/a[@class='btn-primary dropdown-toggle btn-block']"));
		ele1.click();
		
		Thread.sleep(500);
		
		List<WebElement> lst1= driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		
		for(WebElement ptype:lst1)
		{
			String strlist = ptype.getText();
			System.out.println(strlist);
			
			if(strlist.contains("FASTag"))
			{
				ptype.click();
				break;
			}
			
		}
		
		//to select next dropdown
		
		

	}
	
	public static void selectfirstDropdown(List<WebElement> options, String value)
	{
		for(WebElement opt : options)
		{
			if(opt.getText().equals(value))
			{
				opt.click();
				break;
			}
		}
	}

}
