package com.nopecommerce.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopecommerce.qa.base.TestBase;
import com.nopecommerce.qa.util.TestUtil;

public class LoginPage extends TestBase
{
	TestUtil testutil;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]") // Log in link
	WebElement loginlink;
	
	@FindBy(xpath="//div[@class='topic-block-title']//h2[contains(text(),'Welcome to our store')]") // get text
	WebElement pagetext;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='buttons']//button[@type='submit']") //click submit
	WebElement submitbtn;
	
	@FindBy(xpath="//img[@alt='nopCommerce demo store']")// image check
	WebElement imgCheck;
	
	@FindBy(xpath="//div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")
	WebElement errMessage;
	
	@FindBy(xpath="//div[@class='header-links']//li/a[contains(text(),'Register')]")
	WebElement regislink;
	
	

	public LoginPage()
	{
		// TODO Auto-generated constructor stub
		//super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void login_link()
	{
		loginlink.click();
	}
	
	public String validateLoginpage()
	{
		return pagetext.getText();
	}
	
	public boolean validateImage()
	{
		return imgCheck.isDisplayed();
	}
	
	public TestBase loginusername(String uname, String passwd) throws IOException, InterruptedException
	{
		loginlink.click();
		Thread.sleep(1000);
		
		emailid.sendKeys(uname);
		Thread.sleep(1000);
		
		password.sendKeys(passwd);
		Thread.sleep(1000);
		
		submitbtn.click();
		
		if(errMessage.isDisplayed())
		{
			String loginerrormsg = errMessage.getText();
			System.out.println(loginerrormsg);
			
			if(errMessage.getText().contains(loginerrormsg))
			{
				//regislink.click();
				//Thread.sleep(1000);
				
				return new Register_User();
			}
			
		}
		
		return new HomePage();
	}

}
