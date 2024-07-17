package com.java.coding_5_June_2024;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Print_Number_of_Vowel_word_Frequency_characters 
{

	public static void main(String[] args) 
	{
		int cnt=0;
		String str = "Learn Selenium and Java";
		String s[] = str.split(" ");
		//word count, vowel count, uppercase count and Frequency of character
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i] + " " + s[i].length());
			
			characterFrequency(s[i]);
			
		}
		
		System.out.println("----Print Occurance----");
		
		//characterFrequency(str);
	}
	
	public static void vowelCount(String str, int cnt)
	{
		char ch[] = str.toLowerCase().toCharArray();
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
			}
		}
		System.out.println("Your Vowel Count - " + cnt);
	}
	
	public static void characterFrequency(String str)
	{
		
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			System.out.println(ch);
			
			if(map.get(ch)!=(null))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
		}
		System.out.println(map.toString());
		
	}

}
