package com.test.SampleJava;

import java.util.Scanner;

public class Count_Total_Num_word 
{

	public static void main(String[] args) 
	{
		// Count total number of words
		
		String str = "This is Java Selenium Course";
		
		String[] stt = str.split(" ");
		System.out.println("String are -> " + str + "-> " + stt.length);
		
		
		System.out.println("using another method");
		
		Scanner sc=new Scanner(System.in); // The System.in parameter is used to take input from the keyboard
		
		System.out.println("Enter your string");
		
		String st = sc.nextLine();
		
		int cnt=1;
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			{
				cnt = cnt +1;
			}
		}
		System.out.println(cnt);
		
		System.out.println("----------------Getting position of string------------------------");
		
		String string = "Hi This is Java Selenium Coding";
		
		String[] str1 = string.split(" ");
		
		System.out.println(str1[1]);

	}

}
