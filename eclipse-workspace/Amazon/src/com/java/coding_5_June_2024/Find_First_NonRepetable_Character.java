package com.java.coding_5_June_2024;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Find_First_NonRepetable_Character 
{

	public static void main(String[] args) 
	{
		String str = "aaabbccde";
		int val;
		int cnt=0;
		System.out.println("Current String is - >  " + str);
		
		//now find first non repetable character
		
		char ch[] = str.toCharArray();
		
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.get(ch[i])!=(null))
			{
				val = map.get(ch[i]);
				map.put(ch[i], val+1);
			}
			else
			{
				map.put(ch[i], 1);
			}
		}
		
	  //map.keySet();
		
		
		for(Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey() + " ");
			}
		}
		
		
	}

}
