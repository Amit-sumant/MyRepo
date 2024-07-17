package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Basics 
{
	static WebDriver driver;
	
	//1. Installed Chrome Setup
	//2. Login Method
	//3. Launch Chrome Browser
	//4. Enter URL
	//5. Google Title
	//6. Logout from app
	//7. Close Browser
	//8. Delete all Cookies
	//9. googleTitle
	
	@BeforeSuite //1
	public void setup()
	{
		System.out.println("Installed Chrome Setup");
	}
	
	@BeforeTest //2
	public void Login()
	{
		System.out.println("Login Method");
	}
	
	@BeforeClass //3
	public void launchBrowser()
	{
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("Enter URL");
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test (priority=1,groups="Title") //5
	public void googleTitle() 
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test (priority=2,groups="HomePage",dependsOnMethods = "googleTitle")
	public void verifyHomePage()
	{
		System.out.println("You are entered in Home Page");
		
		WebElement ele= driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//center//input[@class='gNO89b']"));
		System.out.println("Your First Button - " + ele.isDisplayed() );
	}
	
	@Test (priority=3,groups="Admin Page")
	public void navigatetoAdminPage()
	{
		System.out.println("Navigated to Admin page");
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//center//input[@class='gNO89b']"));
		System.out.println("Your Second Button - " + ele1 + " is " + ele1.isDisplayed());
	}
	
	@Test (priority=4,groups="Admin Page", invocationCount = 3)
	public void verifyAdminDetails()
	{
		//int i = 9/0;
		//System.out.println("Check Admin User Details" + i);
		int i=50;
		int j=80;
		int sum = i+j;
		
		System.out.println("Your Count -> " + sum);
	}
	
	@Test (priority=5,groups="Admin Page",dependsOnMethods = "verifyAdminDetails")//expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void updateAdminCredentials()
	{
		System.out.println("User Changed Admin Credentials");
		
		int i=789641326; int j=897646565;
		
		int sum=i*j;
		
		System.out.println("Expected -> " + sum);
		
		Assert.assertEquals(sum, sum,"sum matched");
		
	}
	
	@Test (priority=6,groups="Registration",invocationTimeOut = 2)
	public void navigatetoRegistration()
	{
		System.out.println("Navigated to Registration page");
		
	}
	
	@AfterMethod //6
	public void logout()
	{
		System.out.println("Logout from app");
		driver.quit();
	}
	
	
	@AfterClass //7
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies()
	{
		System.out.println("Delete all Cookies");
	}
	
	@AfterSuite
	public void generateReport()
	{
		System.out.println("Generate Test Report");

	}

}
