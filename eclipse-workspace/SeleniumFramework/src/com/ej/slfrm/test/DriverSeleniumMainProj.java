package com.ej.slfrm.test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DriverSeleniumMainProj 
{
	public static void loginpage() //enter user name and password
	{
		WebElement usrid = DriverSeleniumFn.driver.findElement(DriverSeleniumObject.userid);
		usrid.click();
		
		WebElement passwd = DriverSeleniumFn.driver.findElement(DriverSeleniumObject.passwd);
		passwd.click();
		
		WebElement sndbx = DriverSeleniumFn.driver.findElement(DriverSeleniumObject.lnbtn);
		sndbx.click();
	}


}
