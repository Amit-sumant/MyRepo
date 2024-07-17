package com.java.javaScriptExecuteMethods;

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

import com.java.javaScript_util.JavaScript_Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draw_Border 
{
	private static Object object;
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
		
		WebElement logo = driver.findElement(By.xpath("//img[@title='Show products in category Electronics']"));
		JavaScript_Utility.drawBorder(logo, driver);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshot\\highlight.jpeg");
		
		FileUtils.copyFile(src, trg);
	}

}
