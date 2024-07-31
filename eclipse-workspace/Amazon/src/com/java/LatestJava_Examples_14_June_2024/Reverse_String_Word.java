package com.java.LatestJava_Examples_14_June_2024;

import java.util.Scanner;

public class Reverse_String_Word 
{

	public static void main(String[] args) 
	{
		String str = "Hello Java Welcome to New Company";
		String s[] = str.split(" ");
		
		for(int i=1;i<=s.length-1;i++)
		{
			System.out.print(s[s.length-i] + " ");
		}
		
		
		reverWord();

	}
	
	public static void reverWord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		
		String str = sc.nextLine();
		System.out.println(str);
		String s[] = str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[s.length-1- i] + " ");
		}
		
	}
	

}
