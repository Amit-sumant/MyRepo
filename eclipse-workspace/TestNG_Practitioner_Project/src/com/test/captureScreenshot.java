package com.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class captureScreenshot 
{
	static WebDriver driver;

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//full screen shot
		
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File trgfile = new File(".\\Screenshot\\homepage.jpeg");
		
		FileUtils.copyFile(srcfile,trgfile);*/
		
		//specific portion pf page
		WebElement specscrn = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File srcfile = specscrn.getScreenshotAs(OutputType.FILE);
		File trgfile = new File(".\\Screenshot\\feature_Prod.jpeg");
		
		FileUtils.copyFile(srcfile,trgfile);
	}

}
