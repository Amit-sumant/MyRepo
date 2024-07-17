package com.java.Final_1_June_2024.JavaScript_Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript_Utility 
{

	public static void drawBorder(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", ele);
	}
	
	public static String getTitleJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void clickElementbyJS(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",ele);
	}
	
	public static void generateAlert(String msg, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+ msg + "')");
	}

}
