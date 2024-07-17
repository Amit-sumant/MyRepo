package com.sample.action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeHandling 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*driver.switchTo().frame("packageListFrame"); // this is a name of frame
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@title='Packages']//li/a[@href='org/openqa/selenium/package-frame.html']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(1500);
		
		//now switch to 2nd Frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//ul[@title='Interfaces']//li/a[@href='TakesScreenshot.html']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(1500);
		
		driver.switchTo().frame("classFrame");
		String str = driver.getTitle();
		System.out.println("Your Page Title is -> " + str);
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='fixedNav']//div//li/a[contains(text(),'Deprecated')]")).click();*/
		
		//below code for frame within frame
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe); //here passing frame as a webelement
		
		Thread.sleep(1000);
		
			
		//inner frame
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Text");

	}

}
