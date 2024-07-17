package com.nopecommerce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopecommerce.qa.base.TestBase;
import com.nopecommerce.qa.pages.HomePage;
import com.nopecommerce.qa.pages.LoginPage;
import com.nopecommerce.qa.pages.Register_User;

import junit.framework.Assert;

public class Register_Testcase extends TestBase
{

	LoginPage loginpage;
	HomePage homepage;
	Register_User reguser;
	
	public Register_Testcase()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialiazation();
		loginpage = new LoginPage();
		reguser = new Register_User();
		
		loginpage.loginusername(prop.getProperty("username"), prop.getProperty("pasword"));
		
		
	}
	
	@Test(priority=1)
	public void clickonRegislink() throws InterruptedException
	{
		String personaldtls = reguser.enterPersonalDetails();
		org.testng.Assert.assertEquals(personaldtls, "Your Personal Details");
		System.out.println(personaldtls);
		
		String regtitle = reguser.validatePageText();
		org.testng.Assert.assertEquals(regtitle, "Register");
	}
	
	@Test(priority=2)
	public void selRadioButton()
	{
		reguser.selectRadioButton();
	}
	
	@Test(priority=3)
	public void enterDetails() throws InterruptedException
	{
		reguser.enterRegisDetails();
	}
	
	@Test(priority=4)
	public void userRegistered()
	{
		String valid = reguser.validateRegistrationCompleted();
		org.testng.Assert.assertEquals(valid, "Your registration completed");
	}
	
	@Test(priority=5)
	public void loginAfterRegis() throws IOException, InterruptedException
	{
		homepage = (HomePage) loginpage.loginusername(prop.getProperty("username"), prop.getProperty("pasword"));
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
}
