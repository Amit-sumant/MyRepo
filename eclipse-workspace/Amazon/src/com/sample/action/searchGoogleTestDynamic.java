package com.sample.action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchGoogleTestDynamic
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 101\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://www.google.com/";
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java");
		
		Thread.sleep(2000);
		
		// here below // means total number of li
		// descendant gives you number of child
		List<WebElement> listobj=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d WggQGd'][1]"));
		
		System.out.println(listobj.size());
		
		for(int i=0; i<listobj.size(); i++)
		{
			System.out.println(listobj.get(i).getText());
			
			//now whatever list displayed we want to enter specific in search box
			if(listobj.get(i).getText().contains("java collection interview questions and answers"))
			{
				listobj.get(i).click();
				break;
			}
		}
		
		driver.close();

	}

}
