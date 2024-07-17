package com.java.Basic_To_End;

import java.util.Scanner;

public class Count_Words_in_a_String {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		
		String str = sc.nextLine();
		
		int cnt=1;
		
		for(int i=0;i<str.length()-1;i++)
		{
			if( (str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				cnt++;
			}
		}
		
		System.out.println("Your Staing Count -> " + cnt);
		
		//------------------------------------------------------------------------------------------
		
		System.out.println("--------How To Count Occurrences of a Character in a String------------");
		
		
		String s = "Welcome to Infosys Amit";
		int totalcnt = s.length();
		
		int aftercnt = s.replace("i", "").length();
		
		int count = totalcnt - aftercnt;
		
		System.out.println(count);
		
		//------------------------------------------------------------------------------------------
		
		System.out.println("--------Java Program to count the total number of characters in a string------------");
		
		String scharat = "Hello This is Java Selenium Batch";
		
		int cnt1=0;
		
		for(int j=0;j<scharat.length();j++)
		{
			if(scharat.charAt(j)!=' ')
			{
				cnt1++;
			}
		}
		
		System.out.println("Your total character of a String -- " + cnt1);

	}

}
