package com.java.Final_1_June_2024;

import java.util.Arrays;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample 
{
	public static void main(String[] args) 
	{
		String str = "Arnav";
		System.out.println("Before Sort - " + str);
		
		char ch[] = str.toLowerCase().toCharArray();
		
		Arrays.sort(ch);
		
		String sortStr = new String(ch);
		
		System.out.println("After Sort - " + sortStr);
		
		System.out.println("--------Find Vowel-------");
		
		countVowel();
	}
	
	public static void countVowel()
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		for(char c : ch)
		{
			switch(c)
			{
			case 'a': case 'A':
			case 'e': case 'E':
			case 'i': case 'I':
			case 'o': case 'O':
			case 'u': case 'U':
				
				cnt++;
				break;
				
				default:
					//System.out.println("No Vowel Present");
				
			}
		}
		System.out.println("No Of Vowel - " + cnt);
	}

}
