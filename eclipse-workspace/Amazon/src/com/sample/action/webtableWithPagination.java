package com.sample.action;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtableWithPagination 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='input-username']")).clear();
		WebElement name = driver.findElement(By.xpath("//input[@id='input-username']"));
		name.sendKeys("demo");
		
		driver.findElement(By.xpath("//input[@id='input-password']")).clear();
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.sendKeys("demo");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(2000);
		
		//Multiple window handle
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String ParentID = it.next();
		System.out.println("Parent Id -" + ParentID);
		
		String ChildID = it.next();
		System.out.println("Child id - " + ChildID);
		
		//switch
		driver.switchTo().window(ChildID);
		
		System.out.println("Your Text is -> " + driver.getTitle());
		
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		driver.switchTo().window(ParentID);
		
		System.out.println("Parent Title -" + driver.getTitle());
		
		//above for multiple window code
		
		
		//go to sales
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		
		driver.findElement(By.xpath("//li[@class='active']//a[contains(text(),'Orders')]")).click();
		
			
		String str1=driver.getTitle();
		System.out.println("Your Page Title is -> " + str1);
		
		//below code to return the text displayed
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);
		
		//Now we need to only display 2 number from "Showing 1 to 10 of 12 (2 Pages)". So need to use below logic
		//text.subString and text.indexOf these 2 method to use above logic
		
		/*text.indexOf("("); 
		text.indexOf("Pages");
	
		//+1 because index start from 0 and we need to first i.e. 2. Same for Page
		int pages = Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println("Total Number of pages - " + pages);
		
		int prodlist = driver.findElements(By.xpath("//div[@class='product-thumb']/div/a")).size();
		System.out.println("Total Product available on this page -> " + prodlist);
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='product-thumb']/div/a"));
		
		for(WebElement element : ele)
		{
			System.out.println(element.getText());
		}*/
		
	}

}
