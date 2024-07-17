package com.ej.slfrm.test;

import org.openqa.selenium.By;

public class eg {
	
	//driver.findElement(By.id("Login Name")).getAttribute("kl");
	driver.findElement(By.xpath("//input[@type='text']"));
	driver.findElement(By.xpath("//*[contains(@category,'tablet')]"));
	driver.findElement(By.xpath("//a[@href = 'http://abc.com']"));
	driver.findElement(By.xpath("//*[contains(@href,'google.com')]"));
	
	

}
