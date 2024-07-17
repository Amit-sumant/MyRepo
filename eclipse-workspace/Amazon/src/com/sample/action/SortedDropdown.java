package com.sample.action;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortedDropdown 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement ele = driver.findElement(By.name("category_id"));
		Select sel = new Select(ele);
		
		List<WebElement> getsel = sel.getOptions();
		
		//below arraylist created to store temp and original values from dropdown
		
		ArrayList temparray = new ArrayList();
		ArrayList original = new ArrayList();
		
		for(WebElement elefor : getsel)
		{
			original.add(elefor.getText());
			temparray.add(elefor.getText());
		}
		
		System.out.println("Original List" + original);
		System.out.println("Temporary List " + temparray);
		Collections.sort(temparray); //sorting // sort is a direct method
		
		System.out.println("Original List after sorting" + original);
		System.out.println("Temporary List after sorting " + temparray);
		
		if(original.equals(temparray))
		{
			System.out.println("Dropdown Sorted");
		}
		else
		{
			System.out.println("Dropdown Not Sorted");
		}

	}

}
