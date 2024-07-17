package com.sample.action;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SampleSeleniumMouseover 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 103\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit Wait example
		//WebElement we=(new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("Search")));
		//driver=(WebDriver) new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("Search")));
		
		String url = "https://freecrm.com";
		driver.get(url);
		
		/*
		 * //drag n drop functionality Actions act1=new Actions(driver);
		 * act1.clickAndHold(driver.findElement(By.xpath("//id='draggable'"))).
		 * moveToElement(driver.findElement(By.xpath("//id='droppable'"))) .release()
		 * .build() .perform();
		 */
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Login']"));
		ele.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ameet.s2012@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sriram@1981");
		WebElement ele1 = driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]"));
		ele1.click();
		System.out.println("Login Successful");
		
		actionperform();//action class
		
		Thread.sleep(1000);
		
		WebElement eleCnt = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		String str = eleCnt.getText();
		System.out.println("Your String Element is displayed as -> " + str);
		
		//now click on contact add button.
		actiononContactpage();
		
		takeascreenshot("Your first SCreenshot");
		
		driver.quit();

	}
	
	public static void actionperform()
	{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@id='main-nav']"))).release().build().perform();
	}
	public static void takeascreenshot(String fname) throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //convert driver into interface
		//2. copy screenshot and stored in desired location
		FileUtils.copyFile(file, new File("E:\\New folder\\MyRepo\\eclipse-workspace\\Amazon\\src\\com\\sample\\action\\" + fname + ".jpg"));
		
	}
	
	public static void actiononContactpage() throws InterruptedException
	{
		//now click on contact add button.
		driver.findElement(By.xpath("//i[@class='users icon']")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Abir')]")).click();
		Thread.sleep(1500);
		
		WebElement createnew = driver.findElement(By.xpath("//i[@class='edit icon']")); //click on create button on contact page
		createnew.click();
		
		/*
		 * WebElement eleContactpage =
		 * driver.findElement(By.xpath("//div[contains(text(),'Create New Contact')]"));
		 * String strcntpage = eleContactpage.getText();
		 * System.out.println("Your Page Text Name is -> " + strcntpage);
		 */
	}

}
