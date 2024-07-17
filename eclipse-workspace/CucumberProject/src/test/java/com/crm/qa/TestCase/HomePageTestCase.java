package com.crm.qa.TestCase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomePageforLogin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utility.TestUtil;

public class HomePageTestCase extends TestBase
{
	LoginPage lp;
	HomePageforLogin homepageforlogin;
	TestUtil testutil;
	HomePage homepage;
	
	public HomePageTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		homepageforlogin = new HomePageforLogin(); //this is our first page 
			
		lp=homepageforlogin.clickOnMyAcc(); //second page is login page, hence we are calling this page here
		homepage = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyUserNameTest()
	{
		
		  String homepageTitle = homepage.validatePage();
		  Assert.assertEquals(homepageTitle, "My Account");
		 
	}
	
	@Test(priority=2)
	public void createNewAddress() throws IOException, InterruptedException
	{
			homepage = new HomePage();
			homepage.homepageAction();
			
	}
	
	@Test(enabled=true, priority=3)
	public void verifyAddressbookPage() //this title check after click on back button i.e. My Account page
	{
		String addBookpage =  homepage.validateAddressbookPage(); 
		Assert.assertEquals(addBookpage, "My Account");
	}
	
	@AfterMethod
	public void CRMClose()
	{
		driver.quit();
	}

}
