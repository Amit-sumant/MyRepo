package com.java.Final_1_June_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggest_Dropdown 
{
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> listAutodtls = driver.findElements(By.xpath("//div[@class='OBMEnb']//ul//li[@class='sbct PZPZlf']//div[@role='option']//div[@class='wM6W7d']//span"));
		
		System.out.println("Your total links - " + listAutodtls.size());
		
		Thread.sleep(1500);
		
		for(WebElement listDetails : listAutodtls)
		{
			if(listDetails.getText().contains("selenium interview questions"))
			{
				System.out.println(listDetails.getText());
				listDetails.click();
				break;
			}
		}
		
		driver.close();

	}

}
