package com.java.Final_1_June_2024;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicate_String {

	public static void main(String[] args) 
	{
		String str = "Arnav";
		String s = str.toLowerCase();
		System.out.println(s);
		
		Arrays.stream(s.split("")).distinct().forEach(i->System.out.println(i));
		
		//-----------------------------------------------------------------------
		System.out.println("This is using Set");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		
		String str1 = sc.next();
		String lowString = str1.toLowerCase();
		System.out.println(lowString);
		
		char ch[] = lowString.toCharArray();
		int len = ch.length;
		
		HashSet<String> hashset=new HashSet<>();
		
		for(int i=0;i<len;i++)
		{
			hashset.add(ch[i] + "");
		}
		
		System.out.println(hashset.toString());
		
		//-----------------------------------------------------------------------
				System.out.println("This is using StringBuffer");
				
				removeDuplicate();

	}
	
	public static String removeDuplicate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		
		String sstr = sc.next();
		String s1 = sstr.toLowerCase();
		System.out.println(s1);
		
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
				
		}
		System.out.println(sf);
		return sf.toString();
	}

}
