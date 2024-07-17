package com.test.Java_17_June_2024;

import java.util.ArrayList;

public class Vowels_Words_Character_Frequency_in_String 
{

	public static void main(String[] args) 
	{
		//String str = "Learn Java Selenium and SQL";
		
		//getWordVowelCount();
		
		wordFrequency();

	}
	
	public static void getWordVowelCount()
	{
		ArrayList<String> arlist=new ArrayList<>();
		
		arlist.add("Red");
		arlist.add("Green");
		arlist.add("Black");
		arlist.add("Blue");
		arlist.add("Purple");
		
		System.out.println("Your List -> " + arlist);
		
		int ele = arlist.size();
		
		for(int i=0;i<ele;i++)
		{
			System.out.println(arlist.get(i));
		}
	}
	
	public static void wordFrequency()
	{
		int num=789546;
		int even_num=0;
		int odd_num=0;
		int rem=0;
		
		while(num>0)
		{
			rem = num%10; // this is reminder. so return 6 4 5 like wise
			
			if(rem%2==0)
			{
				even_num++;
			}
			else
			{
				odd_num++;
			}
			num=num/10;
			
		}
		
		System.out.println("Your Even Count is - " + even_num);
		System.out.println("Your Even Count is - " + odd_num);
	}

}
