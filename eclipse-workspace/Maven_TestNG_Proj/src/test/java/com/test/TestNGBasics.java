package com.test;

import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics 
{
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("Setup System Property for Browser");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("User Launch Browser");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("User Login to the application");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("User Enter URL");
	}
	
	@Test
	public void getTitlePage()
	{
		System.out.println("Get Title Page");
	}
	
	@Test
	public void HomePage()
	{
		System.out.println("Navigate to Home Page");
	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println("Successfully Logout");
	}
	
	@AfterTest
	public void deleteCookies()
	{
		System.out.println("Successfully Delete Cookies");
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("Successfully Close All Browser");
	}
	
	@AfterSuite
	public void generateReport()
	{
		System.out.println("Generate Test Report");
	}

}
