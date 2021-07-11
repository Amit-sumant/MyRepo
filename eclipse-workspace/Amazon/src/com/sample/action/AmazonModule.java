package com.sample.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonModule {
	public static void sarchItem(String itemtext) {
		WebElement srch = DriverFactory.driver.findElement(AmazonLoginobjectRepository.srch);
		srch.sendKeys(itemtext);
		srch.submit();
	}
	
	public static void getAllNumberLinks() {
		//1 Identify the number of Link on webpage and assign into Webelement List 
				List<WebElement> allLinkElement = DriverFactory.driver.findElements(By.xpath("//h2"));
				//below code counts total number of link in the page
				int linkListCnt = allLinkElement.size();//size return number of element
				//Print the total count of links on webpage
				System.out.println("Total number of Link =" + linkListCnt );
	}
	
	public static void clickOnSearchResult(int searchNumber) {
		//below code click into first link
				WebElement link = DriverFactory.driver.findElements(By.xpath("//a/h2")).get(searchNumber-1);
				link.click();
	}
	
	public static void clickOnAddToCart() {
		WebElement kart = DriverFactory.driver.findElement(AmazonLoginobjectRepository.kart);
		kart.click();
		
		
	}
	public static void clickOnCheckOut() {
		//proceed to Checkout
				WebElement chkout = DriverFactory.driver.findElement(AmazonLoginobjectRepository.chkout);
				chkout.click();
	}
	
	public static void closeWindow()
	{
		DriverFactory.driver.close();
	}
}
