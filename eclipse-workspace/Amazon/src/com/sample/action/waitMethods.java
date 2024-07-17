package com.sample.action;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitMethods {
	
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		// ChromeDriver driver = new ChromeDriver(chromeOptions);
		//driver = new ChromeDriver();
		 driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By eleloc = By.xpath("//h3[text()='Selenium Webdriver']");
		waitforFluentWaitMethod(driver, eleloc);
		
	}
	
	public static WebElement waitforFluentWaitMethod(WebDriver driver, final By locator)
	{
		//below part is called fluent class declaration
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		
		WebElement element= mywait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(locator);
			}
		});

		return element;
		
	}

}
