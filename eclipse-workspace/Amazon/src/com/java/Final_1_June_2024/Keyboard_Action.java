package com.java.Final_1_June_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Action 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		WebElement text1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement text2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		text1.sendKeys("Hello This is Selenium");
		
		Actions act=new Actions(driver);
		
		//Ctrl A means select 
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Ctrl C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Now press Tab button
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//Now Ctrl V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//compare text
		if(text1.getAttribute("value").equals(text2.getAttribute("value")))
		{
			System.out.println("Text Copied " + text1.getText());
		}
		else
		{
			System.out.println("Text Not Copied " + text1.getText());
		}
		

	}

}
