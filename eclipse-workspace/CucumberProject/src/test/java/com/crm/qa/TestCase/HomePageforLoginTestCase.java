package com.crm.qa.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePageforLogin;

public class HomePageforLoginTestCase extends TestBase
{
	HomePageforLogin homelogin;
	
	public HomePageforLoginTestCase() //create a consructor //This is 1
	{
		super(); //this super keyword call your testbase class. It is compulsory to call Testbase class constructor. 
		//after this then only it navigate to next menthod i.e. initialization
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization(); //this is number 2
		//then call home page for login method here
		homelogin=new HomePageforLogin(); //and this is 3
	}
	
	//first test case
	@Test (priority = 1)
	public void loginforTitle()
	{
		homelogin.verifyHomePageLogin();
	}
	
	@Test (priority = 2, dependsOnMethods = {"loginforTitle"})
	public void validateImage()
	{
		homelogin.validateImage();
	}
	
	@Test (priority = 3)
	public void clickAccount() throws InterruptedException
	{
		homelogin.clickOnMyAcc();
	}
	
	@Ignore ("Not Yet Ready, Kindly ignore now")
	@Test
	public void ingorenow()
	{
		
	}
	
	
	@AfterMethod
	public void quitbrow()
	{
		driver.quit();
	}
	
	
}
