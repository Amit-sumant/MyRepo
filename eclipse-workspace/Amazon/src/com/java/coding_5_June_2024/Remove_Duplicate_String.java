package com.java.coding_5_June_2024;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_Duplicate_String 
{

	public static void main(String[] args) 
	{
		String str = "aabbccdd";
		
		char ch[] = str.toCharArray();
		
		int len = ch.length;
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<len;i++)
		{
			set.add(ch[i] + " ");
		}
		
		System.out.println(set.toString());
		
		System.out.println("----------Using Loop------------");
		
		usinganotherMethod();

	}
	
	public static void usinganotherMethod()
	{
		String str = "Amit Arnav Ashwini";
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i) + "");
		}
		for(String ch : set)
		{
			System.out.print(ch + " ");
		}
	}

}
