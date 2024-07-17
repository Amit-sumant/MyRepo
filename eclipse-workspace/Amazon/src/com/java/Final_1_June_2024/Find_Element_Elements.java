package com.java.Final_1_June_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Find_Element_Elements 
{
	static WebDriver driver;

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		/*ChromeDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);*/
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new EdgeDriver(opt);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(ele.getText());
		
		List<WebElement> lstURL = driver.findElements(By.xpath("//div[@class='footer-upper']//ul//li"));
		System.out.println(lstURL.size());
		
		for(WebElement element : lstURL)
		{
			System.out.println(element.getText());
		}
		
		driver.close();

	}

}
