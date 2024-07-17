package com.sample.action;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxesSelect {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select all checkboxes
		List<WebElement> chekbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Your checkbox size for day are -> " + chekbox.size());
		
		/*
		 * for(int i=0; i<=chekbox.size(); i++) { chekbox.get(i).click();
		 * 
		 * }
		 */
		//select any 3 check boxes
		/*for(WebElement chk : chekbox)
		{
			String checkboxweek = chk.getAttribute("id");
			
			if(checkboxweek.equals("monday") || checkboxweek.equals("wednesday") || checkboxweek.equals("friday"))
			{
				chk.click();
				
			}System.out.println("Value Printed");
		}*/
		
		//select last 2 checkboxes
		// here formula is there are 7 chkbx, then if we want to select last 2 then 7-2 = 5
		//thats why first we get size and store in int variable. and after use below logic
		
		int totalcheckbox = chekbox.size();
		
		/*for(int i=totalcheckbox-2; i<totalcheckbox; i++)
		{
			chekbox.get(i).click();
		}*/
		
		//select first 2 checkboxes
		// here formula is there are 7 chkbx, then if we want to select first 2 then 1 2 3 4 5 6 7 
		//thats why first we get size and store in int variable. and after use below logic
		
		for(int i=0; i<totalcheckbox; i++)
		{
			if(i<3)
			{
				chekbox.get(i).click();
				Thread.sleep(1500);
			}
		}
				

	}

}
  