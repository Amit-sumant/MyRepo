package com.java.New_Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Different_Ways_Creating_Map 
{
	
	public static Map<Integer, String> markMap;
	
	static
	{
		markMap = new HashMap<>();
		markMap.put(1, "Bharat");
		markMap.put(2, "Switzerland");
	}

	public static void main(String[] args) 
	{
		// 1} to create a class and declare
		
		System.out.println(Different_Ways_Creating_Map.markMap.get(1));
		System.out.println(Different_Ways_Creating_Map.markMap.get(2));

	}

}
