package com.sample.action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebTable 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 103\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit Wait example
		//WebElement we=(new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("Search")));
		//driver=(WebDriver) new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("Search")));
		
		String url = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		
		Thread.sleep(1000);
		
		scrollupanddown();
		
		Thread.sleep(1000);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		System.out.println("*********Company***********");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowcnt = rows.size();
		System.out.println("Column size is -> " + rowcnt);
		
		String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath = "]/td[1]";
		
		
		
		for(int i=2; i<=rowcnt; i++)
		{
			String actualxpath = beforexpath + i +afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			
			//If you want to check particular company name at which position then write below code
			
			
			/*
			 * if(element.getText().equals("Magazzini Alimentari Riuniti")) {
			 * System.out.println("Company Name -> " + element.getText() + "is found -> " +
			 * "at position -> " + (i-1)); break; }
			 */
		}
		
		System.out.println("*********Contact***********");
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		String aftercontact = "]/td[2]";
		
		for(int i=2; i<=rowcnt; i++)
		{
			String actualxpath = beforexpath + i + aftercontact;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		}
		
		
		System.out.println("*********Country***********");
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		String aftercountry = "]/td[3]";
		
		for(int i=2; i<=rowcnt; i++)
		{
			String actualxpath = beforexpath + i + aftercountry;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		}
		
		//for each column now
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]

	}
	
	public static void scrollupanddown()
	{
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	}

}
