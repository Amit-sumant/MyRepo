package com.ej.slfrm.test;
import org.openqa.selenium.By;

public class DriverSeleniumObject 
{

	//click on User Name
	public static By userid = By.xpath("//input[@name= 'username']"); //enter user name
	//static By userid = By.cssSelector("//input[@name= 'username']"); //using CSS selector
	public static By passwd = By.xpath("//input[@name= 'pw']"); //enter password
	public static By lnbtn = By.xpath("//input[@name= 'Login']"); //press button login
}
