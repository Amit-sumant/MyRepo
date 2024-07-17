package com.java.New_Collection_Series;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Single_Key_Multiple_Values {

	public static void main(String[] args) 
	{
		// How to add Single Key and Multiple Values to the HashMap
		
		HashMap<String, List<String>> hashmapstr=new HashMap<String, List<String>>();
		
		//create list 1 and store value
		List<String> list1 = new ArrayList<>();
		list1.add("Mango");
		list1.add("Jamun");
		
		//create list 2 and store value
		List<String> list2 = new ArrayList<>();
		list2.add("Java");
		list2.add("Selenium");
		
		//create list 2 and store value
		List<String> list3 = new ArrayList<>();
		list3.add("Infosys");
		list3.add("Cognizant");
		
		//Now put values in Hashmap
		hashmapstr.put("A", list1);
		hashmapstr.put("B", list2);
		hashmapstr.put("C", list3);
		
		System.out.println("Hashmap -> " + hashmapstr + "\n");
		
		//iterate and display
		for(Map.Entry<String, List<String>> entry : hashmapstr.entrySet())
		{
			String str = entry.getKey();
			List<String> val = entry.getValue();
			
			System.out.println("Keys = " + str);
			System.out.println("Values = " + val);
		}

	}

}
