package com.sample.action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleSelenium 
{
	static WebDriver driver=null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 101\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit Wait example
		//WebElement we=(new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("Search")));
		//driver=(WebDriver) new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("Search")));
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id= 'txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		//WebElement wl=driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		//wl.sendKeys("Bluetooth Headphone");
		
		//driver.findElement(By.id("gh-btn")).click(); //click submit
		
		//using contains when element is dynamic
		//driver.findElement(By.xpath("//input[contains(@class,'gh-ar')]"));
		
		//apart from contains we can also use using below (starts-with and ends-with -> both are methods)
		//driver.findElement(By.xpath("//input[starts-with(@class,'gh-ar')]"));
		//driver.findElement(By.xpath("//input[ends-with(@class,'-ar-hdn')]"));
		
		//dynamic xpath for link
		//driver.findElement(By.xpath("//a[contains(text(),' Sell')]")).click();
		
		//how to find all links on a particular page
		
		/*
		 * List<WebElement> listele= driver.findElements(By.tagName("a"));
		 * System.out.println("Total Links are -> " + listele.size());
		 * 
		 * for(int i=0; i<=listele.size(); i++) { String linktext =
		 * listele.get(i).getText(); System.out.println(linktext); }
		 */
	}

}
