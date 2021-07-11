package com.sample.action;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Window;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonDemo {

	public static void main(String[] args) throws AWTException {



		//now click on addcart
		//WebElement link1 = driver.findElement(AmazonLoginobjectRepository.link1);
		//link1.click();



		//below code scroll down the page
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,1000)", "");


		//below code to act on sign in button and click
		/*Actions act1 = new Actions(driver);
		act1.moveToElement(driver.findElement(AmazonLoginobjectRepository.act1)).click().build().perform();

		WebElement act2 = driver.findElement(AmazonLoginobjectRepository.act2);
		act2.click();

		try 
		{
			File fl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fl, new File("C:\\Users\\mypc\\Desktop\\ss\\ss.jpg"));
		}catch(Exception e) 
		{
			e.printStackTrace();
		}

		//below code for create account

		WebElement urnme = driver.findElement(AmazonLoginobjectRepository.urnme);
		urnme.sendKeys("Dhananjay");

		WebElement mobNumber = driver.findElement(AmazonLoginobjectRepository.mobNumber);
		mobNumber.sendKeys("9130005309");

		WebElement cont = driver.findElement(AmazonLoginobjectRepository.cont);
		cont.click();*/
	}
	@BeforeMethod
	public void setup()
	{
		DriverFactory.getDriver();
		DriverFactory.driver.get("https://www.amazon.in");
	}
	
	@AfterMethod
	public void testMethod()
	{
		AmazonModule.clickOnAddToCart();
		AmazonModule.clickOnCheckOut();
		AmazonModule.closeWindow();
		
		AmazonSpeaker.clickOnAddToCart();
		AmazonSpeaker.clickOnCheckOut();
		AmazonSpeaker.closeWindow();
	}
	
	@Test
	public void testcase1() {

		AmazonModule.sarchItem("Tennis Racquet");
		AmazonModule.getAllNumberLinks();
		AmazonModule.clickOnSearchResult(1);
	}

	@Test
	public void testcase2() {
		AmazonModule.sarchItem("Cricket bat");
		AmazonModule.getAllNumberLinks();
		AmazonModule.clickOnSearchResult(3);
		
	}
	@Test
	public void testcase3()
	{
		AmazonSpeaker.searchSpeaker("jbl bluetooth portable speakers");
		AmazonSpeaker.getAllSpeaker();
		AmazonSpeaker.clickonLink(14);
	}
}
