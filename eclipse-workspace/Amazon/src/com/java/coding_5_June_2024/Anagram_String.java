package com.java.coding_5_June_2024;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) 
	{
		String s = "CINEMA";
		String s1 = "ICEMANA";
		
		if(s.length()==s1.length())
		{
			boolean flag=false;
			char c[] = s.toCharArray();
			
			for(int i=0;i<c.length;i++)
			{
				if(s1.contains(c[i] + ""))
				{
					flag=false;
					continue;
					
				}
				else
				{
					flag = true;
					break;
				}
			}
			
			if(flag==Boolean.FALSE)
			{
				System.out.println(s + "" + s1 + "Anagram String");
			}
			
		}
		else
		{
			System.out.println(s + "" + s1 + "Not Anagram String");
		}
		
		
		diffMethod();
	}
	
	public static void diffMethod()
	{
		String str1 = "Java";
		String str2 = "avJa";
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Both String are Anagram - " + str1 + " " + str2);
		}
		else
		{
			System.out.println("Both String are not Anagram - " + str1 + " " + str2);
		}
	}
}
