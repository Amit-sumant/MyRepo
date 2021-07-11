package com.sample.action;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginobjectRepository {
	
	
	static By srch = By.xpath("//input[@id='twotabsearchtextbox']");
	static By link = By.xpath("//h2[text()= 'HRS Spidexx Junior Series Aluminium Tennis Racquet']");
	
	//static By link1 = By.xpath("//input[id='add-to-cart-button']"); // add to cart
	static By kart = By.xpath("//input[@name='submit.add-to-cart']");
	static By chkout = By.xpath("//a[contains(text(),'Proceed to checkout')]"); // checkout button
	
	static By createNewAcc = By.xpath("//a[contains(text(),'Create your Amazon account')]"); //to click to create new account
	
	static By act = By.xpath("//span[text()='Hello. Sign in']"); // this is action class and return span text
	static By act1 = By.xpath(("//span[text()='Sign in']"));
	
	static By act2 = By.xpath("//a[@id='createAccountSubmit']");
	
	static By urnme = By.xpath("//input[@name='customerName']");
	static By mobNumber = By.xpath("//input[@id='ap_phone_number']");
	
	static By cont = By.xpath("//input[@id='continue']");
	

}
