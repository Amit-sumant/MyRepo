package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePageforLogin extends TestBase
{
	@FindBy(xpath="//span[contains(text(),'My Account')]") // this element for click on My Account
	WebElement homeMyacc;
	
	@FindBy(xpath="//a[contains(text(),'Login')]") // this element for click on Login
	WebElement btnLogin;
	
	@FindBy (xpath = "//img[contains(@class, 'img-responsive')]")
	WebElement imgLogo;
	
	//Initialization the page object
	public HomePageforLogin()
	{
		PageFactory.initElements(driver, this); 
		// or we can write this as well -> PageFactory.initElements(driver, HomePageforLogin.class);
		//this means current class variables which we declare above. Instead of this we can also user "HomePageforLogin.class"
		
	}
	
	//Actions
	public String verifyHomePageLogin()
	{	
		System.out.println("Title Displayed");
		return driver.getTitle();
		
	}
	
	
	/*
	 * public void newActionMethod() 
	 * { 
	 * 		//this method for call Action method Actions
	 * 		act=new Actions(driver);
	 * 		act.moveToElement(driver.findElement(By.xpath("//div[@id='main-nav']"))).
	 * 		build().perform();
	 * 
	 * }
	 */
	 
	public boolean validateImage()
	{
		return imgLogo.isDisplayed();
	}
	
	public LoginPage clickOnMyAcc() throws InterruptedException //this code for click  on My Account
	{	
		homeMyacc.click();
		Thread.sleep(3000);
		System.out.println("Button Login Displayed" + btnLogin.getAttribute("href"));
		btnLogin.click();
		Thread.sleep(3000);
		//after click on Login its navigate to credential page. However this retuen login page
		return new LoginPage();
	}

}
