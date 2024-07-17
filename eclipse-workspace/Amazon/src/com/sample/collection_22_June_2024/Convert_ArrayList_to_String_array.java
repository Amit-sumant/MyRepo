package com.sample.collection_22_June_2024;

import java.util.ArrayList;

public class Convert_ArrayList_to_String_array 
{

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<>();
		
		list.add("1");
		list.add("Rodger");
		list.add("Federer");
		list.add("Tennis");
		list.add("42");
		list.add("21");
		
		// ArrayList to String array conversion
		String[] str=new String[list.size()];
		
		for(int i=0;i<list.size();i++)
		{
			//str[i] = list.get(i);
			System.out.println(str[i] = list.get(i));
		}

	}

}