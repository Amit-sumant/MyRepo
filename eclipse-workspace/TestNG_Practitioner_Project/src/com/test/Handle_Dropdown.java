package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Dropdown 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		String str="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(str);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select dropdown without using select class
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']//h6[text()='Recruitment']"));
		System.out.println(ele.getText());
		
		//job title
		Select jobsel = new Select(driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")));

		
		//driver.quit();
		
		
		

	}

}
