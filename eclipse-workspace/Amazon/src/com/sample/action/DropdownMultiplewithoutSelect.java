package com.sample.action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMultiplewithoutSelect 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		//if there are multiple dropdown then how to select
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		//webdriver wait example
		/*WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement webwait = (WebElement) mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("a")));
		webwait.click();*/
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		Thread.sleep(2000);
		
		WebElement eleday = driver.findElement(By.xpath("//select[@name='birthday_day']")); 
		selectMultipledropdown(eleday,"7");
		
		Thread.sleep(1500);
		
		WebElement elemonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		selectMultipledropdown(elemonth,"Dec");
		
		Thread.sleep(1500);
		
		WebElement eleyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		selectMultipledropdown(eleyear,"1981");
		
		//below method calling from created generic method
		//waitForElementPresent(driver, (By) eleyear, 15);
	}
	
	public static void selectMultipledropdown(WebElement ele, String value)
	{
		Select sel=new Select(ele);
		
		List<WebElement> newdrops = sel.getOptions();
		
		for(WebElement newdrop : newdrops)
		{
			if(newdrop.getText().equals(value))
			{
				newdrop.click();
				break;
			}
		}
		
	}
	
	//generic method for webdriverwait
	/*public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout)
	{
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
		return driver.findElement(locator);
	}*/

}
