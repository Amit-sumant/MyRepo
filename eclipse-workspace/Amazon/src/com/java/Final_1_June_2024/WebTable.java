package com.java.Final_1_June_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable 
{
	public static void main(String[] args) 
	{
		//Object obj=null;
		getMyName(null);
	}
	
	public static void getMyName(Object e)
	{
		System.out.println("This is first Method");
	}
	
	public static void getMyName(String s)
	{
		System.out.println("This is Second Method");
	}
}
