package com.aruba.action;

import org.openqa.selenium.By;

public class ArubaLoginObject {
	
	static By regis = By.xpath("//a[contains(text(),'REGISTER')]"); // click on register link
	
	static By firstnm = By.xpath("//input[@name='firstName']"); // first name
	static By lastnm = By.xpath("//input[@name= 'lastName']"); // last name
	static By phon = By.xpath("//input[@name= 'phone']"); // Phone
	static By email = By.xpath("//input[@id= 'userName']"); // last name
	
	//mailing information
	static By add1 = By.xpath("//input[@name='address1']");
	static By add2 = By.xpath("//input[@name='address2']");
	static By cty = By.xpath("//input[@name='city']");
	static By stet = By.xpath("//input[@name='state']");
	static By code1 = By.xpath("//input[@name='postalCode']");
	//static By cntry = By.xpath("//select[@option[@value='country']]");
	static By cntry = By.xpath("//select[@name='country']");
	
	//user info
	static By usernm = By.xpath("//input[@name='email']");
	static By pass = By.xpath("//input[@name='password']");
	static By confpass = By.xpath("//input[@name='confirmPassword']");
	
	//click submit
	static By submitbtn = By.xpath("//input[@name='register']");
	
	//click signoff
	static By signof = By.xpath("//a[contains(text(),'SIGN-OFF')]");
	//click Home
	static By home = By.xpath("//a[contains(text(),'Home')]");
}
