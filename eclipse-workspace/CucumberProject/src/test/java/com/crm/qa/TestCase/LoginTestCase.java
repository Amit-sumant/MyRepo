package com.crm.qa.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomePageforLogin;
import com.crm.qa.pages.LoginPage;

public class LoginTestCase extends TestBase
{
	LoginPage lp;
	HomePage homepage;
	HomePageforLogin homepageforlogin;
	//create constructor and then call parent class using super keyword i.e. TestBase
	
	public LoginTestCase() 
	{
		// here to create constructor and user "super" keyword.
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		//System.out.println("This initialization called");
		initialization();
		lp=new LoginPage();
	}
	
	@Test(priority = 1)
	public void LoginPageTestCase1()
	{
		String title = lp.validateLoginPage();
		System.out.println(title);
		//Assert.assertEquals(title, "Account Login");
		Assert.assertEquals(title, "Your Store");
	}
	
	@Test(priority = 2)
	public void LoginCase() throws InterruptedException
	{
		homepageforlogin = new HomePageforLogin();
		
		homepageforlogin.clickOnMyAcc();
		homepage = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}	
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
	}

}
