package com.ej.slfrm.test;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverSeleniumFn 
{
	public static WebDriver driver = null;
	
	public static void getFunction()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String url = "https://www.ebay.com/";
		driver.get(url);
		
		/*
		 * driver.findElement(By.id("Login Name")).getAttribute("kl");
		 * driver.findElement(By.xpath("//input[@type='text']"));
		 * driver.findElement(By.xpath("//*[contains(@category,'tablet')]"));
		 * driver.findElement(By.xpath("//a[@href = 'http://abc.com']"));
		 * driver.findElement(By.xpath("//*[contains(@href,'google.com')]"));
		 */
		
		WebElement wl=driver.findElement(By.xpath("//input[@class='gh-ar-hdn']"));
		wl.sendKeys("bluetooth headphone");

	}
	
	public static void main(String args[])
	{
		getFunction();
	}

}
