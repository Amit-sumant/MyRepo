package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	//By Locators
	private By emailid = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By btnLogin = By.xpath("//button[@type='submit']");
	private By frgtPassword = By.xpath("//p[text()='Forgot your password? ']");
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;// TODO Auto-generated constructor stub
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void forgotPasswordPresent()
	{
		driver.findElement(frgtPassword);
	}
	
	public void enterUserName(String username)
	{
		driver.findElement(emailid).sendKeys(username);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLogin()
	{
		driver.findElement(btnLogin);
	}

}
