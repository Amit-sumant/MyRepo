package com.sample.seleniumcodes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class copyandpaste 
{
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement enterValue= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		enterValue.sendKeys("Hi ! Welcome to Selenium");
		
		WebElement putValue = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		Actions act=new Actions(driver);
		
		//Now perform Control + A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		Thread.sleep(1000);
		
		//Now Copy Control + C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		Thread.sleep(1000);
		
		//Pressing Tab key mean to shift next text
		act.sendKeys(Keys.TAB);
		act.perform();
		
		Thread.sleep(1000);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//now compare text from both text
		
		if(enterValue.getAttribute("value").equals(putValue.getAttribute("value")))
		
				System.out.println("Text Compare");
			else
				System.out.println("Text Not Same");
		
		takescreenshot();
		
	}
	
	public static void takescreenshot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		//now store into folder
		File target=new File(".\\Screenshots\\home.png");
		FileUtils.copyFile(src, target);
	}

}
