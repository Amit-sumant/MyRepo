package com.java.coding_5_June_2024;

import java.util.LinkedHashSet;

public class Remove_Duplicate_Character {

	public static void main(String[] args) 
	{
		String str = "aabbccddee";
		
		int len = str.length();
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<len;i++)
		{
			set.add(str.charAt(i) + "");
		}
		
		for(String chract : set)
		{
			System.out.println(chract);
		}

	}

}
