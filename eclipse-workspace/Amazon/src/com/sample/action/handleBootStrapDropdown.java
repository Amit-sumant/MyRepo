package com.sample.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleBootStrapDropdown {
	
	static WebDriver driver;

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 103\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url = "https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_12";
		driver.get(url);
		

	}

}
