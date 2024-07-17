package com.nopecommerce.testcases;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopecommerce.qa.base.TestBase;
import com.nopecommerce.qa.pages.HomePage;
import com.nopecommerce.qa.pages.LoginPage;
import com.nopecommerce.qa.util.TestUtil;


public class LoginPage_TestCase extends TestBase
{
	LoginPage loginpage;
	TestBase homepage;
	//TestUtil testutil;
	
	public LoginPage_TestCase() throws IOException 
	{
		super(); //first this super method call then it goes to initialization
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialiazation();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void clickonLogin()
	{
		loginpage.login_link();
	}
	
	@Test(priority=3, enabled = false)
	public void loginPageTitle()
	{
		String title = loginpage.validateLoginpage();
		Assert.assertEquals(title, "Welcome to our store");
	}
	
	@Test(priority=4, enabled = false)
	public void validateImageonHome()
	{
		loginpage.validateImage();
	}
	
	@Test(priority=5, enabled = false)
	public void pageLogoValidate()
	{
		boolean img = loginpage.validateImage();
		Assert.assertTrue(img);
	}
	
	@Test(priority=2)
	public void loginApp() throws IOException, InterruptedException
	{
		homepage = loginpage.loginusername(prop.getProperty("username"), prop.getProperty("pasword"));
		//testutil.takeScreenShot("Login Page");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
