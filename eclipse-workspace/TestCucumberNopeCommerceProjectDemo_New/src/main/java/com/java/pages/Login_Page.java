package com.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page 
{
	private WebDriver driver;
	
	// By locators
	private By emailId = By.id("Email");
	private By password = By.id("Password");
	private By logIn = By.xpath("//button[@type='submit' and @class='button-1 login-button']");
	private By forgotPwd = By.linkText("Forgot password?");
	private By loginmainpage = By.linkText("Log in"); //this link on initial page
	private By welcomestore = By.xpath("//div[normalize-space()='Welcome to our store']");
	//private By nopcommercepage = By.xpath("//img[@alt='nopCommerce demo store']");
	
	//constructor
	public Login_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//page actions
	public String init_pageTitle()
	{
		return driver.getTitle();
	}
	
	public String Login_PageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean forgotPassword_link()
	{
		return driver.findElement(forgotPwd).isDisplayed();
	}
	
	public void clickLoginLink_Initialpage()
	{
		driver.findElement(loginmainpage).click();
	}
	
	public void enterUserName(String uname)
	{
		driver.findElement(emailId).sendKeys(uname);
	}
	
	public void enterPassword(String passwd)
	{
		driver.findElement(password).sendKeys(passwd);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(logIn).click();
	}
	
	public void userOnDemoPage()
	{
		String demoWelcome = driver.findElement(welcomestore).getText();
		System.out.println("Welcome to Demo Page - " + demoWelcome);
	}
}
