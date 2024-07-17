package com.java.coding_5_June_2024;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Duplcate_Characters {

	public static void main(String[] args) 
	{
		String str = "Vishwanath";
		
		String s = str.toLowerCase();
		System.out.println(s);
		
		char c[] = s.toCharArray();
		int len = c.length;
		System.out.println(len);
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(int i=0; i<len;i++)
		{
			System.out.println(c[i]);
			int val;
			if(map.get(c[i])!=(null)) 
			{
				val = map.get(c[i]);
				map.put(c[i], val+1);
			}
			else
			{
				map.put(c[i], 1);
			}
		}
		
		System.out.println(map.toString());
		
		Set<Character> it = map.keySet();
		
		for(Character key : it)
		{
			if(map.get(key)>1)
			{
				System.out.println(key + " - " + map.get(key));
			}
		}
		
		System.out.println("-------------Using Scanner-----------------");
		
		//printChar();
		
		occuranceString();
	}
	
	public static void printChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		
		String str = sc.next();
		
		str.toLowerCase();
		
		//String str1[] = str.split(" ");
		char ch[] = str.toCharArray();
		int len1 = str.length();
		
		Map<Character, Integer> map1=new HashMap<>();
		
		for(int j=0;j<len1;j++)
		{
			System.out.println(ch[j]);
			
			if(map1.get(ch[j])!=null)
			{
				int value = map1.get(ch[j]);
				map1.put(ch[j], value+1);
			}
			else
			{
				map1.put(ch[j], 1);
			}
		}
		
		System.out.println(map1.toString());
	}
	
	public static void occuranceString()
	{
		int val;
		String str = "This is my is my house";
		
		String str1[] = str.split(" ");
			
		LinkedHashMap<String, Integer> linked=new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<str1.length;i++)
		{
			//char ch[] = str.toCharArray();
			
			if(linked.get(str1[i])!=(null))
			{
				val = linked.get(str1[i]);
				linked.put(str1[i], val+1);
			}
			else
			{
				linked.put(str1[i], 1);
			}
		}
		
		System.out.println(linked.toString());
	}
	

}
