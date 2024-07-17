package com.java.LatestJava_Examples_14_June_2024;

import java.util.Arrays;

public class Print_Alternate_String {

	public static void main(String[] args) 
	{
		printAlternate();
		
		printAlternateString();

	}
	
	public static void printAlternate()
	{
		String str="This is Java";
		int len = str.length();
		System.out.println(len);
		
		for(int i=0;i<len;i=i+2)
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
	}
	
	public static void printAlternateString()
	{
		String str = "edcba"; //O/P - Arnav Ashwini
		
		char ch[] = str.toLowerCase().toCharArray();
		System.out.println("Your String Now - " + str);
		Arrays.sort(ch);
		
		String st=new String (ch);
		System.out.println(st);
				
	}
	
	

}
