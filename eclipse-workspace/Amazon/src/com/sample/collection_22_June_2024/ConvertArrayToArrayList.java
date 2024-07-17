package com.sample.collection_22_June_2024;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList 
{

	public static void main(String[] args) 
	{
		String cities[] = {"Boston", "Dallas", "New York", "Chicago"};
		
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(cities));
		
		arrList.add("San Fransisco");
		arrList.add("Mumbai");
		arrList.add("Panjim");
		arrList.add("Pune");
		
		for(String str : arrList)
		{
			System.out.println(str);
		}

	}

}
