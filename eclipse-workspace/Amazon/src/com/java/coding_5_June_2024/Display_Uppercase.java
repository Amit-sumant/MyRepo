package com.java.coding_5_June_2024;

import java.util.HashMap;

import org.apache.poi.ss.util.SSCellRange;

public class Display_Uppercase {

	public static void main(String[] args) 
	{
		String str = "arnav ashwini sumant";
		
		String s[] = str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			String ss = s[i].substring(0, 1).toUpperCase()+s[i].substring(1);
			System.out.println(ss + " ");
		}
		
		char ch[] = str.toCharArray();
		int len = ch.length;
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<len;i=i+2)
		{
			int val;
			System.out.print(ch[i]);
			
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
		System.out.println("Your String - " + map.toString());
	}

}
