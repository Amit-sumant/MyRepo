package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Handle 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notification");
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
		List<WebElement> listDrop = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println(listDrop.size());
		
		selectProductValuefromDropdown(listDrop, "Life Insurance");
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='lp-sitemap ng-scope']//div[12]//ul[@class='text-left ']//li/a"));
	
		for(WebElement lists : list)
		{
			String ll = lists.getText();
			System.out.println("-> " + ll);
		}

	}
	
	public static void selectProductValuefromDropdown(List<WebElement> opt, String value)
	{
		for(WebElement list : opt)
		{
			String strList = list.getText();
			System.out.println("Your Product - " + strList);
			
			if(strList.contains(value))
			{
				list.click();
				break;
			}
		}
	}

}
