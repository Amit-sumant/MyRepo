package com.sample.action;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngannotation 
{
	//pre-requisite annotation - staring with Before
		//Test - test case
		//Post Condition annotation - starting with After annotation
	
	/*	
	Sequence as below
	
	@before suite
	@Before test
	@Before class
	@Before method
	@test
	@after method
	
	@Before method
	@test
	@after method
	
	@Before method
	@test
	@after method
	
	@after class
	@after test
	
	*/
		
		@BeforeSuite //1
		public void setUP() {
			System.out.println("Setup url");
		}
		
		@BeforeTest //2
		public void launchBrowser() 
		{
			System.out.println("Launch the Browser");
		}
		
		@BeforeClass //3
		public void login() 
		{
			System.out.println("Launch app");
		}
		
		@BeforeMethod //4
		public void launchURL()
		{
		System.out.println("Enter URL");
		}
			
		@Test (priority = 1,groups="Title")
		public void googleTile()
		{
			System.out.println("Title Displayed");
		}
		
		@Test (priority = 3)
		public void homePage()
		{
			System.out.println("Home Page");
		}
		
		@Test (priority = 2,groups="Next to Home")
		public void navigateNextPage()
		{
			System.out.println("Navigate to Next page");
		}
		
		@Test (priority = 5)
		public void navigateToNext()
		{
			System.out.println("Navigate to New page");
		}
		
		@Test (priority = 4)
		public void confirmPage()
		{
			System.out.println("Confirm page appears");
		}
		
		@AfterMethod //6
		public void logout()
		{
			System.out.println("Logout from application");
		}
		
		@AfterClass //7
		public void closeBrowser()
		{
			System.out.println("Close Browser");
		}
		
		@AfterTest //8
		public void deleteCookies()
		{
			System.out.println("Delete All Cookies man");
		}
				
		@AfterSuite
		public void generateReport()
		{
			System.out.println("Report Generated");
		}

}
