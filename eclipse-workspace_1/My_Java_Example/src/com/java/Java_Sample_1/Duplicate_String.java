package com.java.Java_Sample_1;

import java.util.LinkedHashSet;

public class Duplicate_String 
{

	public static void main(String[] args) 
	{
		String str = "11 12 13 12 14 15 11";
		
		String str1[] = str.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i].equals(str1[j]))
				{
					System.out.println(str1[i].toString());
				}
			}
		}
		
		System.out.println("*****************");
		
		usingString();
		
		System.out.println("*****************");
		
		usingCharAt();
	}
	
	public static void usingString()
	{
		String str="Vishwanathan";
		
		//char ch[] = str.toCharArray();
		//int len = ch.length;
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
			//System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println(set.toString());
	}
	public static void usingCharAt()
	{
		String str="Vishwanathan";
		
		char ch[] = str.toCharArray();
		int len = ch.length;
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<len;i++)
		{
			set.add(ch[i]);
		}
		
		System.out.println(set.toString());
	}

}
