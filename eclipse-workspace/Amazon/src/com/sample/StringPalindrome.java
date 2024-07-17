package com.sample;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		
		String str=sc.next();
		String orgstring=str;
		
		String rev="";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Your string length is -> " + len);
		
		if(orgstring.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}

	}

}
