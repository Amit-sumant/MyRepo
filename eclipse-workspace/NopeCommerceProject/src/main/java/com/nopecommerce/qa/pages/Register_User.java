package com.nopecommerce.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopecommerce.qa.base.TestBase;
import com.nopecommerce.qa.util.TestUtil;

public class Register_User extends TestBase
{
	TestUtil util=new TestUtil();
	LoginPage log=new LoginPage();
	
	@FindBy(xpath="//h1[contains(text(),'Register')]")
	WebElement regisTxt;
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement radiobtn;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastname;
	
	@FindBy(name="DateOfBirthDay")
	WebElement day;
	
	@FindBy(name="DateOfBirthMonth")
	WebElement month;
	
	@FindBy(name="DateOfBirthYear")
	WebElement year;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement mailid;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement comName;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement firstPwd;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confPwd;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement btnRegis;
	
	@FindBy(xpath="//div[contains(text(),'Your registration completed')]")
	WebElement completeRegis;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement contiLogin;
	
	@FindBy(xpath="//strong[normalize-space()='Your Personal Details']")
	WebElement enterPersonaldtls;
	
	
	
	public Register_User()
	{
		System.out.println("Entered into Reg User");
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageText() // to validate text on Page
	{
		return regisTxt.getText();
	}
	
	public void selectRadioButton()
	{
		radiobtn.click();
	}
	
	public void enterRegisDetails() throws InterruptedException
	{
		firstname.sendKeys("Amit");
		lastname.sendKeys("S");
		
		//WebElement noDay = driver.findElement(By.name("DateOfBirthDay"));
		util.selectDropdownbox(day, "7");
		Thread.sleep(500);
		
		//WebElement noMonth= driver.findElement(By.name("DateOfBirthMonth"));
		util.selectDropdownbox(month, "December");
		Thread.sleep(500);
		
		//WebElement noYear= driver.findElement(By.name("DateOfBirthYear"));
		util.selectDropdownbox(year, "1981");
		Thread.sleep(500);
		
		//mailid.sendKeys(mail);
		mailid.sendKeys("as7130068@gmail.com");
		
		comName.sendKeys("ISRO");
		firstPwd.sendKeys("Sriram@1981");
		confPwd.sendKeys("Sriram@1981");
		
		Thread.sleep(1000);
		btnRegis.click();
		
	}
	
	public String validateRegistrationCompleted()
	{
		return completeRegis.getText();
	}
	
	public HomePage continueLogin() throws IOException
	{
		contiLogin.click();
		
		try 
		{
			log.loginusername("as7130068@gmail.com","Sriram@1981");
		} 
		catch (IOException | InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new HomePage();
	}
	
	public String enterPersonalDetails()
	{
		return enterPersonaldtls.getText();
	}
	

}
