package com.crm.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;


public class LoginPage extends TestBase
{
	// Page Factory...using below method no need to declare full locator
	
	@FindBy(xpath="//input[@id='input-email']") // enter email id
	WebElement userEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement userPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLog;


	//below method for initializing page factory object which defined above
	public LoginPage()
	{
		PageFactory.initElements(driver, this); //driver coming from TestBase class
		System.out.println("Enter to Credentials page");
		//"this" means pointing to the current class object. instead of this we can also write LoginPage.class
	}
	
	//Action
	public String validateLoginPage()
	{
		return driver.getTitle();
	}
	
	public HomePage Login(String uname, String passwd) throws InterruptedException //this method returning home page hence return home page
	{
		userEmail.sendKeys(uname);
		Thread.sleep(1000);
		userPassword.sendKeys(passwd);
		Thread.sleep(1000);
		btnLog.click();
		
		return new HomePage();
	}

}
