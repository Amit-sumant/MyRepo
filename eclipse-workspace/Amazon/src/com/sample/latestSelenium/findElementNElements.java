package com.sample.latestSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElementNElements 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		
		//below code is because of chrome ver 111 issue
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		//*************************************************
		
		WebDriver driver=new ChromeDriver(opt);
		
		String url="https://demo.nopcommerce.com/";
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/* explicit wait example */
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//WebElement elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("a")));
		
		/* explicit wait example */
		
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Sitemap')]"));
		ele.click();
		
		//select 
		/*
		 * selectByIndex
		 * selectByValue
		 * selectByVisibleText
		 */
		
		Select sel=new Select(driver.findElement(By.xpath("//*[@id='selectdropdown']")));
		sel.selectByIndex(1);
		sel.selectByValue("ABC");
		sel.selectByVisibleText("AM");
		
		//below code for how to get opetion from dropdown
		sel.getOptions();
		sel.getFirstSelectedOption();
		sel.getAllSelectedOptions();
		
		driver.close();

	}

}
